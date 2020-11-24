package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2FindMissingBlobsRequest extends js.Object {
  
  /** A list of the blobs to check. */
  var blobDigests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Digest]] = js.native
}
object BuildBazelRemoteExecutionV2FindMissingBlobsRequest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2FindMissingBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2FindMissingBlobsRequest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2FindMissingBlobsRequestOps[Self <: BuildBazelRemoteExecutionV2FindMissingBlobsRequest] (val x: Self) extends AnyVal {
    
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
    def setBlobDigestsVarargs(value: BuildBazelRemoteExecutionV2Digest*): Self = this.set("blobDigests", js.Array(value :_*))
    
    @scala.inline
    def setBlobDigests(value: js.Array[BuildBazelRemoteExecutionV2Digest]): Self = this.set("blobDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobDigests: Self = this.set("blobDigests", js.undefined)
  }
}
