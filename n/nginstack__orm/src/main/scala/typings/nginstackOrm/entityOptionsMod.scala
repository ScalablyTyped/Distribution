package typings.nginstackOrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityOptionsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/orm/lib/EntityOptions", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EntityOptions {
    
    /* CompleteClass */
    var create: Boolean = js.native
    
    /* CompleteClass */
    var fields: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean]) = js.native
    
    /* CompleteClass */
    var modelDef: Any = js.native
    
    /* CompleteClass */
    var userKey: Double = js.native
  }
  @JSImport("@nginstack/orm/lib/EntityOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EntityOptions extends StObject {
    
    var create: Boolean
    
    var fields: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean])
    
    var modelDef: Any
    
    var userKey: Double
  }
  object EntityOptions {
    
    inline def apply(
      create: Boolean,
      fields: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean]),
      modelDef: Any,
      userKey: Double
    ): EntityOptions = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], modelDef = modelDef.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityOptions]
    }
    
    extension [Self <: EntityOptions](x: Self) {
      
      inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String] | (js.Function1[/* arg0 */ Any, Boolean])): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsFunction1(value: /* arg0 */ Any => Boolean): Self = StObject.set(x, "fields", js.Any.fromFunction1(value))
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setModelDef(value: Any): Self = StObject.set(x, "modelDef", value.asInstanceOf[js.Any])
      
      inline def setUserKey(value: Double): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    }
  }
}
