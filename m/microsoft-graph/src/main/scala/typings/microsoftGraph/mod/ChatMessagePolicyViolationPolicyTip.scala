package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessagePolicyViolationPolicyTip extends StObject {
  
  /**
    * The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies about what
    * users shouldn't say in chats)
    */
  var complianceUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Explanatory text shown to the sender of the message.
  var generalText: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines its
    * own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
    */
  var matchedConditionDescriptions: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object ChatMessagePolicyViolationPolicyTip {
  
  @scala.inline
  def apply(): ChatMessagePolicyViolationPolicyTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessagePolicyViolationPolicyTip]
  }
  
  @scala.inline
  implicit class ChatMessagePolicyViolationPolicyTipMutableBuilder[Self <: ChatMessagePolicyViolationPolicyTip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceUrl(value: NullableOption[String]): Self = StObject.set(x, "complianceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceUrlNull: Self = StObject.set(x, "complianceUrl", null)
    
    @scala.inline
    def setComplianceUrlUndefined: Self = StObject.set(x, "complianceUrl", js.undefined)
    
    @scala.inline
    def setGeneralText(value: NullableOption[String]): Self = StObject.set(x, "generalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralTextNull: Self = StObject.set(x, "generalText", null)
    
    @scala.inline
    def setGeneralTextUndefined: Self = StObject.set(x, "generalText", js.undefined)
    
    @scala.inline
    def setMatchedConditionDescriptions(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "matchedConditionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedConditionDescriptionsNull: Self = StObject.set(x, "matchedConditionDescriptions", null)
    
    @scala.inline
    def setMatchedConditionDescriptionsUndefined: Self = StObject.set(x, "matchedConditionDescriptions", js.undefined)
    
    @scala.inline
    def setMatchedConditionDescriptionsVarargs(value: String*): Self = StObject.set(x, "matchedConditionDescriptions", js.Array(value :_*))
  }
}
