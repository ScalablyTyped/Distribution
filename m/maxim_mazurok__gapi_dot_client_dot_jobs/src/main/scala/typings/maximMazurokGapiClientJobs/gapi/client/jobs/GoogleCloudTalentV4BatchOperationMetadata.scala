package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4BatchOperationMetadata extends StObject {
  
  /** The time when the batch operation is created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The time when the batch operation is finished and google.longrunning.Operation.done is set to `true`. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Count of failed item(s) inside an operation. */
  var failureCount: js.UndefOr[Double] = js.undefined
  
  /** The state of a long running operation. */
  var state: js.UndefOr[String] = js.undefined
  
  /** More detailed information about operation state. */
  var stateDescription: js.UndefOr[String] = js.undefined
  
  /** Count of successful item(s) inside an operation. */
  var successCount: js.UndefOr[Double] = js.undefined
  
  /** Count of total item(s) inside an operation. */
  var totalCount: js.UndefOr[Double] = js.undefined
  
  /** The time when the batch operation status is updated. The metadata and the update_time is refreshed every minute otherwise cached data is returned. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudTalentV4BatchOperationMetadata {
  
  inline def apply(): GoogleCloudTalentV4BatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4BatchOperationMetadata]
  }
  
  extension [Self <: GoogleCloudTalentV4BatchOperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDescription(value: String): Self = StObject.set(x, "stateDescription", value.asInstanceOf[js.Any])
    
    inline def setStateDescriptionUndefined: Self = StObject.set(x, "stateDescription", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
