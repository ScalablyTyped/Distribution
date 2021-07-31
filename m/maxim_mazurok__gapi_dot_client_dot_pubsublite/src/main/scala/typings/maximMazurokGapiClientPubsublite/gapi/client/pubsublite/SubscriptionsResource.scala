package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPubsublite.anon.Accesstoken
import typings.maximMazurokGapiClientPubsublite.anon.Alt
import typings.maximMazurokGapiClientPubsublite.anon.Callback
import typings.maximMazurokGapiClientPubsublite.anon.Fields
import typings.maximMazurokGapiClientPubsublite.anon.Key
import typings.maximMazurokGapiClientPubsublite.anon.Name
import typings.maximMazurokGapiClientPubsublite.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends StObject {
  
  /** Creates a new subscription. */
  def create(request: Accesstoken): Request[Subscription] = js.native
  def create(request: Alt, body: Subscription): Request[Subscription] = js.native
  
  var cursors: CursorsResource = js.native
  
  /** Deletes the specified subscription. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Returns the subscription configuration. */
  def get(): Request[Subscription] = js.native
  def get(request: Callback): Request[Subscription] = js.native
  
  /** Returns the list of subscriptions for the given project. */
  /** Lists the subscriptions attached to the specified topic. */
  def list(): Request[ListSubscriptionsResponse] = js.native
  def list(request: Fields): Request[ListSubscriptionsResponse] = js.native
  def list(request: Oauthtoken): Request[ListTopicSubscriptionsResponse] = js.native
  
  /** Updates properties of the specified subscription. */
  def patch(request: Key): Request[Subscription] = js.native
  def patch(request: Name, body: Subscription): Request[Subscription] = js.native
}
