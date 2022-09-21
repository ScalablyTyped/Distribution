package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupInvoiceCurrencyResponse extends StObject {
  
  /** Currency used by the advertiser in ISO 4217 format. */
  var currencyCode: js.UndefOr[String] = js.undefined
}
object LookupInvoiceCurrencyResponse {
  
  inline def apply(): LookupInvoiceCurrencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupInvoiceCurrencyResponse]
  }
  
  extension [Self <: LookupInvoiceCurrencyResponse](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
  }
}
