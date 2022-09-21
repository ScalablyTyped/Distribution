package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest extends StObject {
  
  /** The individual upload requests. */
  var requests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]] = js.undefined
}
object BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest {
  
  inline def apply(): BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
