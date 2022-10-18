package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1MarkRecommendationClaimedRequest extends StObject {
  
  /** Required. Fingerprint of the Recommendation. Provides optimistic locking. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * State properties to include with this state. Overwrites any existing `state_metadata`. Keys must match the regex `/^a-z0-9{0,62}$/`. Values must match the regex
    * `/^[a-zA-Z0-9_./-]{0,255}$/`.
    */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object GoogleCloudRecommenderV1MarkRecommendationClaimedRequest {
  
  inline def apply(): GoogleCloudRecommenderV1MarkRecommendationClaimedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1MarkRecommendationClaimedRequest]
  }
  
  extension [Self <: GoogleCloudRecommenderV1MarkRecommendationClaimedRequest](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setStateMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    inline def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
  }
}
