package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse extends StObject {
  
  /** The responses to the requests. */
  var responses: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]] = js.native
}
object BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseMutableBuilder[Self <: BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: BuildBazelRemoteExecutionV2BatchUpdateBlobsResponseResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
