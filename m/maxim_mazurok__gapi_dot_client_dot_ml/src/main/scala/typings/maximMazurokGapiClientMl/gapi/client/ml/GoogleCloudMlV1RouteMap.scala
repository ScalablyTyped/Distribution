package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1RouteMap extends js.Object {
  
  /**
    * HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container's IP address and port to check that the
    * container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI
    * Platform Prediction intermittently sends a GET request to the following URL on the container: localhost:PORT/bar PORT refers to the first value of Version.container.ports. If you
    * don't specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the
    * parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. *
    * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID/models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as
    * provided to projects.models.versions.create.
    */
  var health: js.UndefOr[String] = js.native
  
  /**
    * HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container's IP address and port.
    * AI Platform Prediction then returns the container's response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a
    * prediction request, it forwards the request body in a POST request to the following URL on the container: localhost:PORT/foo PORT refers to the first value of
    * Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced
    * as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as
    * provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID/models/MODEL/versions/" prefix that the API returns in
    * output; it is the bare version name, as provided to projects.models.versions.create.
    */
  var predict: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1RouteMap {
  
  @scala.inline
  def apply(): GoogleCloudMlV1RouteMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1RouteMap]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1RouteMapOps[Self <: GoogleCloudMlV1RouteMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHealth(value: String): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    
    @scala.inline
    def setPredict(value: String): Self = this.set("predict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredict: Self = this.set("predict", js.undefined)
  }
}
