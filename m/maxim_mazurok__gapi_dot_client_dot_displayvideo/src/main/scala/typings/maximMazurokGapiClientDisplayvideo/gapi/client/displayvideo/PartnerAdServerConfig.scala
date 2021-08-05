package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerAdServerConfig extends StObject {
  
  /** Measurement settings of a partner. */
  var measurementConfig: js.UndefOr[MeasurementConfig] = js.undefined
}
object PartnerAdServerConfig {
  
  inline def apply(): PartnerAdServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerAdServerConfig]
  }
  
  extension [Self <: PartnerAdServerConfig](x: Self) {
    
    inline def setMeasurementConfig(value: MeasurementConfig): Self = StObject.set(x, "measurementConfig", value.asInstanceOf[js.Any])
    
    inline def setMeasurementConfigUndefined: Self = StObject.set(x, "measurementConfig", js.undefined)
  }
}
