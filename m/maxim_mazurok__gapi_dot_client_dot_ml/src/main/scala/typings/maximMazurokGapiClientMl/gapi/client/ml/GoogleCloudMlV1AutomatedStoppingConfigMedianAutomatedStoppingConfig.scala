package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig extends js.Object {
  
  /**
    * If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial's latest measurement is used to compute
    * the median objective value for each completed trial.
    */
  var useElapsedTime: js.UndefOr[Boolean] = js.native
}
object GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfigOps[Self <: GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig] (val x: Self) extends AnyVal {
    
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
