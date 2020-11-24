package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDirectoryPeopleResponse extends js.Object {
  
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
  implicit class SearchDirectoryPeopleResponseOps[Self <: SearchDirectoryPeopleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPeopleVarargs(value: Person*): Self = this.set("people", js.Array(value :_*))
    
    @scala.inline
    def setPeople(value: js.Array[Person]): Self = this.set("people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeople: Self = this.set("people", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
