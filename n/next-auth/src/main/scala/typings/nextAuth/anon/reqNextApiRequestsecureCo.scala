package typings.nextAuth.anon

import typings.jose.mod.JWE.DecryptOptions
import typings.jose.mod.JWT.VerifyOptions
import typings.nextAuth.utilsMod.NextApiRequest
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  req :next-auth.next-auth/_utils.NextApiRequest,   secureCookie :boolean | undefined,   cookieName :string | undefined,   raw :string | undefined} & next-auth.next-auth/jwt.JWTDecodeParams */
trait reqNextApiRequestsecureCo extends StObject {
  
  var cookieName: js.UndefOr[String] = js.undefined
  
  var decryptionKey: js.UndefOr[String] = js.undefined
  
  var decryptionOptions: js.UndefOr[DecryptOptions] = js.undefined
  
  var encryption: js.UndefOr[Boolean] = js.undefined
  
  var encryptionKey: js.UndefOr[String] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var raw: js.UndefOr[String] = js.undefined
  
  var req: NextApiRequest
  
  var secret: String | Buffer
  
  var secureCookie: js.UndefOr[Boolean] = js.undefined
  
  var signingKey: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var verificationKey: js.UndefOr[String] = js.undefined
  
  var verificationOptions: js.UndefOr[VerifyOptions] = js.undefined
}
object reqNextApiRequestsecureCo {
  
  inline def apply(req: NextApiRequest, secret: String | Buffer): reqNextApiRequestsecureCo = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqNextApiRequestsecureCo]
  }
  
  extension [Self <: reqNextApiRequestsecureCo](x: Self) {
    
    inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
    
    inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
    
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
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecureCookie(value: Boolean): Self = StObject.set(x, "secureCookie", value.asInstanceOf[js.Any])
    
    inline def setSecureCookieUndefined: Self = StObject.set(x, "secureCookie", js.undefined)
    
    inline def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    inline def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setVerificationKey(value: String): Self = StObject.set(x, "verificationKey", value.asInstanceOf[js.Any])
    
    inline def setVerificationKeyUndefined: Self = StObject.set(x, "verificationKey", js.undefined)
    
    inline def setVerificationOptions(value: VerifyOptions): Self = StObject.set(x, "verificationOptions", value.asInstanceOf[js.Any])
    
    inline def setVerificationOptionsUndefined: Self = StObject.set(x, "verificationOptions", js.undefined)
  }
}
