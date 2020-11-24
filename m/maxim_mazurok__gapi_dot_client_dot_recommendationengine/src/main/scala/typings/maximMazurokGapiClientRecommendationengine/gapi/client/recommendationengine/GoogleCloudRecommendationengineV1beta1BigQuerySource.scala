package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1BigQuerySource extends js.Object {
  
  /**
    * Optional. The schema to use when parsing the data from the source. Supported values for catalog imports: 1: "catalog_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#json (Default for catalogItems.import) 2: "catalog_merchant_center" using
    * https://cloud.google.com/recommendations-ai/docs/upload-catalog#mc Supported values for user event imports: 1: "user_events_recommendations_ai" using
    * https://cloud.google.com/recommendations-ai/docs/manage-user-events#import (Default for userEvents.import) 2. "user_events_ga360" using
    * https://support.google.com/analytics/answer/3437719?hl=en
    */
  var dataSchema: js.UndefOr[String] = js.native
  
  /** Required. The BigQuery data set to copy the data from. */
  var datasetId: js.UndefOr[String] = js.native
  
  /** Optional. Intermediate Cloud Storage directory used for the import. Can be specified if one wants to have the BigQuery export to a specific Cloud Storage directory. */
  var gcsStagingDir: js.UndefOr[String] = js.native
  
  /** Optional. The project id (can be project # or id) that the BigQuery source is in. If not specified, inherits the project id from the parent request. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. The BigQuery table to copy the data from. */
  var tableId: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1BigQuerySource {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1BigQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1BigQuerySource]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1BigQuerySourceOps[Self <: GoogleCloudRecommendationengineV1beta1BigQuerySource] (val x: Self) extends AnyVal {
    
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
    def setDataSchema(value: String): Self = this.set("dataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSchema: Self = this.set("dataSchema", js.undefined)
    
    @scala.inline
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    
    @scala.inline
    def setGcsStagingDir(value: String): Self = this.set("gcsStagingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsStagingDir: Self = this.set("gcsStagingDir", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
  }
}
