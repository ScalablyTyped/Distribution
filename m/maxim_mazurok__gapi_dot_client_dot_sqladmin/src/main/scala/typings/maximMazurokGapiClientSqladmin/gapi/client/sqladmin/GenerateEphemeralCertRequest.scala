package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEphemeralCertRequest extends StObject {
  
  /** Optional. Access token to include in the signed certificate. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** PEM encoded public key to include in the signed certificate. */
  var public_key: js.UndefOr[String] = js.undefined
  
  /** Optional. Optional snapshot read timestamp to trade freshness for performance. */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** Optional. If set, it will contain the cert valid duration. */
  var validDuration: js.UndefOr[String] = js.undefined
}
object GenerateEphemeralCertRequest {
  
  inline def apply(): GenerateEphemeralCertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateEphemeralCertRequest]
  }
  
  extension [Self <: GenerateEphemeralCertRequest](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setValidDuration(value: String): Self = StObject.set(x, "validDuration", value.asInstanceOf[js.Any])
    
    inline def setValidDurationUndefined: Self = StObject.set(x, "validDuration", js.undefined)
  }
}
