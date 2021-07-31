package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest extends StObject {
  
  /** The raw binary data. */
  var data: js.UndefOr[String] = js.undefined
  
  /** The digest of the blob. This MUST be the digest of `data`. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
}
object BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequestMutableBuilder[Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
