package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsResponse extends StObject {
  
  /** The groups that match the specified filters. */
  var group: js.UndefOr[js.Array[Group]] = js.undefined
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGroupsResponse {
  
  @scala.inline
  def apply(): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsResponse]
  }
  
  @scala.inline
  implicit class ListGroupsResponseMutableBuilder[Self <: ListGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: js.Array[Group]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: Group*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
