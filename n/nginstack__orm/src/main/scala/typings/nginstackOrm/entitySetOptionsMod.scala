package typings.nginstackOrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySetOptionsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/orm/lib/EntitySetOptions", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EntitySetOptions {
    
    /* CompleteClass */
    var fields: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean]) = js.native
    
    /* CompleteClass */
    var modelDef: Any = js.native
    
    /* CompleteClass */
    var userKey: Double = js.native
  }
  @JSImport("@nginstack/orm/lib/EntitySetOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EntitySetOptions extends StObject {
    
    var fields: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean])
    
    var modelDef: Any
    
    var userKey: Double
  }
  object EntitySetOptions {
    
    inline def apply(fields: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean]), modelDef: Any, userKey: Double): EntitySetOptions = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], modelDef = modelDef.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntitySetOptions]
    }
    
    extension [Self <: EntitySetOptions](x: Self) {
      
      inline def setFields(value: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean])): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsFunction1(value: /* arg0 */ Any => Boolean): Self = StObject.set(x, "fields", js.Any.fromFunction1(value))
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setModelDef(value: Any): Self = StObject.set(x, "modelDef", value.asInstanceOf[js.Any])
      
      inline def setUserKey(value: Double): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    }
  }
}
