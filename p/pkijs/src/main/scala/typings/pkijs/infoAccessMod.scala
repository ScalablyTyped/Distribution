package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoAccessMod {
  
  @JSImport("pkijs/src/InfoAccess", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with InfoAccess {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var accessDescriptions: js.Array[typings.pkijs.accessDescriptionMod.default] = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/InfoAccess", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait InfoAccess extends StObject {
    
    var accessDescriptions: js.Array[typings.pkijs.accessDescriptionMod.default]
    
    def fromSchema(schema: js.Any): Unit
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object InfoAccess {
    
    inline def apply(
      accessDescriptions: js.Array[typings.pkijs.accessDescriptionMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): InfoAccess = {
      val __obj = js.Dynamic.literal(accessDescriptions = accessDescriptions.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[InfoAccess]
    }
    
    extension [Self <: InfoAccess](x: Self) {
      
      inline def setAccessDescriptions(value: js.Array[typings.pkijs.accessDescriptionMod.default]): Self = StObject.set(x, "accessDescriptions", value.asInstanceOf[js.Any])
      
      inline def setAccessDescriptionsVarargs(value: typings.pkijs.accessDescriptionMod.default*): Self = StObject.set(x, "accessDescriptions", js.Array(value :_*))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
