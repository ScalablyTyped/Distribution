package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyOnlyConfig extends StObject {
  
  /** Whether or not order ID reporting for pixels is enabled. This value cannot be changed once set to `true`. */
  var pixelOrderIdReportingEnabled: js.UndefOr[Boolean] = js.undefined
}
object ThirdPartyOnlyConfig {
  
  inline def apply(): ThirdPartyOnlyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyOnlyConfig]
  }
  
  extension [Self <: ThirdPartyOnlyConfig](x: Self) {
    
    inline def setPixelOrderIdReportingEnabled(value: Boolean): Self = StObject.set(x, "pixelOrderIdReportingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPixelOrderIdReportingEnabledUndefined: Self = StObject.set(x, "pixelOrderIdReportingEnabled", js.undefined)
  }
}
