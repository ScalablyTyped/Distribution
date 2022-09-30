package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResponseBytes extends StObject {
  
  var response: OctetString
  
  var responseType: String
}
object IResponseBytes {
  
  inline def apply(response: OctetString, responseType: String): IResponseBytes = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseBytes]
  }
  
  extension [Self <: IResponseBytes](x: Self) {
    
    inline def setResponse(value: OctetString): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
  }
}
