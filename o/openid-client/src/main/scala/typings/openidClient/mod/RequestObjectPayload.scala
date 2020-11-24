package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestObjectPayload extends AuthorizationParameters {
  
  var aud: js.UndefOr[String] = js.native
  
  var exp: js.UndefOr[Double] = js.native
  
  var iat: js.UndefOr[Double] = js.native
  
  var iss: js.UndefOr[String] = js.native
  
  var jti: js.UndefOr[String] = js.native
}
object RequestObjectPayload {
  
  @scala.inline
  def apply(): RequestObjectPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestObjectPayload]
  }
  
  @scala.inline
  implicit class RequestObjectPayloadOps[Self <: RequestObjectPayload] (val x: Self) extends AnyVal {
    
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
    def setAud(value: String): Self = this.set("aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAud: Self = this.set("aud", js.undefined)
    
    @scala.inline
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIat: Self = this.set("iat", js.undefined)
    
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIss: Self = this.set("iss", js.undefined)
    
    @scala.inline
    def setJti(value: String): Self = this.set("jti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJti: Self = this.set("jti", js.undefined)
  }
}
