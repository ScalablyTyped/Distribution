package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /** Input only. Android specific options for messages sent through [FCM connection server](https://goo.gl/4GLdUl). */
  var android: js.UndefOr[AndroidConfig] = js.native
  
  /** Input only. [Apple Push Notification Service](https://goo.gl/MXRTPa) specific options. */
  var apns: js.UndefOr[ApnsConfig] = js.native
  
  /** Condition to send a message to, e.g. "'foo' in topics && 'bar' in topics". */
  var condition: js.UndefOr[String] = js.native
  
  /** Input only. Arbitrary key/value payload. The key should not be a reserved word ("from", "message_type", or any word starting with "google" or "gcm"). */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.Message with TopLevel[js.Any]
  ] = js.native
  
  /** Input only. Template for FCM SDK feature options to use across all platforms. */
  var fcmOptions: js.UndefOr[FcmOptions] = js.native
  
  /** Output Only. The identifier of the message sent, in the format of `projects/∗/messages/{message_id}`. */
  var name: js.UndefOr[String] = js.native
  
  /** Input only. Basic notification template to use across all platforms. */
  var notification: js.UndefOr[Notification] = js.native
  
  /** Registration token to send a message to. */
  var token: js.UndefOr[String] = js.native
  
  /** Topic name to send a message to, e.g. "weather". Note: "/topics/" prefix should not be provided. */
  var topic: js.UndefOr[String] = js.native
  
  /** Input only. [Webpush protocol](https://tools.ietf.org/html/rfc8030) options. */
  var webpush: js.UndefOr[WebpushConfig] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setAndroid(value: AndroidConfig): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setApns(value: ApnsConfig): Self = this.set("apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApns: Self = this.set("apns", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.Message with TopLevel[js.Any]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFcmOptions(value: FcmOptions): Self = this.set("fcmOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFcmOptions: Self = this.set("fcmOptions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setWebpush(value: WebpushConfig): Self = this.set("webpush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebpush: Self = this.set("webpush", js.undefined)
  }
}
