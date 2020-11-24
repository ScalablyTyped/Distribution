package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessagePolicyViolationPolicyTip extends js.Object {
  
  /**
    * The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what
    * users shouldn't say in chats)
    */
  var complianceUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Explanatory text shown to the sender of the message.
  var generalText: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its
    * own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
    */
  var matchedConditionDescriptions: js.UndefOr[NullableOption[js.Array[String]]] = js.native
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
    def setComplianceUrl(value: NullableOption[String]): Self = this.set("complianceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceUrl: Self = this.set("complianceUrl", js.undefined)
    
    @scala.inline
    def setComplianceUrlNull: Self = this.set("complianceUrl", null)
    
    @scala.inline
    def setGeneralText(value: NullableOption[String]): Self = this.set("generalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneralText: Self = this.set("generalText", js.undefined)
    
    @scala.inline
    def setGeneralTextNull: Self = this.set("generalText", null)
    
    @scala.inline
    def setMatchedConditionDescriptionsVarargs(value: String*): Self = this.set("matchedConditionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setMatchedConditionDescriptions(value: NullableOption[js.Array[String]]): Self = this.set("matchedConditionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedConditionDescriptions: Self = this.set("matchedConditionDescriptions", js.undefined)
    
    @scala.inline
    def setMatchedConditionDescriptionsNull: Self = this.set("matchedConditionDescriptions", null)
  }
}
