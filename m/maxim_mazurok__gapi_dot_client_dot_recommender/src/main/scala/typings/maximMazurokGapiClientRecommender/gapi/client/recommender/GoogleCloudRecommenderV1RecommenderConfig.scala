package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1RecommenderConfig extends StObject {
  
  /**
    * Allows clients to store small amounts of arbitrary data. Annotations must follow the Kubernetes syntax. The total size of all keys and values combined is limited to 256k. Key can
    * have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
    * alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
    */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1RecommenderConfig & TopLevel[Any]
  ] = js.undefined
  
  /** A user-settable field to provide a human-readable name to be used in user interfaces. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Fingerprint of the RecommenderConfig. Provides optimistic locking when updating. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Name of recommender config. Eg, projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config */
  var name: js.UndefOr[String] = js.undefined
  
  /** RecommenderGenerationConfig which configures the Generation of recommendations for this recommender. */
  var recommenderGenerationConfig: js.UndefOr[GoogleCloudRecommenderV1RecommenderGenerationConfig] = js.undefined
  
  /** Output only. Immutable. The revision ID of the config. A new revision is committed whenever the config is changed in any way. The format is an 8-character hexadecimal string. */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /** Last time when the config was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1RecommenderConfig {
  
  inline def apply(): GoogleCloudRecommenderV1RecommenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommenderConfig]
  }
  
  extension [Self <: GoogleCloudRecommenderV1RecommenderConfig](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1RecommenderConfig & TopLevel[Any]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecommenderGenerationConfig(value: GoogleCloudRecommenderV1RecommenderGenerationConfig): Self = StObject.set(x, "recommenderGenerationConfig", value.asInstanceOf[js.Any])
    
    inline def setRecommenderGenerationConfigUndefined: Self = StObject.set(x, "recommenderGenerationConfig", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
