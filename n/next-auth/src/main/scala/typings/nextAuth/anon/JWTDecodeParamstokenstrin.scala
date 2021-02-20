package typings.nextAuth.anon

import typings.jose.mod.JWE.DecryptOptions
import typings.jose.mod.JWT.VerifyOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-auth.next-auth/jwt.JWTDecodeParams & {  token :string} */
@js.native
trait JWTDecodeParamstokenstrin extends StObject {
  
  var decryptionKey: js.UndefOr[String] = js.native
  
  var decryptionOptions: js.UndefOr[DecryptOptions] = js.native
  
  var encryption: js.UndefOr[Boolean] = js.native
  
  var encryptionKey: js.UndefOr[String] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var secret: String | Buffer = js.native
  
  var signingKey: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] with String = js.native
  
  var verificationKey: js.UndefOr[String] = js.native
  
  var verificationOptions: js.UndefOr[VerifyOptions] = js.native
}
object JWTDecodeParamstokenstrin {
  
  @scala.inline
  def apply(secret: String | Buffer, token: js.UndefOr[String] with String): JWTDecodeParamstokenstrin = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTDecodeParamstokenstrin]
  }
  
  @scala.inline
  implicit class JWTDecodeParamstokenstrinMutableBuilder[Self <: JWTDecodeParamstokenstrin] (val x: Self) extends AnyVal {
    
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
    def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKey(value: String): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
    
    @scala.inline
    def setToken(value: js.UndefOr[String] with String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
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
