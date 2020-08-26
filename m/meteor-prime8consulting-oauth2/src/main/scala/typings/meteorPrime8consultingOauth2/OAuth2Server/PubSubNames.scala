package typings.meteorPrime8consultingOauth2.OAuth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubSubNames extends js.Object {
  /**
    * Constant string representing the auth codes pub/sub.
    */
  var authCodes: String = js.native
  /**
    * Constant string representing the refresh token pub/sub.
    */
  var refreshTokens: String = js.native
}

object PubSubNames {
  @scala.inline
  def apply(authCodes: String, refreshTokens: String): PubSubNames = {
    val __obj = js.Dynamic.literal(authCodes = authCodes.asInstanceOf[js.Any], refreshTokens = refreshTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubSubNames]
  }
  @scala.inline
  implicit class PubSubNamesOps[Self <: PubSubNames] (val x: Self) extends AnyVal {
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
    def setAuthCodes(value: String): Self = this.set("authCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshTokens(value: String): Self = this.set("refreshTokens", value.asInstanceOf[js.Any])
  }
  
}

