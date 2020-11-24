package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4BatchOperationMetadata extends js.Object {
  
  /** The time when the batch operation is created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The time when the batch operation is finished and google.longrunning.Operation.done is set to `true`. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Count of failed item(s) inside an operation. */
  var failureCount: js.UndefOr[Double] = js.native
  
  /** The state of a long running operation. */
  var state: js.UndefOr[String] = js.native
  
  /** More detailed information about operation state. */
  var stateDescription: js.UndefOr[String] = js.native
  
  /** Count of successful item(s) inside an operation. */
  var successCount: js.UndefOr[Double] = js.native
  
  /** Count of total item(s) inside an operation. */
  var totalCount: js.UndefOr[Double] = js.native
  
  /** The time when the batch operation status is updated. The metadata and the update_time is refreshed every minute otherwise cached data is returned. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudTalentV4BatchOperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4BatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4BatchOperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4BatchOperationMetadataOps[Self <: GoogleCloudTalentV4BatchOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFailureCount(value: Double): Self = this.set("failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCount: Self = this.set("failureCount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateDescription(value: String): Self = this.set("stateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateDescription: Self = this.set("stateDescription", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: Double): Self = this.set("successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessCount: Self = this.set("successCount", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
