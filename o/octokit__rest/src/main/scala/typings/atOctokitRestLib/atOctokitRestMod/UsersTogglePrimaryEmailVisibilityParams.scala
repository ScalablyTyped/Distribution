package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersTogglePrimaryEmailVisibilityParams extends js.Object {
  /**
    * Specify the _primary_ email address that needs a visibility change.
    */
  var email: java.lang.String
  /**
    * Use `public` to enable an authenticated user to view the specified email address, or use `private` so this primary email address cannot be seen publicly.
    */
  var visibility: java.lang.String
}

object UsersTogglePrimaryEmailVisibilityParams {
  @scala.inline
  def apply(email: java.lang.String, visibility: java.lang.String): UsersTogglePrimaryEmailVisibilityParams = {
    val __obj = js.Dynamic.literal(email = email, visibility = visibility)
  
    __obj.asInstanceOf[UsersTogglePrimaryEmailVisibilityParams]
  }
}

