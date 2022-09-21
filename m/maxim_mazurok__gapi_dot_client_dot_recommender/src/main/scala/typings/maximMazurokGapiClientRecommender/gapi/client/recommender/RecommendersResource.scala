package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRecommender.anon.Accesstoken
import typings.maximMazurokGapiClientRecommender.anon.Key
import typings.maximMazurokGapiClientRecommender.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendersResource extends StObject {
  
  /** Gets the requested Recommender Config. There is only one instance of the config for each Recommender. */
  def getConfig(): Request[GoogleCloudRecommenderV1RecommenderConfig] = js.native
  def getConfig(request: Accesstoken): Request[GoogleCloudRecommenderV1RecommenderConfig] = js.native
  
  var recommendations: RecommendationsResource = js.native
  
  def updateConfig(request: Key, body: GoogleCloudRecommenderV1RecommenderConfig): Request[GoogleCloudRecommenderV1RecommenderConfig] = js.native
  /** Updates a Recommender Config. This will create a new revision of the config. */
  def updateConfig(request: QuotaUser): Request[GoogleCloudRecommenderV1RecommenderConfig] = js.native
}
