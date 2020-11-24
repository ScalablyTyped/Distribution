package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMetadata extends js.Object {
  
  /** API version. */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** Specifies if cancellation was requested for the operation. */
  var cancelRequested: js.UndefOr[Boolean] = js.native
  
  /** The time the operation was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The time the operation finished running. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Human-readable status of the operation, if any. */
  var statusDetail: js.UndefOr[String] = js.native
  
  /** Target of the operation - for example projects/project-1/locations/global/connectivityTests/test-1 */
  var target: js.UndefOr[String] = js.native
  
  /** Name of the verb executed by the operation. */
  var verb: js.UndefOr[String] = js.native
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setCancelRequested(value: Boolean): Self = this.set("cancelRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelRequested: Self = this.set("cancelRequested", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStatusDetail(value: String): Self = this.set("statusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetail: Self = this.set("statusDetail", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
}
