package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPubsublite.anon.Callback
import typings.maximMazurokGapiClientPubsublite.anon.Fields
import typings.maximMazurokGapiClientPubsublite.anon.Name
import typings.maximMazurokGapiClientPubsublite.anon.Parent
import typings.maximMazurokGapiClientPubsublite.anon.PrettyPrint
import typings.maximMazurokGapiClientPubsublite.anon.QuotaUser
import typings.maximMazurokGapiClientPubsublite.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicsResource extends StObject {
  
  /** Compute statistics about a range of messages in a given topic and partition. */
  def computeMessageStats(request: Resource): Request[ComputeMessageStatsResponse] = js.native
  def computeMessageStats(request: typings.maximMazurokGapiClientPubsublite.anon.Topic, body: ComputeMessageStatsRequest): Request[ComputeMessageStatsResponse] = js.native
  
  /** Creates a new topic. */
  def create(request: Parent): Request[Topic] = js.native
  def create(request: PrettyPrint, body: Topic): Request[Topic] = js.native
  
  /** Deletes the specified topic. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Returns the topic configuration. */
  def get(): Request[Topic] = js.native
  def get(request: Callback): Request[Topic] = js.native
  
  /** Returns the partition information for the requested topic. */
  def getPartitions(): Request[TopicPartitions] = js.native
  def getPartitions(request: Callback): Request[TopicPartitions] = js.native
  
  /** Returns the list of topics for the given project. */
  def list(): Request[ListTopicsResponse] = js.native
  def list(request: Fields): Request[ListTopicsResponse] = js.native
  
  def patch(request: Name, body: Topic): Request[Topic] = js.native
  /** Updates properties of the specified topic. */
  def patch(request: QuotaUser): Request[Topic] = js.native
  
  var subscriptions: SubscriptionsResource = js.native
}
