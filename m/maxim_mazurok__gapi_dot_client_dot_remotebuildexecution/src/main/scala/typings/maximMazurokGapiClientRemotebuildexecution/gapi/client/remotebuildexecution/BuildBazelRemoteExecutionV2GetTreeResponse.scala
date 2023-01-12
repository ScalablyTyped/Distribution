package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2GetTreeResponse extends StObject {
  
  /** The directories descended from the requested root. */
  var directories: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2Directory]] = js.undefined
  
  /**
    * If present, signifies that there are more results which the client can retrieve by passing this as the page_token in a subsequent request. If empty, signifies that this is the last
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2GetTreeResponse {
  
  inline def apply(): BuildBazelRemoteExecutionV2GetTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2GetTreeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBazelRemoteExecutionV2GetTreeResponse] (val x: Self) extends AnyVal {
    
    inline def setDirectories(value: js.Array[BuildBazelRemoteExecutionV2Directory]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: BuildBazelRemoteExecutionV2Directory*): Self = StObject.set(x, "directories", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
