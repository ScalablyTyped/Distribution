package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoliciesPatchResponse extends StObject {
  
  var header: js.UndefOr[ResponseHeader] = js.undefined
  
  var policy: js.UndefOr[Policy] = js.undefined
}
object PoliciesPatchResponse {
  
  inline def apply(): PoliciesPatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoliciesPatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoliciesPatchResponse] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: ResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
