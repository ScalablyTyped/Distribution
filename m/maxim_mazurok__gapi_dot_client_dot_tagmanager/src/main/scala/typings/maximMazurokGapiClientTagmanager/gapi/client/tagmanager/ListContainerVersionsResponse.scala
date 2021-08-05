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
  
  inline def apply(): ListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainerVersionsResponse]
  }
  
  extension [Self <: ListContainerVersionsResponse](x: Self) {
    
    inline def setContainerVersionHeader(value: js.Array[ContainerVersionHeader]): Self = StObject.set(x, "containerVersionHeader", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionHeaderUndefined: Self = StObject.set(x, "containerVersionHeader", js.undefined)
    
    inline def setContainerVersionHeaderVarargs(value: ContainerVersionHeader*): Self = StObject.set(x, "containerVersionHeader", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
