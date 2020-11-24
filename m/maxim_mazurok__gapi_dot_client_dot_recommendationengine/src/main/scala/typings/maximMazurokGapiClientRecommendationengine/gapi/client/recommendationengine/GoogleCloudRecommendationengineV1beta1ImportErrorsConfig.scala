package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ImportErrorsConfig extends js.Object {
  
  /**
    * Google Cloud Storage path for import errors. This must be an empty, existing Cloud Storage bucket. Import errors will be written to a file in this bucket, one per line, as a
    * JSON-encoded `google.rpc.Status` message.
    */
  var gcsPrefix: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ImportErrorsConfig {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ImportErrorsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImportErrorsConfigOps[Self <: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] (val x: Self) extends AnyVal {
    
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
    def setGcsPrefix(value: String): Self = this.set("gcsPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsPrefix: Self = this.set("gcsPrefix", js.undefined)
  }
}
