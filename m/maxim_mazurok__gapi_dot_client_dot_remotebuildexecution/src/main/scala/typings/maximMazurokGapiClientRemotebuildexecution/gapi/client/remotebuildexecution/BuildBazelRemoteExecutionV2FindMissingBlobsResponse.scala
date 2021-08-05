package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2FindMissingBlobsResponse extends StObject {
  
  /** A list of the blobs requested *not* present in the storage. */
  var missingBlobDigests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Digest]] = js.undefined
}
object BuildBazelRemoteExecutionV2FindMissingBlobsResponse {
  
  inline def apply(): BuildBazelRemoteExecutionV2FindMissingBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2FindMissingBlobsResponse](x: Self) {
    
    inline def setMissingBlobDigests(value: js.Array[BuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "missingBlobDigests", value.asInstanceOf[js.Any])
    
    inline def setMissingBlobDigestsUndefined: Self = StObject.set(x, "missingBlobDigests", js.undefined)
    
    inline def setMissingBlobDigestsVarargs(value: BuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "missingBlobDigests", js.Array(value :_*))
  }
}
