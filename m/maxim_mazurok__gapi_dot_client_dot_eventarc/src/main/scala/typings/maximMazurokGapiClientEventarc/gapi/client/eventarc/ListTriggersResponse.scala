package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTriggersResponse extends StObject {
  
  /** A page token that can be sent to `ListTriggers` to request the next page. If this is empty, then there are no more pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The requested triggers, up to the number specified in `page_size`. */
  var triggers: js.UndefOr[js.Array[Trigger]] = js.undefined
  
  /** Unreachable resources, if any. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListTriggersResponse {
  
  inline def apply(): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersResponse]
  }
  
  extension [Self <: ListTriggersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTriggers(value: js.Array[Trigger]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: Trigger*): Self = StObject.set(x, "triggers", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
