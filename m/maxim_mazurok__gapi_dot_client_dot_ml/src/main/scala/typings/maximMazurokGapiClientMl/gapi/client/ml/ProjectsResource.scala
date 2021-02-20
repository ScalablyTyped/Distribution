package typings.maximMazurokGapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMl.anon.Alt
import typings.maximMazurokGapiClientMl.anon.NameOauthtoken
import typings.maximMazurokGapiClientMl.anon.OauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  def explain(request: Alt, body: GoogleCloudMlV1ExplainRequest): Request[GoogleApiHttpBody] = js.native
  /** Performs explanation on the data in the request. {% dynamic include "/ai-platform/includes/___explain-request" %} */
  def explain(request: NameOauthtoken): Request[GoogleApiHttpBody] = js.native
  
  /**
    * Get the service account information associated with your project. You need this information in order to grant the service account permissions for the Google Cloud Storage location
    * where you put your model training code for training the model with Google Cloud Machine Learning.
    */
  def getConfig(): Request[GoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(request: Alt): Request[GoogleCloudMlV1GetConfigResponse] = js.native
  
  var jobs: JobsResource = js.native
  
  var locations: LocationsResource = js.native
  
  var models: ModelsResource = js.native
  
  var operations: OperationsResource = js.native
  
  def predict(request: Alt, body: GoogleCloudMlV1PredictRequest): Request[GoogleApiHttpBody] = js.native
  /** Performs online prediction on the data in the request. {% dynamic include "/ai-platform/includes/___predict-request" %} */
  def predict(request: OauthtokenPrettyPrint): Request[GoogleApiHttpBody] = js.native
}
