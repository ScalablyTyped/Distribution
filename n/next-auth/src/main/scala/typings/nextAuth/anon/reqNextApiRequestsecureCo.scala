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
  
  @scala.inline
  def apply(req: NextApiRequest, secret: String | Buffer): reqNextApiRequestsecureCo = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqNextApiRequestsecureCo]
  }
  
  @scala.inline
  implicit class reqNextApiRequestsecureCoMutableBuilder[Self <: reqNextApiRequestsecureCo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
    
    @scala.inline
    def setDecryptionKey(value: String): Self = StObject.set(x, "decryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecryptionKeyUndefined: Self = StObject.set(x, "decryptionKey", js.undefined)
    
    @scala.inline
    def setDecryptionOptions(value: DecryptOptions): Self = StObject.set(x, "decryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecryptionOptionsUndefined: Self = StObject.set(x, "decryptionOptions", js.undefined)
    
    @scala.inline
    def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureCookie(value: Boolean): Self = StObject.set(x, "secureCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureCookieUndefined: Self = StObject.set(x, "secureCookie", js.undefined)
    
    @scala.inline
    def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setVerificationKey(value: String): Self = StObject.set(x, "verificationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationKeyUndefined: Self = StObject.set(x, "verificationKey", js.undefined)
    
    @scala.inline
    def setVerificationOptions(value: VerifyOptions): Self = StObject.set(x, "verificationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationOptionsUndefined: Self = StObject.set(x, "verificationOptions", js.undefined)
  }
}
