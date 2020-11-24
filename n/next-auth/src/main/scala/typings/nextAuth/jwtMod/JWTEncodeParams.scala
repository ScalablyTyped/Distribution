package typings.nextAuth.jwtMod

import typings.jose.mod.JWT.SignOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWTEncodeParams extends js.Object {
  
  var encryption: js.UndefOr[Boolean] = js.native
  
  var encryptionKey: js.UndefOr[String] = js.native
  
  var encryptionOptions: js.UndefOr[js.Object] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var secret: String | Buffer = js.native
  
  var signingKey: js.UndefOr[String] = js.native
  
  var signingOptions: js.UndefOr[SignOptions] = js.native
  
  var token: js.UndefOr[js.Object] = js.native
}
object JWTEncodeParams {
  
  @scala.inline
  def apply(secret: String | Buffer): JWTEncodeParams = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTEncodeParams]
  }
  
  @scala.inline
  implicit class JWTEncodeParamsOps[Self <: JWTEncodeParams] (val x: Self) extends AnyVal {
    
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
    def setSecret(value: String | Buffer): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: Boolean): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: String): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setEncryptionOptions(value: js.Object): Self = this.set("encryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionOptions: Self = this.set("encryptionOptions", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setSigningKey(value: String): Self = this.set("signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningKey: Self = this.set("signingKey", js.undefined)
    
    @scala.inline
    def setSigningOptions(value: SignOptions): Self = this.set("signingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningOptions: Self = this.set("signingOptions", js.undefined)
    
    @scala.inline
    def setToken(value: js.Object): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
