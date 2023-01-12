package typings.nginstackOrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntitySetOptionsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/orm/lib/EntitySetOptions", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EntitySetOptions {
    
    /* CompleteClass */
    var fields: js.Array[String] | (js.Function1[/* arg0 */ Field, Boolean]) = js.native
    
    /* CompleteClass */
    var modelDef: ModelDef = js.native
    
    /* CompleteClass */
    var userKey: Double = js.native
  }
  @JSImport("@nginstack/orm/lib/EntitySetOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EntitySetOptions extends StObject {
    
    var fields: js.Array[String] | (js.Function1[/* arg0 */ Field, Boolean])
    
    var modelDef: ModelDef
    
    var userKey: Double
  }
  object EntitySetOptions {
    
    inline def apply(
      fields: js.Array[String] | (js.Function1[/* arg0 */ Field, Boolean]),
      modelDef: ModelDef,
      userKey: Double
    ): EntitySetOptions = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], modelDef = modelDef.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntitySetOptions] (val x: Self) extends AnyVal {
      
      inline def setFields(value: js.Array[String] | (js.Function1[/* arg0 */ Field, Boolean])): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsFunction1(value: /* arg0 */ Field => Boolean): Self = StObject.set(x, "fields", js.Any.fromFunction1(value))
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setModelDef(value: ModelDef): Self = StObject.set(x, "modelDef", value.asInstanceOf[js.Any])
      
      inline def setUserKey(value: Double): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    }
  }
  
  type Field = typings.nginstackEngine.libClassdefFieldMod.^
  
  type ModelDef = typings.nginstackEngine.libClassdefModelDefMod.^
}
