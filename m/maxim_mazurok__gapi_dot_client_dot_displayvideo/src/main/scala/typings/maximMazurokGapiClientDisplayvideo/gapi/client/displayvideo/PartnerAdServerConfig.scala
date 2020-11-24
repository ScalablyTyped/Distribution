package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerAdServerConfig extends js.Object {
  
  /** Measurement settings of a partner. */
  var measurementConfig: js.UndefOr[MeasurementConfig] = js.native
}
object PartnerAdServerConfig {
  
  @scala.inline
  def apply(): PartnerAdServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerAdServerConfig]
  }
  
  @scala.inline
  implicit class PartnerAdServerConfigOps[Self <: PartnerAdServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeasurementConfig(value: MeasurementConfig): Self = this.set("measurementConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurementConfig: Self = this.set("measurementConfig", js.undefined)
  }
}
