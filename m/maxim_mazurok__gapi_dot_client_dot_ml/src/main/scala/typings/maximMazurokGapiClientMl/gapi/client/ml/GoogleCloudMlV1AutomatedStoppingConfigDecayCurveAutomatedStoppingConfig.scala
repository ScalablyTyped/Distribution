package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig extends js.Object {
  
  /** If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis. */
  var useElapsedTime: js.UndefOr[Boolean] = js.native
}
object GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfigOps[Self <: GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig] (val x: Self) extends AnyVal {
    
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
    def setUseElapsedTime(value: Boolean): Self = this.set("useElapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseElapsedTime: Self = this.set("useElapsedTime", js.undefined)
  }
}
