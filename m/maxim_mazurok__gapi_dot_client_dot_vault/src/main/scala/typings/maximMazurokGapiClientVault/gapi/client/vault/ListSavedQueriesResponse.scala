package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSavedQueriesResponse extends js.Object {
  
  /** Page token to retrieve the next page of results in the list. If this is empty, then there are no more saved queries to list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of output saved queries. */
  var savedQueries: js.UndefOr[js.Array[SavedQuery]] = js.native
}
object ListSavedQueriesResponse {
  
  @scala.inline
  def apply(): ListSavedQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSavedQueriesResponse]
  }
  
  @scala.inline
  implicit class ListSavedQueriesResponseOps[Self <: ListSavedQueriesResponse] (val x: Self) extends AnyVal {
    
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
    def setSavedQueriesVarargs(value: SavedQuery*): Self = this.set("savedQueries", js.Array(value :_*))
    
    @scala.inline
    def setSavedQueries(value: js.Array[SavedQuery]): Self = this.set("savedQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedQueries: Self = this.set("savedQueries", js.undefined)
  }
}
