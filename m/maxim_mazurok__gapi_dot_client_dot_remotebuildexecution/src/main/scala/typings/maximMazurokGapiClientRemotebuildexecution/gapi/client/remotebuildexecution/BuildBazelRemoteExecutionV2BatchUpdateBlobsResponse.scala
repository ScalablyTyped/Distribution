package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse extends StObject {
  
  /** The responses to the requests. */
  var responses: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]] = js.undefined
}
object BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse {
  
  inline def apply(): BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
