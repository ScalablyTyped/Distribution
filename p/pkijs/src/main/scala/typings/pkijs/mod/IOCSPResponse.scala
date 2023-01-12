package typings.pkijs.mod

import typings.asn1js.mod.Enumerated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCSPResponse extends StObject {
  
  var responseBytes: js.UndefOr[ResponseBytes] = js.undefined
  
  var responseStatus: Enumerated
}
object IOCSPResponse {
  
  inline def apply(responseStatus: Enumerated): IOCSPResponse = {
    val __obj = js.Dynamic.literal(responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCSPResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOCSPResponse] (val x: Self) extends AnyVal {
    
    inline def setResponseBytes(value: ResponseBytes): Self = StObject.set(x, "responseBytes", value.asInstanceOf[js.Any])
    
    inline def setResponseBytesUndefined: Self = StObject.set(x, "responseBytes", js.undefined)
    
    inline def setResponseStatus(value: Enumerated): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
  }
}
