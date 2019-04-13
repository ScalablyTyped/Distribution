package typings
package npmDashUserDashPackagesLib.npmDashUserDashPackagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("npm-user-packages", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Get packages by a npm user.
    * @param username User to fetch packages from.
    */
  def apply(username: java.lang.String): js.Promise[js.Array[PackageData]] = js.native
}

