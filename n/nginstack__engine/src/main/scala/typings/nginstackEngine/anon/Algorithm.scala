package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithm extends StObject {
  
  var algorithm: js.UndefOr[String] = js.undefined
  
  var audience: js.UndefOr[String] = js.undefined
  
  var criticalHeaders: js.UndefOr[js.Array[Any]] = js.undefined
  
  var customHeaders: js.UndefOr[Any] = js.undefined
  
  var disableDefaultTimestamp: js.UndefOr[Boolean] = js.undefined
  
  var expiresAt: js.UndefOr[js.Date] = js.undefined
  
  var issuedAt: js.UndefOr[js.Date] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var jwtId: js.UndefOr[String] = js.undefined
  
  var keyId: js.UndefOr[String] = js.undefined
  
  var notBefore: js.UndefOr[js.Date] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
}
object Algorithm {
  
  inline def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  extension [Self <: Algorithm](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setCriticalHeaders(value: js.Array[Any]): Self = StObject.set(x, "criticalHeaders", value.asInstanceOf[js.Any])
    
    inline def setCriticalHeadersUndefined: Self = StObject.set(x, "criticalHeaders", js.undefined)
    
    inline def setCriticalHeadersVarargs(value: Any*): Self = StObject.set(x, "criticalHeaders", js.Array(value*))
    
    inline def setCustomHeaders(value: Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setDisableDefaultTimestamp(value: Boolean): Self = StObject.set(x, "disableDefaultTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultTimestampUndefined: Self = StObject.set(x, "disableDefaultTimestamp", js.undefined)
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setIssuedAt(value: js.Date): Self = StObject.set(x, "issuedAt", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtUndefined: Self = StObject.set(x, "issuedAt", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJwtId(value: String): Self = StObject.set(x, "jwtId", value.asInstanceOf[js.Any])
    
    inline def setJwtIdUndefined: Self = StObject.set(x, "jwtId", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
