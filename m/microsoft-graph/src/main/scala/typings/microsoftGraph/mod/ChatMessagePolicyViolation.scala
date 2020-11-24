package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessagePolicyViolation extends js.Object {
  
  /**
    * The action taken by the DLP provider on the message with sensitive content. Supported values are: NoneNotifySender --
    * Inform the sender of the violation but allow readers to read the message.BlockAccess -- Block readers from reading the
    * message.BlockAccessExternal -- Block users outside the organization from reading the message, while allowing users
    * within the organization to read the message.
    */
  var dlpAction: js.UndefOr[NullableOption[ChatMessagePolicyViolationDlpActionTypes]] = js.native
  
  // Justification text provided by the sender of the message when overriding a policy violation.
  var justificationText: js.UndefOr[NullableOption[String]] = js.native
  
  // Information to display to the message sender about why the message was flagged as a violation.
  var policyTip: js.UndefOr[NullableOption[ChatMessagePolicyViolationPolicyTip]] = js.native
  
  /**
    * Indicates the action taken by the user on a message blocked by the DLP provider. Supported values are:
    * NoneOverrideReportFalsePositiveWhen the DLP provider is updating the message for blocking sensitive content, userAction
    * is not required.
    */
  var userAction: js.UndefOr[NullableOption[ChatMessagePolicyViolationUserActionTypes]] = js.native
  
  /**
    * Indicates what actions the sender may take in response to the policy violation. Supported values are:
    * NoneAllowFalsePositiveOverride -- Allows the sender to declare the policyViolation to be an error in the DLP app and
    * its rules, and allow readers to see the message again if the dlpAction had hidden it.AllowOverrideWithoutJustification
    * -- Allows the sender to overriide the DLP violation and allow readers to see the message again if the dlpAction had
    * hidden it, without needing to provide an explanation for doing so. AllowOverrideWithJustification -- Allows the sender
    * to overriide the DLP violation and allow readers to see the message again if the dlpAction had hidden it, after
    * providing an explanation for doing so.AllowOverrideWithoutJustification and AllowOverrideWithJustification are mutually
    * exclusive.
    */
  var verdictDetails: js.UndefOr[NullableOption[ChatMessagePolicyViolationVerdictDetailsTypes]] = js.native
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
    def setDlpAction(value: NullableOption[ChatMessagePolicyViolationDlpActionTypes]): Self = this.set("dlpAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDlpAction: Self = this.set("dlpAction", js.undefined)
    
    @scala.inline
    def setDlpActionNull: Self = this.set("dlpAction", null)
    
    @scala.inline
    def setJustificationText(value: NullableOption[String]): Self = this.set("justificationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustificationText: Self = this.set("justificationText", js.undefined)
    
    @scala.inline
    def setJustificationTextNull: Self = this.set("justificationText", null)
    
    @scala.inline
    def setPolicyTip(value: NullableOption[ChatMessagePolicyViolationPolicyTip]): Self = this.set("policyTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTip: Self = this.set("policyTip", js.undefined)
    
    @scala.inline
    def setPolicyTipNull: Self = this.set("policyTip", null)
    
    @scala.inline
    def setUserAction(value: NullableOption[ChatMessagePolicyViolationUserActionTypes]): Self = this.set("userAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAction: Self = this.set("userAction", js.undefined)
    
    @scala.inline
    def setUserActionNull: Self = this.set("userAction", null)
    
    @scala.inline
    def setVerdictDetails(value: NullableOption[ChatMessagePolicyViolationVerdictDetailsTypes]): Self = this.set("verdictDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerdictDetails: Self = this.set("verdictDetails", js.undefined)
    
    @scala.inline
    def setVerdictDetailsNull: Self = this.set("verdictDetails", null)
  }
}
