package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2BatchReadBlobsResponse extends StObject {
  
  /** The responses to the requests. */
  var responses: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]] = js.native
}
object BuildBazelRemoteExecutionV2BatchReadBlobsResponse {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchReadBlobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchReadBlobsResponseMutableBuilder[Self <: BuildBazelRemoteExecutionV2BatchReadBlobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: BuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
