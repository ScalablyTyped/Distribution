package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDirectoryPeopleResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of people in the domain directory that match the query. */
  var people: js.UndefOr[js.Array[Person]] = js.native
  
  /** The total number of items in the list without pagination. */
  var totalSize: js.UndefOr[Double] = js.native
}
object SearchDirectoryPeopleResponse {
  
  @scala.inline
  def apply(): SearchDirectoryPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDirectoryPeopleResponse]
  }
  
  @scala.inline
  implicit class SearchDirectoryPeopleResponseMutableBuilder[Self <: SearchDirectoryPeopleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPeople(value: js.Array[Person]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleUndefined: Self = StObject.set(x, "people", js.undefined)
    
    @scala.inline
    def setPeopleVarargs(value: Person*): Self = StObject.set(x, "people", js.Array(value :_*))
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
