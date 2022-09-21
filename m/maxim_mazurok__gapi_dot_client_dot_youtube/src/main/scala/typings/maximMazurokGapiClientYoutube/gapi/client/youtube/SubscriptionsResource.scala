package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.Alt
import typings.maximMazurokGapiClientYoutube.anon.ForChannelId
import typings.maximMazurokGapiClientYoutube.anon.ResourceUploadType
import typings.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends StObject {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: Subscription): Request[Subscription] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: ResourceUploadType): Request[Subscription] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[SubscriptionListResponse] = js.native
  def list(request: ForChannelId): Request[SubscriptionListResponse] = js.native
}
