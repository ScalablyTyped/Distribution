package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchThreatListUpdatesResponse extends StObject {
  
  /** The list updates requested by the clients. */
  var listUpdateResponses: js.UndefOr[js.Array[ListUpdateResponse]] = js.native
  
  /** The minimum duration the client must wait before issuing any update request. If this field is not set clients may update as soon as they want. */
  var minimumWaitDuration: js.UndefOr[String] = js.native
}
object FetchThreatListUpdatesResponse {
  
  @scala.inline
  def apply(): FetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchThreatListUpdatesResponse]
  }
  
  @scala.inline
  implicit class FetchThreatListUpdatesResponseMutableBuilder[Self <: FetchThreatListUpdatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListUpdateResponses(value: js.Array[ListUpdateResponse]): Self = StObject.set(x, "listUpdateResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUpdateResponsesUndefined: Self = StObject.set(x, "listUpdateResponses", js.undefined)
    
    @scala.inline
    def setListUpdateResponsesVarargs(value: ListUpdateResponse*): Self = StObject.set(x, "listUpdateResponses", js.Array(value :_*))
    
    @scala.inline
    def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
  }
}
