package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1MarkInsightAcceptedRequest extends StObject {
  
  /** Required. Fingerprint of the Insight. Provides optimistic locking. */
  var etag: js.UndefOr[String] = js.native
  
  /** Optional. State properties user wish to include with this state. Full replace of the current state_metadata. */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkInsightAcceptedRequest with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRecommenderV1MarkInsightAcceptedRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1MarkInsightAcceptedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1MarkInsightAcceptedRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1MarkInsightAcceptedRequestMutableBuilder[Self <: GoogleCloudRecommenderV1MarkInsightAcceptedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkInsightAcceptedRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
  }
}
