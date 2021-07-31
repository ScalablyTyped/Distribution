package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ImportErrorsConfig extends StObject {
  
  /**
    * Google Cloud Storage path for import errors. This must be an empty, existing Cloud Storage bucket. Import errors will be written to a file in this bucket, one per line, as a
    * JSON-encoded `google.rpc.Status` message.
    */
  var gcsPrefix: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ImportErrorsConfig {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ImportErrorsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImportErrorsConfigMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsPrefix(value: String): Self = StObject.set(x, "gcsPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsPrefixUndefined: Self = StObject.set(x, "gcsPrefix", js.undefined)
  }
}
