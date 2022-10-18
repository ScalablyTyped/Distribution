package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Verified extends StObject {
  
  var payload: String | Null
  
  var reason: String
  
  var signature: String | Null
  
  var verified: Boolean
}
object Verified {
  
  inline def apply(reason: String, verified: Boolean): Verified = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], payload = null, signature = null)
    __obj.asInstanceOf[Verified]
  }
  
  extension [Self <: Verified](x: Self) {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
