package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBusinessCategory extends StObject {
  
  var category: String
  
  var mcc_code: String
  
  var sub_category: String
}
object ModelBusinessCategory {
  
  inline def apply(category: String, mcc_code: String, sub_category: String): ModelBusinessCategory = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], mcc_code = mcc_code.asInstanceOf[js.Any], sub_category = sub_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelBusinessCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelBusinessCategory] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setMcc_code(value: String): Self = StObject.set(x, "mcc_code", value.asInstanceOf[js.Any])
    
    inline def setSub_category(value: String): Self = StObject.set(x, "sub_category", value.asInstanceOf[js.Any])
  }
}
