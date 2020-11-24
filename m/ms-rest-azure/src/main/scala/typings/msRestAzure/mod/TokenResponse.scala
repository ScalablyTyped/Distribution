package typings.msRestAzure.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenResponse
  extends typings.adalNode.mod.TokenResponse {
  
  /**
    * @property {number} [notBefore] The time from which the access token becomes usable.
    * The date is represented as the number of seconds from 1970-01-01T0:0:0Z UTC until time of validity for the token.
    */
  var notBefore: js.UndefOr[Double] = js.native
}
object TokenResponse {
  
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: Double,
    expiresOn: Date | String,
    resource: String,
    tokenType: String
  ): TokenResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], expiresOn = expiresOn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
  
  @scala.inline
  implicit class TokenResponseOps[Self <: TokenResponse] (val x: Self) extends AnyVal {
    
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
    def setNotBefore(value: Double): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
  }
}
