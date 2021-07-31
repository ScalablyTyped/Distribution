package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDraftsResponse extends StObject {
  
  /** List of drafts. Note that the `Message` property in each `Draft` resource only contains an `id` and a `threadId`. The messages.get method can fetch additional message details. */
  var drafts: js.UndefOr[js.Array[Draft]] = js.undefined
  
  /** Token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
}
object ListDraftsResponse {
  
  @scala.inline
  def apply(): ListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDraftsResponse]
  }
  
  @scala.inline
  implicit class ListDraftsResponseMutableBuilder[Self <: ListDraftsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrafts(value: js.Array[Draft]): Self = StObject.set(x, "drafts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftsUndefined: Self = StObject.set(x, "drafts", js.undefined)
    
    @scala.inline
    def setDraftsVarargs(value: Draft*): Self = StObject.set(x, "drafts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
  }
}
