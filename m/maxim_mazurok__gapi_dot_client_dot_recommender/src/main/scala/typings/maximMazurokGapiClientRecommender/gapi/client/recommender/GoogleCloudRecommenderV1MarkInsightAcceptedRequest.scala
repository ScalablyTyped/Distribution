package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1MarkInsightAcceptedRequest extends StObject {
  
  /** Required. Fingerprint of the Insight. Provides optimistic locking. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Optional. State properties user wish to include with this state. Full replace of the current state_metadata. */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkInsightAcceptedRequest & TopLevel[js.Any]
  ] = js.undefined
}
object GoogleCloudRecommenderV1MarkInsightAcceptedRequest {
  
  inline def apply(): GoogleCloudRecommenderV1MarkInsightAcceptedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1MarkInsightAcceptedRequest]
  }
  
  extension [Self <: GoogleCloudRecommenderV1MarkInsightAcceptedRequest](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1MarkInsightAcceptedRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    inline def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
  }
}
