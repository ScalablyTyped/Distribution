package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends js.Object {
  
  /** The individual upload requests. */
  var requests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]] = js.native
}
object BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestOps[Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestsVarargs(value: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
}
