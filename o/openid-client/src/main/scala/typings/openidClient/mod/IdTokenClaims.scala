package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdTokenClaims extends UserinfoResponse {
  
  var acr: js.UndefOr[String] = js.native
  
  var amr: js.UndefOr[js.Array[String]] = js.native
  
  var at_hash: js.UndefOr[String] = js.native
  
  var aud: String | js.Array[String] = js.native
  
  var auth_time: js.UndefOr[Double] = js.native
  
  var azp: js.UndefOr[String] = js.native
  
  var c_hash: js.UndefOr[String] = js.native
  
  var exp: Double = js.native
  
  var iat: Double = js.native
  
  var iss: String = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var s_hash: js.UndefOr[String] = js.native
}
object IdTokenClaims {
  
  @scala.inline
  def apply(aud: String | js.Array[String], exp: Double, iat: Double, iss: String, sub: String): IdTokenClaims = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTokenClaims]
  }
  
  @scala.inline
  implicit class IdTokenClaimsOps[Self <: IdTokenClaims] (val x: Self) extends AnyVal {
    
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
    def setAudVarargs(value: String*): Self = this.set("aud", js.Array(value :_*))
    
    @scala.inline
    def setAud(value: String | js.Array[String]): Self = this.set("aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcr(value: String): Self = this.set("acr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcr: Self = this.set("acr", js.undefined)
    
    @scala.inline
    def setAmrVarargs(value: String*): Self = this.set("amr", js.Array(value :_*))
    
    @scala.inline
    def setAmr(value: js.Array[String]): Self = this.set("amr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmr: Self = this.set("amr", js.undefined)
    
    @scala.inline
    def setAt_hash(value: String): Self = this.set("at_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAt_hash: Self = this.set("at_hash", js.undefined)
    
    @scala.inline
    def setAuth_time(value: Double): Self = this.set("auth_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth_time: Self = this.set("auth_time", js.undefined)
    
    @scala.inline
    def setAzp(value: String): Self = this.set("azp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzp: Self = this.set("azp", js.undefined)
    
    @scala.inline
    def setC_hash(value: String): Self = this.set("c_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC_hash: Self = this.set("c_hash", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setS_hash(value: String): Self = this.set("s_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS_hash: Self = this.set("s_hash", js.undefined)
  }
}
