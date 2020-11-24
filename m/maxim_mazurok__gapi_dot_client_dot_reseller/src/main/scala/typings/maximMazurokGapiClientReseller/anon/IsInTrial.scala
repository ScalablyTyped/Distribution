package typings.maximMazurokGapiClientReseller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInTrial extends js.Object {
  
  /**
    * Determines if a subscription's plan is in a 30-day free trial or not:
    * - true — The plan is in trial.
    * - false — The plan is not in trial.
    */
  var isInTrial: js.UndefOr[Boolean] = js.native
  
  /** Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an example Epoch converter. */
  var trialEndTime: js.UndefOr[String] = js.native
}
object IsInTrial {
  
  @scala.inline
  def apply(): IsInTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsInTrial]
  }
  
  @scala.inline
  implicit class IsInTrialOps[Self <: IsInTrial] (val x: Self) extends AnyVal {
    
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
    def setIsInTrial(value: Boolean): Self = this.set("isInTrial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInTrial: Self = this.set("isInTrial", js.undefined)
    
    @scala.inline
    def setTrialEndTime(value: String): Self = this.set("trialEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialEndTime: Self = this.set("trialEndTime", js.undefined)
  }
}
