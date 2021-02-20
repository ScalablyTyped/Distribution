package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessDescriptionMod {
  
  @JSImport("pkijs/src/AccessDescription", JSImport.Default)
  @js.native
  class default () extends AccessDescription {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AccessDescription", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/AccessDescription", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/AccessDescription", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait AccessDescription extends StObject {
    
    var accessLocation: default = js.native
    
    var accessMethod: String = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object AccessDescription {
    
    @scala.inline
    def apply(
      accessLocation: default,
      accessMethod: String,
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): AccessDescription = {
      val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[AccessDescription]
    }
    
    @scala.inline
    implicit class AccessDescriptionMutableBuilder[Self <: AccessDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessLocation(value: default): Self = StObject.set(x, "accessLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessMethod(value: String): Self = StObject.set(x, "accessMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
