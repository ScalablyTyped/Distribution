package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse extends StObject {
  
  /** The blob digest to which this response corresponds. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /** The result of attempting to upload that blob. */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
}
object BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponseMutableBuilder[Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
