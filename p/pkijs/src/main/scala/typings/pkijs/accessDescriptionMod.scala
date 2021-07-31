package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessDescriptionMod {
  
  @JSImport("pkijs/src/AccessDescription", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AccessDescription {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var accessLocation: default = js.native
    
    /* CompleteClass */
    var accessMethod: String = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AccessDescription", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait AccessDescription extends StObject {
    
    var accessLocation: default
    
    var accessMethod: String
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
