package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContainerVersionsResponse extends StObject {
  
  /** All container version headers of a GTM Container. */
  var containerVersionHeader: js.UndefOr[js.Array[ContainerVersionHeader]] = js.undefined
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListContainerVersionsResponse {
  
  @scala.inline
  def apply(): ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainerVersionsResponse]
  }
  
  @scala.inline
  implicit class ListContainerVersionsResponseMutableBuilder[Self <: ListContainerVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerVersionHeader(value: js.Array[ContainerVersionHeader]): Self = StObject.set(x, "containerVersionHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionHeaderUndefined: Self = StObject.set(x, "containerVersionHeader", js.undefined)
    
    @scala.inline
    def setContainerVersionHeaderVarargs(value: ContainerVersionHeader*): Self = StObject.set(x, "containerVersionHeader", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
