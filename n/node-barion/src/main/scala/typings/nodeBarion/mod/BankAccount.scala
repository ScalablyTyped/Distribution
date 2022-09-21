package typings.nodeBarion.mod

import typings.nodeBarion.nodeBarionStrings.Czech
import typings.nodeBarion.nodeBarionStrings.Giro
import typings.nodeBarion.nodeBarionStrings.IBAN
import typings.nodeBarion.nodeBarionStrings.Other
import typings.nodeBarion.nodeBarionStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankAccount extends StObject {
  
  var AccountNumber: String
  
  var Address: js.UndefOr[String] = js.undefined
  
  var BankAddress: js.UndefOr[String] = js.undefined
  
  var BankName: js.UndefOr[String] = js.undefined
  
  var Country: String
  
  var Format: Unknown | Giro | IBAN | Czech | Other
  
  var SwiftCode: js.UndefOr[String] = js.undefined
}
object BankAccount {
  
  inline def apply(AccountNumber: String, Country: String, Format: Unknown | Giro | IBAN | Czech | Other): BankAccount = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccount]
  }
  
  extension [Self <: BankAccount](x: Self) {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setBankAddress(value: String): Self = StObject.set(x, "BankAddress", value.asInstanceOf[js.Any])
    
    inline def setBankAddressUndefined: Self = StObject.set(x, "BankAddress", js.undefined)
    
    inline def setBankName(value: String): Self = StObject.set(x, "BankName", value.asInstanceOf[js.Any])
    
    inline def setBankNameUndefined: Self = StObject.set(x, "BankName", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Unknown | Giro | IBAN | Czech | Other): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setSwiftCode(value: String): Self = StObject.set(x, "SwiftCode", value.asInstanceOf[js.Any])
    
    inline def setSwiftCodeUndefined: Self = StObject.set(x, "SwiftCode", js.undefined)
  }
}
