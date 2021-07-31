package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContainersResponse extends StObject {
  
  /** All Containers of a GTM Account. */
  var container: js.UndefOr[js.Array[Container]] = js.undefined
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListContainersResponse {
  
  @scala.inline
  def apply(): ListContainersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainersResponse]
  }
  
  @scala.inline
  implicit class ListContainersResponseMutableBuilder[Self <: ListContainersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: js.Array[Container]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContainerVarargs(value: Container*): Self = StObject.set(x, "container", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
