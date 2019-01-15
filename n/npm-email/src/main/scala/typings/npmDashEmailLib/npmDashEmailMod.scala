package typings
package npmDashEmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-email", JSImport.Namespace)
@js.native
object npmDashEmailMod extends js.Object {
  /**
    * Get the email of an npm user.
    *
    * @param username npm username to look up.
    * @returns A promise for the user's email address.
    */
  def apply(username: java.lang.String): js.Promise[java.lang.String] = js.native
}

