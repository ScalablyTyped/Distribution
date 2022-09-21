package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchDebit extends StObject {
  
  var account_holder_name: String
  
  var account_number: String
  
  var account_type: js.UndefOr[AccountType] = js.undefined
  
  var routing_number: String
}
object AchDebit {
  
  inline def apply(account_holder_name: String, account_number: String, routing_number: String): AchDebit = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], account_number = account_number.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchDebit]
  }
  
  extension [Self <: AchDebit](x: Self) {
    
    inline def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setAccount_type(value: AccountType): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
    
    inline def setAccount_typeUndefined: Self = StObject.set(x, "account_type", js.undefined)
    
    inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
  }
}
