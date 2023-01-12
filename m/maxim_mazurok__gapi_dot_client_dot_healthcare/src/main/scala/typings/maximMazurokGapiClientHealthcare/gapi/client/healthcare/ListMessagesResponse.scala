package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMessagesResponse extends StObject {
  
  /** The returned Messages. Won't be more Messages than the value of page_size in the request. See view for populated fields. */
  var hl7V2Messages: js.UndefOr[js.Array[Message]] = js.undefined
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListMessagesResponse {
  
  inline def apply(): ListMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMessagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMessagesResponse] (val x: Self) extends AnyVal {
    
    inline def setHl7V2Messages(value: js.Array[Message]): Self = StObject.set(x, "hl7V2Messages", value.asInstanceOf[js.Any])
    
    inline def setHl7V2MessagesUndefined: Self = StObject.set(x, "hl7V2Messages", js.undefined)
    
    inline def setHl7V2MessagesVarargs(value: Message*): Self = StObject.set(x, "hl7V2Messages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
