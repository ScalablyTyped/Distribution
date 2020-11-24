package typings.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDirectoryPeopleResponse extends js.Object {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A token, which can be sent as `sync_token` to retrieve changes since the last request. Request must set `request_sync_token` to return the sync token. */
  var nextSyncToken: js.UndefOr[String] = js.native
  
  /** The list of people in the domain directory. */
  var people: js.UndefOr[js.Array[Person]] = js.native
}
object ListDirectoryPeopleResponse {
  
  @scala.inline
  def apply(): ListDirectoryPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDirectoryPeopleResponse]
  }
  
  @scala.inline
  implicit class ListDirectoryPeopleResponseOps[Self <: ListDirectoryPeopleResponse] (val x: Self) extends AnyVal {
    
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
    def setNextSyncToken(value: String): Self = this.set("nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSyncToken: Self = this.set("nextSyncToken", js.undefined)
    
    @scala.inline
    def setPeopleVarargs(value: Person*): Self = this.set("people", js.Array(value :_*))
    
    @scala.inline
    def setPeople(value: js.Array[Person]): Self = this.set("people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeople: Self = this.set("people", js.undefined)
  }
}
