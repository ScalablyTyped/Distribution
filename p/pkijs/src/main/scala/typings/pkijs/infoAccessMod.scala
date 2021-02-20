package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoAccessMod {
  
  @JSImport("pkijs/src/InfoAccess", JSImport.Default)
  @js.native
  class default () extends InfoAccess {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/InfoAccess", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/InfoAccess", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/InfoAccess", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait InfoAccess extends StObject {
    
    var accessDescriptions: js.Array[typings.pkijs.accessDescriptionMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object InfoAccess {
    
    @scala.inline
    def apply(
      accessDescriptions: js.Array[typings.pkijs.accessDescriptionMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): InfoAccess = {
      val __obj = js.Dynamic.literal(accessDescriptions = accessDescriptions.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[InfoAccess]
    }
    
    @scala.inline
    implicit class InfoAccessMutableBuilder[Self <: InfoAccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessDescriptions(value: js.Array[typings.pkijs.accessDescriptionMod.default]): Self = StObject.set(x, "accessDescriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessDescriptionsVarargs(value: typings.pkijs.accessDescriptionMod.default*): Self = StObject.set(x, "accessDescriptions", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
