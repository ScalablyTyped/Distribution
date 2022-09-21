package typings.nodeBarion.mod

import typings.nodeBarion.nodeBarionStrings.All
import typings.nodeBarion.nodeBarionStrings.ApplePay
import typings.nodeBarion.nodeBarionStrings.Balance
import typings.nodeBarion.nodeBarionStrings.BankCard
import typings.nodeBarion.nodeBarionStrings.BankTransfer
import typings.nodeBarion.nodeBarionStrings.CZK
import typings.nodeBarion.nodeBarionStrings.EUR
import typings.nodeBarion.nodeBarionStrings.GooglePay
import typings.nodeBarion.nodeBarionStrings.HUF
import typings.nodeBarion.nodeBarionStrings.USD
import typings.nodeBarion.nodeBarionStrings.`cs-CZ`
import typings.nodeBarion.nodeBarionStrings.`de-DE`
import typings.nodeBarion.nodeBarionStrings.`en-US`
import typings.nodeBarion.nodeBarionStrings.`es-ES`
import typings.nodeBarion.nodeBarionStrings.`fr-FR`
import typings.nodeBarion.nodeBarionStrings.`hu-HU`
import typings.nodeBarion.nodeBarionStrings.`sk-SK`
import typings.nodeBarion.nodeBarionStrings.`sl-SI`
import typings.nodeBarion.nodeBarionStrings.prod
import typings.nodeBarion.nodeBarionStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialOptions extends StObject {
  
  var Currency: js.UndefOr[CZK | EUR | HUF | USD] = js.undefined
  
  var Environment: js.UndefOr[test | prod] = js.undefined
  
  var FundingSources: js.UndefOr[js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]] = js.undefined
  
  var GuestCheckOut: js.UndefOr[Boolean] = js.undefined
  
  var Locale: js.UndefOr[`cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`] = js.undefined
  
  var POSKey: String
  
  var Secure: js.UndefOr[Boolean] = js.undefined
}
object InitialOptions {
  
  inline def apply(POSKey: String): InitialOptions = {
    val __obj = js.Dynamic.literal(POSKey = POSKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialOptions]
  }
  
  extension [Self <: InitialOptions](x: Self) {
    
    inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "Currency", js.undefined)
    
    inline def setEnvironment(value: test | prod): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setFundingSources(value: js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]): Self = StObject.set(x, "FundingSources", value.asInstanceOf[js.Any])
    
    inline def setFundingSourcesUndefined: Self = StObject.set(x, "FundingSources", js.undefined)
    
    inline def setFundingSourcesVarargs(value: (All | Balance | BankCard | GooglePay | ApplePay | BankTransfer)*): Self = StObject.set(x, "FundingSources", js.Array(value*))
    
    inline def setGuestCheckOut(value: Boolean): Self = StObject.set(x, "GuestCheckOut", value.asInstanceOf[js.Any])
    
    inline def setGuestCheckOutUndefined: Self = StObject.set(x, "GuestCheckOut", js.undefined)
    
    inline def setLocale(value: `cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "Secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "Secure", js.undefined)
  }
}
