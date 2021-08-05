package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchThreatListUpdatesResponse extends StObject {
  
  /** The list updates requested by the clients. */
  var listUpdateResponses: js.UndefOr[js.Array[ListUpdateResponse]] = js.undefined
  
  /** The minimum duration the client must wait before issuing any update request. If this field is not set clients may update as soon as they want. */
  var minimumWaitDuration: js.UndefOr[String] = js.undefined
}
object FetchThreatListUpdatesResponse {
  
  inline def apply(): FetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchThreatListUpdatesResponse]
  }
  
  extension [Self <: FetchThreatListUpdatesResponse](x: Self) {
    
    inline def setListUpdateResponses(value: js.Array[ListUpdateResponse]): Self = StObject.set(x, "listUpdateResponses", value.asInstanceOf[js.Any])
    
    inline def setListUpdateResponsesUndefined: Self = StObject.set(x, "listUpdateResponses", js.undefined)
    
    inline def setListUpdateResponsesVarargs(value: ListUpdateResponse*): Self = StObject.set(x, "listUpdateResponses", js.Array(value :_*))
    
    inline def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
  }
}
