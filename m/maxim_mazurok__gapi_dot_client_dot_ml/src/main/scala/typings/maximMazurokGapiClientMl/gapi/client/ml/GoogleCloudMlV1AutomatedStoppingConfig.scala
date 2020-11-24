package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1AutomatedStoppingConfig extends js.Object {
  
  var decayCurveStoppingConfig: js.UndefOr[GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig] = js.native
  
  var medianAutomatedStoppingConfig: js.UndefOr[GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig] = js.native
}
object GoogleCloudMlV1AutomatedStoppingConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AutomatedStoppingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AutomatedStoppingConfigOps[Self <: GoogleCloudMlV1AutomatedStoppingConfig] (val x: Self) extends AnyVal {
    
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
    def setDecayCurveStoppingConfig(value: GoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig): Self = this.set("decayCurveStoppingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecayCurveStoppingConfig: Self = this.set("decayCurveStoppingConfig", js.undefined)
    
    @scala.inline
    def setMedianAutomatedStoppingConfig(value: GoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig): Self = this.set("medianAutomatedStoppingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedianAutomatedStoppingConfig: Self = this.set("medianAutomatedStoppingConfig", js.undefined)
  }
}
