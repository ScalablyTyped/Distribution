package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2BatchReadBlobsRequest extends StObject {
  
  /** The individual blob digests. */
  var digests: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Digest]] = js.native
}
object BuildBazelRemoteExecutionV2BatchReadBlobsRequest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2BatchReadBlobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2BatchReadBlobsRequest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2BatchReadBlobsRequestMutableBuilder[Self <: BuildBazelRemoteExecutionV2BatchReadBlobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigests(value: js.Array[BuildBazelRemoteExecutionV2Digest]): Self = StObject.set(x, "digests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestsUndefined: Self = StObject.set(x, "digests", js.undefined)
    
    @scala.inline
    def setDigestsVarargs(value: BuildBazelRemoteExecutionV2Digest*): Self = StObject.set(x, "digests", js.Array(value :_*))
  }
}
