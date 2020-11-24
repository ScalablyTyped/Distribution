package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1Insight extends js.Object {
  
  /** Recommendations derived from this insight. */
  var associatedRecommendations: js.UndefOr[js.Array[GoogleCloudRecommenderV1InsightRecommendationReference]] = js.native
  
  /** Category being targeted by the insight. */
  var category: js.UndefOr[String] = js.native
  
  /** A struct of custom fields to explain the insight. Example: "grantedPermissionsCount": "1000" */
  var content: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1Insight with TopLevel[js.Any]
  ] = js.native
  
  /** Free-form human readable summary in English. The maximum length is 500 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Fingerprint of the Insight. Provides optimistic locking when updating states. */
  var etag: js.UndefOr[String] = js.native
  
  /** Insight subtype. Insight content schema will be stable for a given subtype. */
  var insightSubtype: js.UndefOr[String] = js.native
  
  /** Timestamp of the latest data used to generate the insight. */
  var lastRefreshTime: js.UndefOr[String] = js.native
  
  /** Name of the insight. */
  var name: js.UndefOr[String] = js.native
  
  /** Observation period that led to the insight. The source data used to generate the insight ends at last_refresh_time and begins at (last_refresh_time - observation_period). */
  var observationPeriod: js.UndefOr[String] = js.native
  
  /** Information state and metadata. */
  var stateInfo: js.UndefOr[GoogleCloudRecommenderV1InsightStateInfo] = js.native
  
  /** Fully qualified resource names that this insight is targeting. */
  var targetResources: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudRecommenderV1Insight {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1Insight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Insight]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1InsightOps[Self <: GoogleCloudRecommenderV1Insight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedRecommendationsVarargs(value: GoogleCloudRecommenderV1InsightRecommendationReference*): Self = this.set("associatedRecommendations", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedRecommendations(value: js.Array[GoogleCloudRecommenderV1InsightRecommendationReference]): Self = this.set("associatedRecommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedRecommendations: Self = this.set("associatedRecommendations", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContent(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.GoogleCloudRecommenderV1Insight with TopLevel[js.Any]
    ): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setInsightSubtype(value: String): Self = this.set("insightSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightSubtype: Self = this.set("insightSubtype", js.undefined)
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = this.set("lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshTime: Self = this.set("lastRefreshTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setObservationPeriod(value: String): Self = this.set("observationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservationPeriod: Self = this.set("observationPeriod", js.undefined)
    
    @scala.inline
    def setStateInfo(value: GoogleCloudRecommenderV1InsightStateInfo): Self = this.set("stateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateInfo: Self = this.set("stateInfo", js.undefined)
    
    @scala.inline
    def setTargetResourcesVarargs(value: String*): Self = this.set("targetResources", js.Array(value :_*))
    
    @scala.inline
    def setTargetResources(value: js.Array[String]): Self = this.set("targetResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetResources: Self = this.set("targetResources", js.undefined)
  }
}
