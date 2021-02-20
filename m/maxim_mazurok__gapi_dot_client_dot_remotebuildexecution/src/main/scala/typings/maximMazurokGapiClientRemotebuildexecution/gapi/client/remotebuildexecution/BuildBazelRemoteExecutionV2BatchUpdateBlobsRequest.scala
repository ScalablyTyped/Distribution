package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends StObject {
  
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
  implicit class BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestMutableBuilder[Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
