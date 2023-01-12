package typings.paystack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accountnumber extends StObject {
  
  var account_number: String
  
  var business_name: String
  
  var percentage_charge: Double
  
  var settlement_bank: String
}
object Accountnumber {
  
  inline def apply(account_number: String, business_name: String, percentage_charge: Double, settlement_bank: String): Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], percentage_charge = percentage_charge.asInstanceOf[js.Any], settlement_bank = settlement_bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accountnumber] (val x: Self) extends AnyVal {
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setBusiness_name(value: String): Self = StObject.set(x, "business_name", value.asInstanceOf[js.Any])
    
    inline def setPercentage_charge(value: Double): Self = StObject.set(x, "percentage_charge", value.asInstanceOf[js.Any])
    
    inline def setSettlement_bank(value: String): Self = StObject.set(x, "settlement_bank", value.asInstanceOf[js.Any])
  }
}
