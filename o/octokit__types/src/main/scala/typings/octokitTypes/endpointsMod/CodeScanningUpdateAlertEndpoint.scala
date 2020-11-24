package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.dismissed
import typings.octokitTypes.octokitTypesStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeScanningUpdateAlertEndpoint extends js.Object {
  
  /**
    * The code scanning alert number.
    */
  var alert_number: js.UndefOr[Double] = js.native
  
  /**
    * **Required when the state is dismissed.** The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
    */
  var dismissed_reason: js.UndefOr[String | Null] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Sets the state of the code scanning alert. Can be one of `open` or `dismissed`. You must provide `dismissed_reason` when you set the state to `dismissed`.
    */
  var state: open | dismissed = js.native
}
object CodeScanningUpdateAlertEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, state: open | dismissed): CodeScanningUpdateAlertEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningUpdateAlertEndpoint]
  }
  
  @scala.inline
  implicit class CodeScanningUpdateAlertEndpointOps[Self <: CodeScanningUpdateAlertEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | dismissed): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlert_number(value: Double): Self = this.set("alert_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert_number: Self = this.set("alert_number", js.undefined)
    
    @scala.inline
    def setDismissed_reason(value: String): Self = this.set("dismissed_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissed_reason: Self = this.set("dismissed_reason", js.undefined)
    
    @scala.inline
    def setDismissed_reasonNull: Self = this.set("dismissed_reason", null)
  }
}
