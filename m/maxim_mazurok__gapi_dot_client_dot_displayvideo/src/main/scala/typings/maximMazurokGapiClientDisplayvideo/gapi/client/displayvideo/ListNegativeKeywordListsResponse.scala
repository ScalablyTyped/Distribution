package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNegativeKeywordListsResponse extends js.Object {
  
  /** The list of negative keyword lists. This list will be absent if empty. */
  var negativeKeywordLists: js.UndefOr[js.Array[NegativeKeywordList]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListNegativeKeywordLists` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListNegativeKeywordListsResponse {
  
  @scala.inline
  def apply(): ListNegativeKeywordListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNegativeKeywordListsResponse]
  }
  
  @scala.inline
  implicit class ListNegativeKeywordListsResponseOps[Self <: ListNegativeKeywordListsResponse] (val x: Self) extends AnyVal {
    
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
    def setNegativeKeywordListsVarargs(value: NegativeKeywordList*): Self = this.set("negativeKeywordLists", js.Array(value :_*))
    
    @scala.inline
    def setNegativeKeywordLists(value: js.Array[NegativeKeywordList]): Self = this.set("negativeKeywordLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeKeywordLists: Self = this.set("negativeKeywordLists", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
