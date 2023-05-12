package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletButtonTextCustomization extends StObject {
  
  var action: WalletButtonAction
  
  var valueProp: WalletButtonValueProp
}
object WalletButtonTextCustomization {
  
  inline def apply(action: WalletButtonAction, valueProp: WalletButtonValueProp): WalletButtonTextCustomization = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletButtonTextCustomization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WalletButtonTextCustomization] (val x: Self) extends AnyVal {
    
    inline def setAction(value: WalletButtonAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setValueProp(value: WalletButtonValueProp): Self = StObject.set(x, "valueProp", value.asInstanceOf[js.Any])
  }
}
