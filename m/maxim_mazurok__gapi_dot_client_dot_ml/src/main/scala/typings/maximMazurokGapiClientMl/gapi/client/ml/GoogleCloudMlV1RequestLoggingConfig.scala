package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1RequestLoggingConfig extends js.Object {
  
  /**
    * Required. Fully qualified BigQuery table name in the following format: " project_id.dataset_name.table_name" The specified table must already exist, and the "Cloud ML Service Agent"
    * for your project must have permission to write to it. The table must have the following [schema](/bigquery/docs/schemas): Field nameType Mode model STRING REQUIRED model_version
    * STRING REQUIRED time TIMESTAMP REQUIRED raw_data STRING REQUIRED raw_prediction STRING NULLABLE groundtruth STRING NULLABLE
    */
  var bigqueryTableName: js.UndefOr[String] = js.native
  
  /**
    * Percentage of requests to be logged, expressed as a fraction from 0 to 1. For example, if you want to log 10% of requests, enter `0.1`. The sampling window is the lifetime of the
    * model version. Defaults to 0.
    */
  var samplingPercentage: js.UndefOr[Double] = js.native
}
object GoogleCloudMlV1RequestLoggingConfig {
  
  @scala.inline
  def apply(): GoogleCloudMlV1RequestLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1RequestLoggingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1RequestLoggingConfigOps[Self <: GoogleCloudMlV1RequestLoggingConfig] (val x: Self) extends AnyVal {
    
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
    def setBigqueryTableName(value: String): Self = this.set("bigqueryTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryTableName: Self = this.set("bigqueryTableName", js.undefined)
    
    @scala.inline
    def setSamplingPercentage(value: Double): Self = this.set("samplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingPercentage: Self = this.set("samplingPercentage", js.undefined)
  }
}
