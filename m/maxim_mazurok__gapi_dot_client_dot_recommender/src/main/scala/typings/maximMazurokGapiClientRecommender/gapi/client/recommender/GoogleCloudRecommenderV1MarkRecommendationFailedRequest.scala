package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1MarkRecommendationFailedRequest extends StObject {
  
  /** Required. Fingerprint of the Recommendation. Provides optimistic locking. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * State properties to include with this state. Overwrites any existing `state_metadata`. Keys must match the regex /^a-z0-9{0,62}$/. Values must match the regex
    * /^[a-zA-Z0-9_./-]{0,255}$/.
    */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkRecommendationFailedRequest & TopLevel[js.Any]
  ] = js.undefined
}
object GoogleCloudRecommenderV1MarkRecommendationFailedRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1MarkRecommendationFailedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1MarkRecommendationFailedRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1MarkRecommendationFailedRequestMutableBuilder[Self <: GoogleCloudRecommenderV1MarkRecommendationFailedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkRecommendationFailedRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
  }
}
