package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSecuritycenter.anon.ConfigId
import typings.maximMazurokGapiClientSecuritycenter.anon.Oauthtoken
import typings.maximMazurokGapiClientSecuritycenter.anon.PageSize
import typings.maximMazurokGapiClientSecuritycenter.anon.PrettyPrint
import typings.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import typings.maximMazurokGapiClientSecuritycenter.anon.UpdateMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfigsResource extends js.Object {
  
  /** Creates a notification config. */
  def create(request: ConfigId): Request[NotificationConfig] = js.native
  def create(request: Oauthtoken, body: NotificationConfig): Request[NotificationConfig] = js.native
  
  /** Deletes a notification config. */
  def delete(): Request[js.Object] = js.native
  def delete(request: PrettyPrint): Request[js.Object] = js.native
  
  /** Gets a notification config. */
  def get(): Request[NotificationConfig] = js.native
  def get(request: PrettyPrint): Request[NotificationConfig] = js.native
  
  /** Lists notification configs. */
  def list(): Request[ListNotificationConfigsResponse] = js.native
  def list(request: PageSize): Request[ListNotificationConfigsResponse] = js.native
  
  /** Updates a notification config. The following update fields are allowed: description, pubsub_topic, streaming_config.filter */
  def patch(request: QuotaUser): Request[NotificationConfig] = js.native
  def patch(request: UpdateMask, body: NotificationConfig): Request[NotificationConfig] = js.native
}
