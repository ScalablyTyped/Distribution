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
  
  @scala.inline
  def apply(): ExchangeReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeReviewStatus]
  }
  
  @scala.inline
  implicit class ExchangeReviewStatusMutableBuilder[Self <: ExchangeReviewStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
