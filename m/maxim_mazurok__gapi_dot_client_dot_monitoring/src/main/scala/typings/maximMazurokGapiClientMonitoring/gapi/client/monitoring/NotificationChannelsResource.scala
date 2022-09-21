package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.AccesstokenAlt
import typings.maximMazurokGapiClientMonitoring.anon.AltCallback
import typings.maximMazurokGapiClientMonitoring.anon.Callback
import typings.maximMazurokGapiClientMonitoring.anon.Filter
import typings.maximMazurokGapiClientMonitoring.anon.Force
import typings.maximMazurokGapiClientMonitoring.anon.Oauthtoken
import typings.maximMazurokGapiClientMonitoring.anon.UpdateMask
import typings.maximMazurokGapiClientMonitoring.anon.Uploadprotocol
import typings.maximMazurokGapiClientMonitoring.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationChannelsResource extends StObject {
  
  def create(request: Callback, body: NotificationChannel): Request[NotificationChannel] = js.native
  /** Creates a new notification channel, representing a single notification endpoint such as an email address, SMS number, or PagerDuty service. */
  def create(request: Uploadprotocol): Request[NotificationChannel] = js.native
  
  /** Deletes a notification channel. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  /**
    * Gets a single notification channel. The channel includes the relevant configuration details with which the channel was created. However, the response may truncate or omit passwords,
    * API keys, or other private key matter and thus the response may not be 100% identical to the information that was supplied in the call to the create method.
    */
  def get(): Request[NotificationChannel] = js.native
  def get(request: Callback): Request[NotificationChannel] = js.native
  
  def getVerificationCode(request: Callback, body: GetNotificationChannelVerificationCodeRequest): Request[GetNotificationChannelVerificationCodeResponse] = js.native
  /**
    * Requests a verification code for an already verified channel that can then be used in a call to VerifyNotificationChannel() on a different channel with an equivalent identity in the
    * same or in a different project. This makes it possible to copy a channel between projects without requiring manual reverification of the channel. If the channel is not in the
    * verified state, this method will fail (in other words, this may only be used if the SendNotificationChannelVerificationCode and VerifyNotificationChannel paths have already been
    * used to put the given channel into the verified state).There is no guarantee that the verification codes returned by this method will be of a similar structure or form as the ones
    * that are delivered to the channel via SendNotificationChannelVerificationCode; while VerifyNotificationChannel() will recognize both the codes delivered via
    * SendNotificationChannelVerificationCode() and returned from GetNotificationChannelVerificationCode(), it is typically the case that the verification codes delivered via
    * SendNotificationChannelVerificationCode() will be shorter and also have a shorter expiration (e.g. codes such as "G-123456") whereas GetVerificationCode() will typically return a
    * much longer, websafe base 64 encoded string that has a longer expiration time.
    */
  def getVerificationCode(request: Xgafv): Request[GetNotificationChannelVerificationCodeResponse] = js.native
  
  /** Lists the notification channels that have been created for the project. */
  def list(): Request[ListNotificationChannelsResponse] = js.native
  def list(request: Filter): Request[ListNotificationChannelsResponse] = js.native
  
  def patch(request: Oauthtoken, body: NotificationChannel): Request[NotificationChannel] = js.native
  /** Updates a notification channel. Fields not specified in the field mask remain unchanged. */
  def patch(request: UpdateMask): Request[NotificationChannel] = js.native
  
  /** Causes a verification code to be delivered to the channel. The code can then be supplied in VerifyNotificationChannel to verify the channel. */
  def sendVerificationCode(request: AccesstokenAlt): Request[js.Object] = js.native
  def sendVerificationCode(request: Callback, body: SendNotificationChannelVerificationCodeRequest): Request[js.Object] = js.native
  
  /** Verifies a NotificationChannel by proving receipt of the code delivered to the channel as a result of calling SendNotificationChannelVerificationCode. */
  def verify(request: AltCallback): Request[NotificationChannel] = js.native
  def verify(request: Callback, body: VerifyNotificationChannelRequest): Request[NotificationChannel] = js.native
}
