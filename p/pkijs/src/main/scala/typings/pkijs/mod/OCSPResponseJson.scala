package typings.pkijs.mod

import typings.asn1js.mod.EnumeratedJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OCSPResponseJson extends StObject {
  
  var responseBytes: js.UndefOr[ResponseBytesJson] = js.undefined
  
  var responseStatus: EnumeratedJson
}
object OCSPResponseJson {
  
  inline def apply(responseStatus: EnumeratedJson): OCSPResponseJson = {
    val __obj = js.Dynamic.literal(responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCSPResponseJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OCSPResponseJson] (val x: Self) extends AnyVal {
    
    inline def setResponseBytes(value: ResponseBytesJson): Self = StObject.set(x, "responseBytes", value.asInstanceOf[js.Any])
    
    inline def setResponseBytesUndefined: Self = StObject.set(x, "responseBytes", js.undefined)
    
    inline def setResponseStatus(value: EnumeratedJson): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
  }
}
