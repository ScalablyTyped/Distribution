package typings.oauth2Server.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeOptions extends js.Object {
  /**
    * Allow clients to specify an empty state
    */
  var allowEmptyState: js.UndefOr[Boolean] = js.native
  /**
    * The authenticate handler
    */
  var authenticateHandler: js.UndefOr[js.Object] = js.native
  /**
    * Lifetime of generated authorization codes in seconds (default = 5 minutes).
    */
  var authorizationCodeLifetime: js.UndefOr[Double] = js.native
}

object AuthorizeOptions {
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  @scala.inline
  implicit class AuthorizeOptionsOps[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
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
    def setAllowEmptyState(value: Boolean): Self = this.set("allowEmptyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmptyState: Self = this.set("allowEmptyState", js.undefined)
    @scala.inline
    def setAuthenticateHandler(value: js.Object): Self = this.set("authenticateHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticateHandler: Self = this.set("authenticateHandler", js.undefined)
    @scala.inline
    def setAuthorizationCodeLifetime(value: Double): Self = this.set("authorizationCodeLifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationCodeLifetime: Self = this.set("authorizationCodeLifetime", js.undefined)
  }
  
}

