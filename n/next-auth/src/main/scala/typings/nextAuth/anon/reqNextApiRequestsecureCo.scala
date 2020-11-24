package typings.nextAuth.anon

import typings.jose.mod.JWE.DecryptOptions
import typings.jose.mod.JWT.VerifyOptions
import typings.nextAuth.utilsMod.NextApiRequest
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  req :next-auth.next-auth/_utils.NextApiRequest,   secureCookie :boolean | undefined,   cookieName :string | undefined,   raw :string | undefined} & next-auth.next-auth/jwt.JWTDecodeParams */
@js.native
trait reqNextApiRequestsecureCo extends js.Object {
  
  var cookieName: js.UndefOr[String] = js.native
  
  var decryptionKey: js.UndefOr[String] = js.native
  
  var decryptionOptions: js.UndefOr[DecryptOptions] = js.native
  
  var encryption: js.UndefOr[Boolean] = js.native
  
  var encryptionKey: js.UndefOr[String] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var raw: js.UndefOr[String] = js.native
  
  var req: NextApiRequest = js.native
  
  var secret: String | Buffer = js.native
  
  var secureCookie: js.UndefOr[Boolean] = js.native
  
  var signingKey: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var verificationKey: js.UndefOr[String] = js.native
  
  var verificationOptions: js.UndefOr[VerifyOptions] = js.native
}
object reqNextApiRequestsecureCo {
  
  @scala.inline
  def apply(req: NextApiRequest, secret: String | Buffer): reqNextApiRequestsecureCo = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqNextApiRequestsecureCo]
  }
  
  @scala.inline
  implicit class reqNextApiRequestsecureCoOps[Self <: reqNextApiRequestsecureCo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReq(value: NextApiRequest): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String | Buffer): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setDecryptionKey(value: String): Self = this.set("decryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecryptionKey: Self = this.set("decryptionKey", js.undefined)
    
    @scala.inline
    def setDecryptionOptions(value: DecryptOptions): Self = this.set("decryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecryptionOptions: Self = this.set("decryptionOptions", js.undefined)
    
    @scala.inline
    def setEncryption(value: Boolean): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: String): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSecureCookie(value: Boolean): Self = this.set("secureCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureCookie: Self = this.set("secureCookie", js.undefined)
    
    @scala.inline
    def setSigningKey(value: String): Self = this.set("signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningKey: Self = this.set("signingKey", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setVerificationKey(value: String): Self = this.set("verificationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationKey: Self = this.set("verificationKey", js.undefined)
    
    @scala.inline
    def setVerificationOptions(value: VerifyOptions): Self = this.set("verificationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationOptions: Self = this.set("verificationOptions", js.undefined)
  }
}
