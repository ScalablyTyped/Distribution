package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleVerifyFraudInvalidTraffic extends StObject {
  
  /** Insufficient Historical Fraud & IVT Stats. */
  var avoidInsufficientOption: js.UndefOr[Boolean] = js.undefined
  
  /** Avoid Sites and Apps with historical Fraud & IVT. */
  var avoidedFraudOption: js.UndefOr[String] = js.undefined
}
object DoubleVerifyFraudInvalidTraffic {
  
  @scala.inline
  def apply(): DoubleVerifyFraudInvalidTraffic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyFraudInvalidTraffic]
  }
  
  @scala.inline
  implicit class DoubleVerifyFraudInvalidTrafficMutableBuilder[Self <: DoubleVerifyFraudInvalidTraffic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidInsufficientOption(value: Boolean): Self = StObject.set(x, "avoidInsufficientOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidInsufficientOptionUndefined: Self = StObject.set(x, "avoidInsufficientOption", js.undefined)
    
    @scala.inline
    def setAvoidedFraudOption(value: String): Self = StObject.set(x, "avoidedFraudOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidedFraudOptionUndefined: Self = StObject.set(x, "avoidedFraudOption", js.undefined)
  }
}
