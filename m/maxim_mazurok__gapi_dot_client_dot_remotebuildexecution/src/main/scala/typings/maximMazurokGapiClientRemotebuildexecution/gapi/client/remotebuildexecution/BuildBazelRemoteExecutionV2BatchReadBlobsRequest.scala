package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2BatchReadBlobsRequest extends StObject {
  
  /** The individual blob digests. */
  var digests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Digest]] = js.undefined
}
object BuildBazelRemoteExecutionV2BatchReadBlobsRequest {
  
  inline def apply(): BuildBazelRemoteExecutionV2BatchReadBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchReadBlobsRequest]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2BatchReadBlobsRequest](x: Self) {
    
    inline def setDigests(value: js.Array[BuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "digests", value.asInstanceOf[js.Any])
    
    inline def setDigestsUndefined: Self = StObject.set(x, "digests", js.undefined)
    
    inline def setDigestsVarargs(value: BuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "digests", js.Array(value :_*))
  }
}
