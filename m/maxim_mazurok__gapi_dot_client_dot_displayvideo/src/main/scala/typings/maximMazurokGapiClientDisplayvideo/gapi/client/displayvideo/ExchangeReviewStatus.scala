package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeReviewStatus extends StObject {
  
  /** The exchange reviewing the creative. */
  var exchange: js.UndefOr[String] = js.undefined
  
  /** Status of the exchange review. */
  var status: js.UndefOr[String] = js.undefined
}
object ExchangeReviewStatus {
  
  inline def apply(): ExchangeReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeReviewStatus]
  }
  
  extension [Self <: ExchangeReviewStatus](x: Self) {
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
