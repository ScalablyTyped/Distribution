package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteMessagesRequest extends StObject {
  
  /** The IDs of the messages to delete. */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchDeleteMessagesRequest {
  
  inline def apply(): BatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteMessagesRequest]
  }
  
  extension [Self <: BatchDeleteMessagesRequest](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
