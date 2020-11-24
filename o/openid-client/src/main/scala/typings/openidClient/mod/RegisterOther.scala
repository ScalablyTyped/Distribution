package typings.openidClient.mod

import typings.jose.mod.JSONWebKeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterOther extends js.Object {
  
  /**
    * Initial Access Token to use as a Bearer token during the registration call.
    */
  var initialAccessToken: js.UndefOr[String] = js.native
  
  /**
    * JWK Set formatted object with private keys used for signing client assertions or decrypting responses.
    * When neither jwks_uri or jwks is present in metadata the key's public parts will be registered as jwks.
    */
  var jwks: js.UndefOr[JSONWebKeySet] = js.native
}
object RegisterOther {
  
  @scala.inline
  def apply(): RegisterOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOther]
  }
  
  @scala.inline
  implicit class RegisterOtherOps[Self <: RegisterOther] (val x: Self) extends AnyVal {
    
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
    def setInitialAccessToken(value: String): Self = this.set("initialAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialAccessToken: Self = this.set("initialAccessToken", js.undefined)
    
    @scala.inline
    def setJwks(value: JSONWebKeySet): Self = this.set("jwks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwks: Self = this.set("jwks", js.undefined)
  }
}
