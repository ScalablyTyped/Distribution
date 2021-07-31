package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse extends StObject {
  
  /** The raw binary data. */
  var data: js.UndefOr[String] = js.undefined
  
  /** The digest to which this response corresponds. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /** The result of attempting to download that blob. */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
}
object BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponseMutableBuilder[Self <: BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
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
