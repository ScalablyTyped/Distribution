package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2FindMissingBlobsRequest extends StObject {
  
  /** A list of the blobs to check. */
  var blobDigests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Digest]] = js.undefined
}
object BuildBazelRemoteExecutionV2FindMissingBlobsRequest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2FindMissingBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2FindMissingBlobsRequest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2FindMissingBlobsRequestMutableBuilder[Self <: BuildBazelRemoteExecutionV2FindMissingBlobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobDigests(value: js.Array[BuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "blobDigests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobDigestsUndefined: Self = StObject.set(x, "blobDigests", js.undefined)
    
    @scala.inline
    def setBlobDigestsVarargs(value: BuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "blobDigests", js.Array(value :_*))
  }
}
