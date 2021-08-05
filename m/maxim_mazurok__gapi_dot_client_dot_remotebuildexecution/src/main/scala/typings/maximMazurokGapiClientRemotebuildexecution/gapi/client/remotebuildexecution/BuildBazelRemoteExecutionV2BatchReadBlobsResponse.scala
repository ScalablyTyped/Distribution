package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2BatchReadBlobsResponse extends StObject {
  
  /** The responses to the requests. */
  var responses: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]] = js.undefined
}
object BuildBazelRemoteExecutionV2BatchReadBlobsResponse {
  
  inline def apply(): BuildBazelRemoteExecutionV2BatchReadBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2BatchReadBlobsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
