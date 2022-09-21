package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPubsublite.anon.AccesstokenAlt
import typings.maximMazurokGapiClientPubsublite.anon.Alt
import typings.maximMazurokGapiClientPubsublite.anon.Fields
import typings.maximMazurokGapiClientPubsublite.anon.PageSize
import typings.maximMazurokGapiClientPubsublite.anon.PrettyPrint
import typings.maximMazurokGapiClientPubsublite.anon.SkipBacklog
import typings.maximMazurokGapiClientPubsublite.anon.SubscriptionId
import typings.maximMazurokGapiClientPubsublite.anon.Uploadprotocol
import typings.maximMazurokGapiClientPubsublite.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends StObject {
  
  def commitCursor(request: AccesstokenAlt, body: CommitCursorRequest): Request[js.Object] = js.native
  /** Updates the committed cursor. */
  def commitCursor(request: typings.maximMazurokGapiClientPubsublite.anon.Subscription): Request[js.Object] = js.native
  
  /** Creates a new subscription. */
  def create(request: SkipBacklog): Request[Subscription] = js.native
  def create(request: SubscriptionId, body: Subscription): Request[Subscription] = js.native
  
  var cursors: CursorsResource = js.native
  
  /** Deletes the specified subscription. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Returns the subscription configuration. */
  def get(): Request[Subscription] = js.native
  def get(request: Alt): Request[Subscription] = js.native
  
  /** Returns the list of subscriptions for the given project. */
  /** Lists the subscriptions attached to the specified topic. */
  def list(): Request[ListSubscriptionsResponse] = js.native
  def list(request: Fields): Request[ListTopicSubscriptionsResponse] = js.native
  def list(request: PageSize): Request[ListSubscriptionsResponse] = js.native
  
  def patch(request: PrettyPrint, body: Subscription): Request[Subscription] = js.native
  /** Updates properties of the specified subscription. */
  def patch(request: Uploadprotocol): Request[Subscription] = js.native
  
  def seek(request: Alt, body: SeekSubscriptionRequest): Request[Operation] = js.native
  /**
    * Performs an out-of-band seek for a subscription to a specified target, which may be timestamps or named positions within the message backlog. Seek translates these targets to
    * cursors for each partition and orchestrates subscribers to start consuming messages from these seek cursors. If an operation is returned, the seek has been registered and
    * subscribers will eventually receive messages from the seek cursors (i.e. eventual consistency), as long as they are using a minimum supported client library version and not a system
    * that tracks cursors independently of Pub/Sub Lite (e.g. Apache Beam, Dataflow, Spark). The seek operation will fail for unsupported clients. If clients would like to know when
    * subscribers react to the seek (or not), they can poll the operation. The seek operation will succeed and complete once subscribers are ready to receive messages from the seek
    * cursors for all partitions of the topic. This means that the seek operation will not complete until all subscribers come online. If the previous seek operation has not yet
    * completed, it will be aborted and the new invocation of seek will supersede it.
    */
  def seek(request: Xgafv): Request[Operation] = js.native
}
