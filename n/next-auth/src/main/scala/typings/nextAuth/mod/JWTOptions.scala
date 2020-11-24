package typings.nextAuth.mod

import typings.nextAuth.jwtMod.JWTDecodeParams
import typings.nextAuth.jwtMod.JWTEncodeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWTOptions extends js.Object {
  
  var decode: js.UndefOr[js.Function1[/* options */ JWTDecodeParams, js.Promise[String]]] = js.native
  
  var encode: js.UndefOr[js.Function1[/* options */ JWTEncodeParams, js.Promise[String]]] = js.native
  
  var encryption: js.UndefOr[Boolean] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var secret: js.UndefOr[String] = js.native
}
object JWTOptions {
  
  @scala.inline
  def apply(): JWTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWTOptions]
  }
  
  @scala.inline
  implicit class JWTOptionsOps[Self <: JWTOptions] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: /* options */ JWTDecodeParams => js.Promise[String]): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    
    @scala.inline
    def setEncode(value: /* options */ JWTEncodeParams => js.Promise[String]): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setEncryption(value: Boolean): Self = this.set("encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
