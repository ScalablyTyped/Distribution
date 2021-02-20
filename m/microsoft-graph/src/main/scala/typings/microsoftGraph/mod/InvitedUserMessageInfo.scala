package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvitedUserMessageInfo extends StObject {
  
  // Additional recipients the invitation message should be sent to. Currently only 1 additional recipient is supported.
  var ccRecipients: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  // Customized message body you want to send if you don't want the default message.
  var customizedMessageBody: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The language you want to send the default message in. If the customizedMessageBody is specified, this property is
    * ignored, and the message is sent using the customizedMessageBody. The language format should be in ISO 639. The default
    * is en-US.
    */
  var messageLanguage: js.UndefOr[NullableOption[String]] = js.native
}
object InvitedUserMessageInfo {
  
  @scala.inline
  def apply(): InvitedUserMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitedUserMessageInfo]
  }
  
  @scala.inline
  implicit class InvitedUserMessageInfoMutableBuilder[Self <: InvitedUserMessageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCcRecipients(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "ccRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcRecipientsNull: Self = StObject.set(x, "ccRecipients", null)
    
    @scala.inline
    def setCcRecipientsUndefined: Self = StObject.set(x, "ccRecipients", js.undefined)
    
    @scala.inline
    def setCcRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "ccRecipients", js.Array(value :_*))
    
    @scala.inline
    def setCustomizedMessageBody(value: NullableOption[String]): Self = StObject.set(x, "customizedMessageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedMessageBodyNull: Self = StObject.set(x, "customizedMessageBody", null)
    
    @scala.inline
    def setCustomizedMessageBodyUndefined: Self = StObject.set(x, "customizedMessageBody", js.undefined)
    
    @scala.inline
    def setMessageLanguage(value: NullableOption[String]): Self = StObject.set(x, "messageLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageLanguageNull: Self = StObject.set(x, "messageLanguage", null)
    
    @scala.inline
    def setMessageLanguageUndefined: Self = StObject.set(x, "messageLanguage", js.undefined)
  }
}
