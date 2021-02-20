package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1RequestLoggingConfig extends StObject {
  
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
  implicit class GoogleCloudMlV1RequestLoggingConfigMutableBuilder[Self <: GoogleCloudMlV1RequestLoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryTableName(value: String): Self = StObject.set(x, "bigqueryTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryTableNameUndefined: Self = StObject.set(x, "bigqueryTableName", js.undefined)
    
    @scala.inline
    def setSamplingPercentage(value: Double): Self = StObject.set(x, "samplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingPercentageUndefined: Self = StObject.set(x, "samplingPercentage", js.undefined)
  }
}
