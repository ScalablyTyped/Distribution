package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2FindMissingBlobsResponse extends js.Object {
  
  /** A list of the blobs requested *not* present in the storage. */
  var missingBlobDigests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Digest]] = js.native
}
object BuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2FindMissingBlobsResponseOps[Self <: BuildBazelRemoteExecutionV2FindMissingBlobsResponse] (val x: Self) extends AnyVal {
    
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
    def setMissingBlobDigestsVarargs(value: BuildBazelRemoteExecutionV2Digest*): Self = this.set("missingBlobDigests", js.Array(value :_*))
    
    @scala.inline
    def setMissingBlobDigests(value: js.Array[BuildBazelRemoteExecutionV2Digest]): Self = this.set("missingBlobDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingBlobDigests: Self = this.set("missingBlobDigests", js.undefined)
  }
}
