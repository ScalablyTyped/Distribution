package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourcesResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Sources belonging to the requested parent. */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}
object ListSourcesResponse {
  
  @scala.inline
  def apply(): ListSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourcesResponse]
  }
  
  @scala.inline
  implicit class ListSourcesResponseMutableBuilder[Self <: ListSourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
