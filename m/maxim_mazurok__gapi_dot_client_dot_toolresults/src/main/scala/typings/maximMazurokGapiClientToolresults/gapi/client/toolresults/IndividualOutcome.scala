package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndividualOutcome extends js.Object {
  
  /** Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0. */
  var multistepNumber: js.UndefOr[Double] = js.native
  
  var outcomeSummary: js.UndefOr[String] = js.native
  
  /** How long it took for this step to run. */
  var runDuration: js.UndefOr[Duration] = js.native
  
  var stepId: js.UndefOr[String] = js.native
}
object IndividualOutcome {
  
  @scala.inline
  def apply(): IndividualOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualOutcome]
  }
  
  @scala.inline
  implicit class IndividualOutcomeOps[Self <: IndividualOutcome] (val x: Self) extends AnyVal {
    
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
    def setMultistepNumber(value: Double): Self = this.set("multistepNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultistepNumber: Self = this.set("multistepNumber", js.undefined)
    
    @scala.inline
    def setOutcomeSummary(value: String): Self = this.set("outcomeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcomeSummary: Self = this.set("outcomeSummary", js.undefined)
    
    @scala.inline
    def setRunDuration(value: Duration): Self = this.set("runDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunDuration: Self = this.set("runDuration", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
  }
}
