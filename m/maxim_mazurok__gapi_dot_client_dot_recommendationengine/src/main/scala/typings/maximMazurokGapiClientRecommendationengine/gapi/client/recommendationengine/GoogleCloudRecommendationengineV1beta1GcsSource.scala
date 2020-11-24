package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1GcsSource extends js.Object {
  
  /**
    * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs can match the full object path (for example, gs://bucket/directory/object.json) or a
    * pattern matching one or more files, such as gs://bucket/directory/ *.json. A request can contain at most 100 files, and each file can be up to 2 GB. See [Importing catalog
    * information](/recommendations-ai/docs/upload-catalog) for the expected file format and setup instructions.
    */
  var inputUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The schema to use when parsing the data from the source. Supported values for catalog imports: 1: "catalog_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#json (Default for catalogItems.import) 2: "catalog_merchant_center" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#mc Supported values for user events imports: 1: "user_events_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/manage-user-events#import (Default for userEvents.import) 2. "user_events_ga360" using
    * https://support.google.com/analytics/answer/3437719?hl=en
    */
  var jsonSchema: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1GcsSource {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1GcsSource]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1GcsSourceOps[Self <: GoogleCloudRecommendationengineV1beta1GcsSource] (val x: Self) extends AnyVal {
    
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
    def setInputUrisVarargs(value: String*): Self = this.set("inputUris", js.Array(value :_*))
    
    @scala.inline
    def setInputUris(value: js.Array[String]): Self = this.set("inputUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUris: Self = this.set("inputUris", js.undefined)
    
    @scala.inline
    def setJsonSchema(value: String): Self = this.set("jsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonSchema: Self = this.set("jsonSchema", js.undefined)
  }
}
