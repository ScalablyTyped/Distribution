package typings.mercadopagoSdkJs.bricks

import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.buy
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.convenience
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.convenience_all
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.convenience_credits
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.pay
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.practicality
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.security_details
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.security_safety
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.smart_option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletButtonTextCustomization extends StObject {
  
  var action: pay | buy
  
  var valueProp: practicality | convenience | convenience_all | security_details | security_safety | convenience_credits | smart_option
}
object WalletButtonTextCustomization {
  
  inline def apply(
    action: pay | buy,
    valueProp: practicality | convenience | convenience_all | security_details | security_safety | convenience_credits | smart_option
  ): WalletButtonTextCustomization = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletButtonTextCustomization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WalletButtonTextCustomization] (val x: Self) extends AnyVal {
    
    inline def setAction(value: pay | buy): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setValueProp(
      value: practicality | convenience | convenience_all | security_details | security_safety | convenience_credits | smart_option
    ): Self = StObject.set(x, "valueProp", value.asInstanceOf[js.Any])
  }
}
