package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSendAsResponse extends StObject {
  
  /** List of send-as aliases. */
  var sendAs: js.UndefOr[js.Array[SendAs]] = js.undefined
}
object ListSendAsResponse {
  
  inline def apply(): ListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSendAsResponse]
  }
  
  extension [Self <: ListSendAsResponse](x: Self) {
    
    inline def setSendAs(value: js.Array[SendAs]): Self = StObject.set(x, "sendAs", value.asInstanceOf[js.Any])
    
    inline def setSendAsUndefined: Self = StObject.set(x, "sendAs", js.undefined)
    
    inline def setSendAsVarargs(value: SendAs*): Self = StObject.set(x, "sendAs", js.Array(value*))
  }
}
