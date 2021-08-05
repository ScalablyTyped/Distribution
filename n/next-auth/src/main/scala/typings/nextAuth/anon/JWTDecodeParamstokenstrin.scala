package typings.nextAuth.anon

import typings.jose.mod.JWE.DecryptOptions
import typings.jose.mod.JWT.VerifyOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-auth.next-auth/jwt.JWTDecodeParams & {  token :string} */
trait JWTDecodeParamstokenstrin extends StObject {
  
  var decryptionKey: js.UndefOr[String] = js.undefined
  
  var decryptionOptions: js.UndefOr[DecryptOptions] = js.undefined
  
  var encryption: js.UndefOr[Boolean] = js.undefined
  
  var encryptionKey: js.UndefOr[String] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var secret: String | Buffer
  
  var signingKey: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] & String
  
  var verificationKey: js.UndefOr[String] = js.undefined
  
  var verificationOptions: js.UndefOr[VerifyOptions] = js.undefined
}
object JWTDecodeParamstokenstrin {
  
  inline def apply(secret: String | Buffer, token: js.UndefOr[String] & String): JWTDecodeParamstokenstrin = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTDecodeParamstokenstrin]
  }
  
  extension [Self <: JWTDecodeParamstokenstrin](x: Self) {
    
    inline def setDecryptionKey(value: String): Self = StObject.set(x, "decryptionKey", value.asInstanceOf[js.Any])
    
    inline def setDecryptionKeyUndefined: Self = StObject.set(x, "decryptionKey", js.undefined)
    
    inline def setDecryptionOptions(value: DecryptOptions): Self = StObject.set(x, "decryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setDecryptionOptionsUndefined: Self = StObject.set(x, "decryptionOptions", js.undefined)
    
    inline def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
    
    inline def setToken(value: js.UndefOr[String] & String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setVerificationKey(value: String): Self = StObject.set(x, "verificationKey", value.asInstanceOf[js.Any])
    
    inline def setVerificationKeyUndefined: Self = StObject.set(x, "verificationKey", js.undefined)
    
    inline def setVerificationOptions(value: VerifyOptions): Self = StObject.set(x, "verificationOptions", value.asInstanceOf[js.Any])
    
    inline def setVerificationOptionsUndefined: Self = StObject.set(x, "verificationOptions", js.undefined)
  }
}
