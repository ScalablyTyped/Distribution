package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewsResponse extends StObject {
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of views. */
  var views: js.UndefOr[js.Array[LogView]] = js.native
}
object ListViewsResponse {
  
  @scala.inline
  def apply(): ListViewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewsResponse]
  }
  
  @scala.inline
  implicit class ListViewsResponseMutableBuilder[Self <: ListViewsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setViews(value: js.Array[LogView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: LogView*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
