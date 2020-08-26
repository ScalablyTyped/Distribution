package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatMessagePolicyViolation extends js.Object {
  var dlpAction: js.UndefOr[ChatMessagePolicyViolationDlpActionTypes] = js.native
  var justificationText: js.UndefOr[String] = js.native
  var policyTip: js.UndefOr[ChatMessagePolicyViolationPolicyTip] = js.native
  var userAction: js.UndefOr[ChatMessagePolicyViolationUserActionTypes] = js.native
  var verdictDetails: js.UndefOr[ChatMessagePolicyViolationVerdictDetailsTypes] = js.native
}

object ChatMessagePolicyViolation {
  @scala.inline
  def apply(): ChatMessagePolicyViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessagePolicyViolation]
  }
  @scala.inline
  implicit class ChatMessagePolicyViolationOps[Self <: ChatMessagePolicyViolation] (val x: Self) extends AnyVal {
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
    def setDlpAction(value: ChatMessagePolicyViolationDlpActionTypes): Self = this.set("dlpAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDlpAction: Self = this.set("dlpAction", js.undefined)
    @scala.inline
    def setJustificationText(value: String): Self = this.set("justificationText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustificationText: Self = this.set("justificationText", js.undefined)
    @scala.inline
    def setPolicyTip(value: ChatMessagePolicyViolationPolicyTip): Self = this.set("policyTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyTip: Self = this.set("policyTip", js.undefined)
    @scala.inline
    def setUserAction(value: ChatMessagePolicyViolationUserActionTypes): Self = this.set("userAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAction: Self = this.set("userAction", js.undefined)
    @scala.inline
    def setVerdictDetails(value: ChatMessagePolicyViolationVerdictDetailsTypes): Self = this.set("verdictDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerdictDetails: Self = this.set("verdictDetails", js.undefined)
  }
  
}

