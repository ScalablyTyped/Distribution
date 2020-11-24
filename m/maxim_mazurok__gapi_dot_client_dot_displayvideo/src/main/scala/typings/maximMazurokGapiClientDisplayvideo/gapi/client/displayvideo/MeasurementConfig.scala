package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasurementConfig extends js.Object {
  
  /** Whether or not to report DV360 cost to CM360. */
  var dv360ToCmCostReportingEnabled: js.UndefOr[Boolean] = js.native
  
  /** Whether or not to include DV360 data in CM360 data transfer reports. */
  var dv360ToCmDataSharingEnabled: js.UndefOr[Boolean] = js.native
}
object MeasurementConfig {
  
  @scala.inline
  def apply(): MeasurementConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementConfig]
  }
  
  @scala.inline
  implicit class MeasurementConfigOps[Self <: MeasurementConfig] (val x: Self) extends AnyVal {
    
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
    def setDv360ToCmCostReportingEnabled(value: Boolean): Self = this.set("dv360ToCmCostReportingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDv360ToCmCostReportingEnabled: Self = this.set("dv360ToCmCostReportingEnabled", js.undefined)
    
    @scala.inline
    def setDv360ToCmDataSharingEnabled(value: Boolean): Self = this.set("dv360ToCmDataSharingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDv360ToCmDataSharingEnabled: Self = this.set("dv360ToCmDataSharingEnabled", js.undefined)
  }
}
