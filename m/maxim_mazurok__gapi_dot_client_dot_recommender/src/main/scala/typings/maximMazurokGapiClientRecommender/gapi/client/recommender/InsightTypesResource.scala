package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRecommender.anon.Accesstoken
import typings.maximMazurokGapiClientRecommender.anon.Fields
import typings.maximMazurokGapiClientRecommender.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightTypesResource extends StObject {
  
  /** Gets the requested InsightTypeConfig. There is only one instance of the config for each InsightType. */
  def getConfig(): Request[GoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def getConfig(request: Accesstoken): Request[GoogleCloudRecommenderV1InsightTypeConfig] = js.native
  
  var insights: InsightsResource = js.native
  
  /** Updates an InsightTypeConfig change. This will create a new revision of the config. */
  def updateConfig(request: Fields): Request[GoogleCloudRecommenderV1InsightTypeConfig] = js.native
  def updateConfig(request: Key, body: GoogleCloudRecommenderV1InsightTypeConfig): Request[GoogleCloudRecommenderV1InsightTypeConfig] = js.native
}
