package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof openid-client.anon.Address<openid-client.openid-client.UnknownObject>, keyof std.Omit<openid-client.openid-client.UnknownObject, keyof openid-client.openid-client.KnownKeys<openid-client.openid-client.UnknownObject>>> ]: openid-client.anon.Address<openid-client.openid-client.UnknownObject>[P]} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited */ trait IdTokenClaims
  extends StObject
     with UnknownObject {
  
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
  
  var sub: String
}
object IdTokenClaims {
  
  inline def apply(aud: String | js.Array[String], exp: Double, iat: Double, iss: String, sub: String): IdTokenClaims = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenClaims]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdTokenClaims] (val x: Self) extends AnyVal {
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
    
    inline def setAt_hash(value: String): Self = StObject.set(x, "at_hash", value.asInstanceOf[js.Any])
    
    inline def setAt_hashUndefined: Self = StObject.set(x, "at_hash", js.undefined)
    
    inline def setAud(value: String | js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value*))
    
    inline def setAuth_time(value: Double): Self = StObject.set(x, "auth_time", value.asInstanceOf[js.Any])
    
    inline def setAuth_timeUndefined: Self = StObject.set(x, "auth_time", js.undefined)
    
    inline def setAzp(value: String): Self = StObject.set(x, "azp", value.asInstanceOf[js.Any])
    
    inline def setAzpUndefined: Self = StObject.set(x, "azp", js.undefined)
    
    inline def setC_hash(value: String): Self = StObject.set(x, "c_hash", value.asInstanceOf[js.Any])
    
    inline def setC_hashUndefined: Self = StObject.set(x, "c_hash", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setS_hash(value: String): Self = StObject.set(x, "s_hash", value.asInstanceOf[js.Any])
    
    inline def setS_hashUndefined: Self = StObject.set(x, "s_hash", js.undefined)
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
  }
}
