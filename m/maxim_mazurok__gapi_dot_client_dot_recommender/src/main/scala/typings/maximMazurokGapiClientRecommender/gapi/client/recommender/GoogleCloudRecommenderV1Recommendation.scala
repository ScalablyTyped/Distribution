package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1Recommendation extends StObject {
  
  /** Optional set of additional impact that this recommendation may have when trying to optimize for the primary category. These may be positive or negative. */
  var additionalImpact: js.UndefOr[js.Array[GoogleCloudRecommenderV1Impact]] = js.undefined
  
  /** Insights that led to this recommendation. */
  var associatedInsights: js.UndefOr[js.Array[GoogleCloudRecommenderV1RecommendationInsightReference]] = js.undefined
  
  /** Content of the recommendation describing recommended changes to resources. */
  var content: js.UndefOr[GoogleCloudRecommenderV1RecommendationContent] = js.undefined
  
  /** Free-form human readable summary in English. The maximum length is 500 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Fingerprint of the Recommendation. Provides optimistic locking when updating states. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Last time this recommendation was refreshed by the system that created it in the first place. */
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  
  /** Name of recommendation. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The primary impact that this recommendation can have while trying to optimize for one category. */
  var primaryImpact: js.UndefOr[GoogleCloudRecommenderV1Impact] = js.undefined
  
  /** Recommendation's priority. */
  var priority: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an identifier for a subtype of recommendations produced for the same recommender. Subtype is a function of content and impact, meaning a new subtype might be added when
    * significant changes to `content` or `primary_impact.category` are introduced. See the Recommenders section to see a list of subtypes for a given Recommender. Examples: For
    * recommender = "google.iam.policy.Recommender", recommender_subtype can be one of "REMOVE_ROLE"/"REPLACE_ROLE"
    */
  var recommenderSubtype: js.UndefOr[String] = js.undefined
  
  /** Information for state. Contains state and metadata. */
  var stateInfo: js.UndefOr[GoogleCloudRecommenderV1RecommendationStateInfo] = js.undefined
  
  /**
    * Corresponds to a mutually exclusive group ID within a recommender. A non-empty ID indicates that the recommendation belongs to a mutually exclusive group. This means that only one
    * recommendation within the group is suggested to be applied.
    */
  var xorGroupId: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1Recommendation {
  
  inline def apply(): GoogleCloudRecommenderV1Recommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Recommendation]
  }
  
  extension [Self <: GoogleCloudRecommenderV1Recommendation](x: Self) {
    
    inline def setAdditionalImpact(value: js.Array[GoogleCloudRecommenderV1Impact]): Self = StObject.set(x, "additionalImpact", value.asInstanceOf[js.Any])
    
    inline def setAdditionalImpactUndefined: Self = StObject.set(x, "additionalImpact", js.undefined)
    
    inline def setAdditionalImpactVarargs(value: GoogleCloudRecommenderV1Impact*): Self = StObject.set(x, "additionalImpact", js.Array(value*))
    
    inline def setAssociatedInsights(value: js.Array[GoogleCloudRecommenderV1RecommendationInsightReference]): Self = StObject.set(x, "associatedInsights", value.asInstanceOf[js.Any])
    
    inline def setAssociatedInsightsUndefined: Self = StObject.set(x, "associatedInsights", js.undefined)
    
    inline def setAssociatedInsightsVarargs(value: GoogleCloudRecommenderV1RecommendationInsightReference*): Self = StObject.set(x, "associatedInsights", js.Array(value*))
    
    inline def setContent(value: GoogleCloudRecommenderV1RecommendationContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryImpact(value: GoogleCloudRecommenderV1Impact): Self = StObject.set(x, "primaryImpact", value.asInstanceOf[js.Any])
    
    inline def setPrimaryImpactUndefined: Self = StObject.set(x, "primaryImpact", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRecommenderSubtype(value: String): Self = StObject.set(x, "recommenderSubtype", value.asInstanceOf[js.Any])
    
    inline def setRecommenderSubtypeUndefined: Self = StObject.set(x, "recommenderSubtype", js.undefined)
    
    inline def setStateInfo(value: GoogleCloudRecommenderV1RecommendationStateInfo): Self = StObject.set(x, "stateInfo", value.asInstanceOf[js.Any])
    
    inline def setStateInfoUndefined: Self = StObject.set(x, "stateInfo", js.undefined)
    
    inline def setXorGroupId(value: String): Self = StObject.set(x, "xorGroupId", value.asInstanceOf[js.Any])
    
    inline def setXorGroupIdUndefined: Self = StObject.set(x, "xorGroupId", js.undefined)
  }
}
