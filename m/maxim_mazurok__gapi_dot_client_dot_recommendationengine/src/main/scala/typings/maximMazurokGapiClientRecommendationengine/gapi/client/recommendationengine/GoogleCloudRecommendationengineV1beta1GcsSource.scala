package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1GcsSource extends StObject {
  
  /**
    * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs can match the full object path (for example, `gs://bucket/directory/object.json`) or
    * a pattern matching one or more files, such as `gs://bucket/directory/ *.json`. A request can contain at most 100 files, and each file can be up to 2 GB. See [Importing catalog
    * information](/recommendations-ai/docs/upload-catalog) for the expected file format and setup instructions.
    */
  var inputUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The schema to use when parsing the data from the source. Supported values for catalog imports: 1: "catalog_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#json (Default for catalogItems.import) 2: "catalog_merchant_center" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#mc Supported values for user events imports: 1: "user_events_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/manage-user-events#import (Default for userEvents.import) 2. "user_events_ga360" using
    * https://support.google.com/analytics/answer/3437719?hl=en
    */
  var jsonSchema: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1GcsSource {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1GcsSource]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1GcsSource](x: Self) {
    
    inline def setInputUris(value: js.Array[String]): Self = StObject.set(x, "inputUris", value.asInstanceOf[js.Any])
    
    inline def setInputUrisUndefined: Self = StObject.set(x, "inputUris", js.undefined)
    
    inline def setInputUrisVarargs(value: String*): Self = StObject.set(x, "inputUris", js.Array(value*))
    
    inline def setJsonSchema(value: String): Self = StObject.set(x, "jsonSchema", value.asInstanceOf[js.Any])
    
    inline def setJsonSchemaUndefined: Self = StObject.set(x, "jsonSchema", js.undefined)
  }
}
