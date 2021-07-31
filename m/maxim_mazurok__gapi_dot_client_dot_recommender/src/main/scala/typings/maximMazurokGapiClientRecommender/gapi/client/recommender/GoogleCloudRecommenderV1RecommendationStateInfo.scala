package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1RecommendationStateInfo extends StObject {
  
  /** The state of the recommendation, Eg ACTIVE, SUCCEEDED, FAILED. */
  var state: js.UndefOr[String] = js.undefined
  
  /** A map of metadata for the state, provided by user or automations systems. */
  var stateMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1RecommendationStateInfo & TopLevel[js.Any]
  ] = js.undefined
}
object GoogleCloudRecommenderV1RecommendationStateInfo {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1RecommendationStateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommendationStateInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1RecommendationStateInfoMutableBuilder[Self <: GoogleCloudRecommenderV1RecommendationStateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1RecommendationStateInfo & TopLevel[js.Any]
    ): Self = StObject.set(x, "stateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMetadataUndefined: Self = StObject.set(x, "stateMetadata", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
