package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatMessagePolicyViolationPolicyTip extends js.Object {
  var complianceUrl: js.UndefOr[String] = js.native
  var generalText: js.UndefOr[String] = js.native
  var matchedConditionDescriptions: js.UndefOr[js.Array[String]] = js.native
}

object ChatMessagePolicyViolationPolicyTip {
  @scala.inline
  def apply(): ChatMessagePolicyViolationPolicyTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessagePolicyViolationPolicyTip]
  }
  @scala.inline
  implicit class ChatMessagePolicyViolationPolicyTipOps[Self <: ChatMessagePolicyViolationPolicyTip] (val x: Self) extends AnyVal {
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
    def setComplianceUrl(value: String): Self = this.set("complianceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceUrl: Self = this.set("complianceUrl", js.undefined)
    @scala.inline
    def setGeneralText(value: String): Self = this.set("generalText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneralText: Self = this.set("generalText", js.undefined)
    @scala.inline
    def setMatchedConditionDescriptionsVarargs(value: String*): Self = this.set("matchedConditionDescriptions", js.Array(value :_*))
    @scala.inline
    def setMatchedConditionDescriptions(value: js.Array[String]): Self = this.set("matchedConditionDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchedConditionDescriptions: Self = this.set("matchedConditionDescriptions", js.undefined)
  }
  
}

