package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1RouteMap extends StObject {
  
  /**
    * HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container's IP address and port to check that the
    * container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI
    * Platform Prediction intermittently sends a GET request to the following URL on the container: localhost:PORT/bar PORT refers to the first value of Version.container.ports. If you
    * don't specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the
    * parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. *
    * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID/models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as
    * provided to projects.models.versions.create.
    */
  var health: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container's IP address and port.
    * AI Platform Prediction then returns the container's response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a
    * prediction request, it forwards the request body in a POST request to the following URL on the container: localhost:PORT/foo PORT refers to the first value of
    * Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced
    * as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as
    * provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID/models/MODEL/versions/" prefix that the API returns in
    * output; it is the bare version name, as provided to projects.models.versions.create.
    */
  var predict: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1RouteMap {
  
  inline def apply(): GoogleCloudMlV1RouteMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1RouteMap]
  }
  
  extension [Self <: GoogleCloudMlV1RouteMap](x: Self) {
    
    inline def setHealth(value: String): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setPredict(value: String): Self = StObject.set(x, "predict", value.asInstanceOf[js.Any])
    
    inline def setPredictUndefined: Self = StObject.set(x, "predict", js.undefined)
  }
}
