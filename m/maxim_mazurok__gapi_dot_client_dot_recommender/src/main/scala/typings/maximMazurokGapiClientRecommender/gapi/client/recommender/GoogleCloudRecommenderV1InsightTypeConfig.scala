package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1InsightTypeConfig extends StObject {
  
  /**
    * Allows clients to store small amounts of arbitrary data. Annotations must follow the Kubernetes syntax. The total size of all keys and values combined is limited to 256k. Key can
    * have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
    * alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
    */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** A user-settable field to provide a human-readable name to be used in user interfaces. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Fingerprint of the InsightTypeConfig. Provides optimistic locking when updating. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** InsightTypeGenerationConfig which configures the generation of insights for this insight type. */
  var insightTypeGenerationConfig: js.UndefOr[GoogleCloudRecommenderV1InsightTypeGenerationConfig] = js.undefined
  
  /** Name of insight type config. Eg, projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]/config */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. The revision ID of the config. A new revision is committed whenever the config is changed in any way. The format is an 8-character hexadecimal string. */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /** Last time when the config was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1InsightTypeConfig {
  
  inline def apply(): GoogleCloudRecommenderV1InsightTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1InsightTypeConfig]
  }
  
  extension [Self <: GoogleCloudRecommenderV1InsightTypeConfig](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setInsightTypeGenerationConfig(value: GoogleCloudRecommenderV1InsightTypeGenerationConfig): Self = StObject.set(x, "insightTypeGenerationConfig", value.asInstanceOf[js.Any])
    
    inline def setInsightTypeGenerationConfigUndefined: Self = StObject.set(x, "insightTypeGenerationConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
