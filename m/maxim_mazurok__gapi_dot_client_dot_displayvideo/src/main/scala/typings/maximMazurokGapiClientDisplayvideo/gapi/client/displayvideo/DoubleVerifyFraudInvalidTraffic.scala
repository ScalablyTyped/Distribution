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
  
  inline def apply(): DoubleVerifyFraudInvalidTraffic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyFraudInvalidTraffic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoubleVerifyFraudInvalidTraffic] (val x: Self) extends AnyVal {
    
    inline def setAvoidInsufficientOption(value: Boolean): Self = StObject.set(x, "avoidInsufficientOption", value.asInstanceOf[js.Any])
    
    inline def setAvoidInsufficientOptionUndefined: Self = StObject.set(x, "avoidInsufficientOption", js.undefined)
    
    inline def setAvoidedFraudOption(value: String): Self = StObject.set(x, "avoidedFraudOption", value.asInstanceOf[js.Any])
    
    inline def setAvoidedFraudOptionUndefined: Self = StObject.set(x, "avoidedFraudOption", js.undefined)
  }
}
