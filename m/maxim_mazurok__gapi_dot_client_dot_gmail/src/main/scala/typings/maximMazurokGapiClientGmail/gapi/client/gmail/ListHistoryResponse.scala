package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHistoryResponse extends StObject {
  
  /** List of history records. Any `messages` contained in the response will typically only have `id` and `threadId` fields populated. */
  var history: js.UndefOr[js.Array[History]] = js.undefined
  
  /** The ID of the mailbox's current history record. */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListHistoryResponse {
  
  @scala.inline
  def apply(): ListHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHistoryResponse]
  }
  
  @scala.inline
  implicit class ListHistoryResponseMutableBuilder[Self <: ListHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[History]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: History*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
