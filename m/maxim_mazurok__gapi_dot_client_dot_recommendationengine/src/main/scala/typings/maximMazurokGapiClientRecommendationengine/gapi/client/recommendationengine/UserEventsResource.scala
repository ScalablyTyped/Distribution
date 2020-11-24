package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRecommendationengine.anon.Alt
import typings.maximMazurokGapiClientRecommendationengine.anon.Ets
import typings.maximMazurokGapiClientRecommendationengine.anon.Filter
import typings.maximMazurokGapiClientRecommendationengine.anon.QuotaUser
import typings.maximMazurokGapiClientRecommendationengine.anon.Resource
import typings.maximMazurokGapiClientRecommendationengine.anon.UploadType
import typings.maximMazurokGapiClientRecommendationengine.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserEventsResource extends js.Object {
  
  /**
    * Writes a single user event from the browser. This uses a GET request to due to browser restriction of POST-ing to a 3rd party domain. This method is used only by the Recommendations
    * AI JavaScript pixel. Users should not call this method directly.
    */
  def collect(): Request[GoogleApiHttpBody] = js.native
  def collect(request: Ets): Request[GoogleApiHttpBody] = js.native
  
  def `import`(request: Alt, body: GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Bulk import of User events. Request processing might be synchronous. Events that already exist are skipped. Use this method for backfilling historical user events.
    * Operation.response is of type ImportResponse. Note that it is possible for a subset of the items to be successfully inserted. Operation.metadata is of type ImportMetadata.
    */
  def `import`(request: QuotaUser): Request[GoogleLongrunningOperation] = js.native
  
  /**
    * Gets a list of user events within a time range, with potential filtering. The method does not list unjoined user events. Unjoined user event definition: when a user event is
    * ingested from Recommendations AI User Event APIs, the catalog item included in the user event is connected with the current catalog. If a catalog item of the ingested event is not
    * in the current catalog, it could lead to degraded model quality. This is called an unjoined event.
    */
  def list(): Request[GoogleCloudRecommendationengineV1beta1ListUserEventsResponse] = js.native
  def list(request: Filter): Request[GoogleCloudRecommendationengineV1beta1ListUserEventsResponse] = js.native
  
  def purge(request: Alt, body: GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Deletes permanently all user events specified by the filter provided. Depending on the number of events specified by the filter, this operation could take hours or days to complete.
    * To test a filter, use the list command first.
    */
  def purge(request: Resource): Request[GoogleLongrunningOperation] = js.native
  
  def rejoin(request: Alt, body: GoogleCloudRecommendationengineV1beta1RejoinUserEventsRequest): Request[GoogleLongrunningOperation] = js.native
  /**
    * Triggers a user event rejoin operation with latest catalog data. Events will not be annotated with detailed catalog information if catalog item is missing at the time the user event
    * is ingested, and these events are stored as unjoined events with a limited usage on training and serving. This API can be used to trigger a 'join' operation on specified events with
    * latest version of catalog items. It can also be used to correct events joined with wrong catalog items.
    */
  def rejoin(request: UploadType): Request[GoogleLongrunningOperation] = js.native
  
  def write(request: Alt, body: GoogleCloudRecommendationengineV1beta1UserEvent): Request[GoogleCloudRecommendationengineV1beta1UserEvent] = js.native
  /** Writes a single user event. */
  def write(request: Uploadprotocol): Request[GoogleCloudRecommendationengineV1beta1UserEvent] = js.native
}
