package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersTogglePrimaryEmailVisibilityEndpoint extends js.Object {
  /**
    * Specify the _primary_ email address that needs a visibility change.
    */
  var email: String
  /**
    * Use `public` to enable an authenticated user to view the specified email address, or use `private` so this primary email address cannot be seen publicly.
    */
  var visibility: String
}

object UsersTogglePrimaryEmailVisibilityEndpoint {
  @scala.inline
  def apply(email: String, visibility: String): UsersTogglePrimaryEmailVisibilityEndpoint = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersTogglePrimaryEmailVisibilityEndpoint]
  }
}

