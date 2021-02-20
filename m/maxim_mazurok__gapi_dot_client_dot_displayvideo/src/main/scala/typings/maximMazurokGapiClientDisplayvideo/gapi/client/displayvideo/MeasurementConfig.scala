package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasurementConfig extends StObject {
  
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
  implicit class MeasurementConfigMutableBuilder[Self <: MeasurementConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDv360ToCmCostReportingEnabled(value: Boolean): Self = StObject.set(x, "dv360ToCmCostReportingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDv360ToCmCostReportingEnabledUndefined: Self = StObject.set(x, "dv360ToCmCostReportingEnabled", js.undefined)
    
    @scala.inline
    def setDv360ToCmDataSharingEnabled(value: Boolean): Self = StObject.set(x, "dv360ToCmDataSharingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDv360ToCmDataSharingEnabledUndefined: Self = StObject.set(x, "dv360ToCmDataSharingEnabled", js.undefined)
  }
}
