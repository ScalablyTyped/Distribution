package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.PageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationChannelDescriptorsResource extends StObject {
  
  /** Gets a single channel descriptor. The descriptor indicates which fields are expected / permitted for a notification channel of the given type. */
  def get(): Request[NotificationChannelDescriptor] = js.native
  def get(request: Alt): Request[NotificationChannelDescriptor] = js.native
  
  /** Lists the descriptors for supported channel types. The use of descriptors makes it possible for new channel types to be dynamically added. */
  def list(): Request[ListNotificationChannelDescriptorsResponse] = js.native
  def list(request: PageToken): Request[ListNotificationChannelDescriptorsResponse] = js.native
}
