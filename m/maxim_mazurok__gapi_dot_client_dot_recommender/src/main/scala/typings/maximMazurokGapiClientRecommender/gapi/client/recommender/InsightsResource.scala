package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRecommender.anon.Accesstoken
import typings.maximMazurokGapiClientRecommender.anon.Alt
import typings.maximMazurokGapiClientRecommender.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsResource extends StObject {
  
  /** Gets the requested insight. Requires the recommender.*.get IAM permission for the specified insight type. */
  def get(): Request[GoogleCloudRecommenderV1Insight] = js.native
  def get(request: Accesstoken): Request[GoogleCloudRecommenderV1Insight] = js.native
  
  /** Lists insights for the specified Cloud Resource. Requires the recommender.*.list IAM permission for the specified insight type. */
  def list(): Request[GoogleCloudRecommenderV1ListInsightsResponse] = js.native
  def list(request: Alt): Request[GoogleCloudRecommenderV1ListInsightsResponse] = js.native
  
  def markAccepted(request: Accesstoken, body: GoogleCloudRecommenderV1MarkInsightAcceptedRequest): Request[GoogleCloudRecommenderV1Insight] = js.native
  /**
    * Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender API that they have applied some action based on the insight. This stops the insight
    * content from being updated. MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the recommender.*.update IAM permission for the specified insight.
    */
  def markAccepted(request: Callback): Request[GoogleCloudRecommenderV1Insight] = js.native
}
