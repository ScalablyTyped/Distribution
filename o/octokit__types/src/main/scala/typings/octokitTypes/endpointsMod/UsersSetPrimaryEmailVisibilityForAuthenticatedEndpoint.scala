package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint extends js.Object {
  /**
    * Specify the _primary_ email address that needs a visibility change.
    */
  var email: String = js.native
  /**
    * Use `public` to enable an authenticated user to view the specified email address, or use `private` so this primary email address cannot be seen publicly.
    */
  var visibility: String = js.native
}

object UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint {
  @scala.inline
  def apply(email: String, visibility: String): UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint]
  }
  @scala.inline
  implicit class UsersSetPrimaryEmailVisibilityForAuthenticatedEndpointOps[Self <: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
  
}

