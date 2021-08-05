package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1Insight extends StObject {
  
  /** Recommendations derived from this insight. */
  var associatedRecommendations: js.UndefOr[js.Array[GoogleCloudRecommenderV1InsightRecommendationReference]] = js.undefined
  
  /** Category being targeted by the insight. */
  var category: js.UndefOr[String] = js.undefined
  
  /** A struct of custom fields to explain the insight. Example: "grantedPermissionsCount": "1000" */
  var content: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1Insight & TopLevel[js.Any]
  ] = js.undefined
  
  /** Free-form human readable summary in English. The maximum length is 500 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Fingerprint of the Insight. Provides optimistic locking when updating states. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Insight subtype. Insight content schema will be stable for a given subtype. */
  var insightSubtype: js.UndefOr[String] = js.undefined
  
  /** Timestamp of the latest data used to generate the insight. */
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  
  /** Name of the insight. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Observation period that led to the insight. The source data used to generate the insight ends at last_refresh_time and begins at (last_refresh_time - observation_period). */
  var observationPeriod: js.UndefOr[String] = js.undefined
  
  /** Information state and metadata. */
  var stateInfo: js.UndefOr[GoogleCloudRecommenderV1InsightStateInfo] = js.undefined
  
  /** Fully qualified resource names that this insight is targeting. */
  var targetResources: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudRecommenderV1Insight {
  
  inline def apply(): GoogleCloudRecommenderV1Insight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Insight]
  }
  
  extension [Self <: GoogleCloudRecommenderV1Insight](x: Self) {
    
    inline def setAssociatedRecommendations(value: js.Array[GoogleCloudRecommenderV1InsightRecommendationReference]): Self = StObject.set(x, "associatedRecommendations", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRecommendationsUndefined: Self = StObject.set(x, "associatedRecommendations", js.undefined)
    
    inline def setAssociatedRecommendationsVarargs(value: GoogleCloudRecommenderV1InsightRecommendationReference*): Self = StObject.set(x, "associatedRecommendations", js.Array(value :_*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContent(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1Insight & TopLevel[js.Any]
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setInsightSubtype(value: String): Self = StObject.set(x, "insightSubtype", value.asInstanceOf[js.Any])
    
    inline def setInsightSubtypeUndefined: Self = StObject.set(x, "insightSubtype", js.undefined)
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObservationPeriod(value: String): Self = StObject.set(x, "observationPeriod", value.asInstanceOf[js.Any])
    
    inline def setObservationPeriodUndefined: Self = StObject.set(x, "observationPeriod", js.undefined)
    
    inline def setStateInfo(value: GoogleCloudRecommenderV1InsightStateInfo): Self = StObject.set(x, "stateInfo", value.asInstanceOf[js.Any])
    
    inline def setStateInfoUndefined: Self = StObject.set(x, "stateInfo", js.undefined)
    
    inline def setTargetResources(value: js.Array[String]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    inline def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    inline def setTargetResourcesVarargs(value: String*): Self = StObject.set(x, "targetResources", js.Array(value :_*))
  }
}
