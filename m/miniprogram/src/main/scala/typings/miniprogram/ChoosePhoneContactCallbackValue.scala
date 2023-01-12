package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoosePhoneContactCallbackValue extends StObject {
  
  /**
    * Selected contact phone.
    */
  var mobile: String
  
  /**
    * Selected contact name.
    */
  var name: String
}
object ChoosePhoneContactCallbackValue {
  
  inline def apply(mobile: String, name: String): ChoosePhoneContactCallbackValue = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoosePhoneContactCallbackValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChoosePhoneContactCallbackValue] (val x: Self) extends AnyVal {
    
    inline def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
