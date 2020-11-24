package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMetadata extends js.Object {
  
  /** The name of the API method that initiated the operation. */
  var apiMethodName: js.UndefOr[String] = js.native
  
  /** Specifies if cancellation was requested for the operation. */
  var cancelRequested: js.UndefOr[Boolean] = js.native
  
  var counter: js.UndefOr[ProgressCounter] = js.native
  
  /** The time at which the operation was created by the API. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The time at which execution was completed. */
  var endTime: js.UndefOr[String] = js.native
  
  /** A link to audit and error logs in the log viewer. Error logs are generated only by some operations, listed at [Viewing logs](/healthcare/docs/how-tos/logging). */
  var logsUrl: js.UndefOr[String] = js.native
}
object OperationMetadata {
  
  @scala.inline
  def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  @scala.inline
  implicit class OperationMetadataOps[Self <: OperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setApiMethodName(value: String): Self = this.set("apiMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiMethodName: Self = this.set("apiMethodName", js.undefined)
    
    @scala.inline
    def setCancelRequested(value: Boolean): Self = this.set("cancelRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelRequested: Self = this.set("cancelRequested", js.undefined)
    
    @scala.inline
    def setCounter(value: ProgressCounter): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setLogsUrl(value: String): Self = this.set("logsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogsUrl: Self = this.set("logsUrl", js.undefined)
  }
}
