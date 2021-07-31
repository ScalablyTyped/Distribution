package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerAdServerConfig extends StObject {
  
  /** Measurement settings of a partner. */
  var measurementConfig: js.UndefOr[MeasurementConfig] = js.undefined
}
object PartnerAdServerConfig {
  
  @scala.inline
  def apply(): PartnerAdServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerAdServerConfig]
  }
  
  @scala.inline
  implicit class PartnerAdServerConfigMutableBuilder[Self <: PartnerAdServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeasurementConfig(value: MeasurementConfig): Self = StObject.set(x, "measurementConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementConfigUndefined: Self = StObject.set(x, "measurementConfig", js.undefined)
  }
}
