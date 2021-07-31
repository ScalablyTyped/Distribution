package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdTokenClaims
  extends StObject
     with UserinfoResponse {
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  
  var at_hash: js.UndefOr[String] = js.undefined
  
  var aud: String | js.Array[String]
  
  var auth_time: js.UndefOr[Double] = js.undefined
  
  var azp: js.UndefOr[String] = js.undefined
  
  var c_hash: js.UndefOr[String] = js.undefined
  
  var exp: Double
  
  var iat: Double
  
  var iss: String
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var s_hash: js.UndefOr[String] = js.undefined
}
object IdTokenClaims {
  
  @scala.inline
  def apply(aud: String | js.Array[String], exp: Double, iat: Double, iss: String, sub: String): IdTokenClaims = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenClaims]
  }
  
  @scala.inline
  implicit class IdTokenClaimsMutableBuilder[Self <: IdTokenClaims] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    @scala.inline
    def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    @scala.inline
    def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value :_*))
    
    @scala.inline
    def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAt_hashUndefined: Self = StObject.set(x, "at_hash", js.undefined)
    
    @scala.inline
    def setAud(value: String | js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value :_*))
    
    @scala.inline
    def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_timeUndefined: Self = StObject.set(x, "auth_time", js.undefined)
    
    @scala.inline
    def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzpUndefined: Self = StObject.set(x, "azp", js.undefined)
    
    @scala.inline
    def setC_hash(value: String): Self = StObject.set(x, "c_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC_hashUndefined: Self = StObject.set(x, "c_hash", js.undefined)
    
    @scala.inline
    def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setS_hash(value: String): Self = StObject.set(x, "s_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS_hashUndefined: Self = StObject.set(x, "s_hash", js.undefined)
  }
}
