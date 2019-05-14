package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreateGpgKey_Options extends js.Object {
  var armored_public_key: js.UndefOr[java.lang.String] = js.undefined
}

object UsersCreateGpgKey_Options {
  @scala.inline
  def apply(armored_public_key: java.lang.String = null): UsersCreateGpgKey_Options = {
    val __obj = js.Dynamic.literal()
    if (armored_public_key != null) __obj.updateDynamic("armored_public_key")(armored_public_key)
    __obj.asInstanceOf[UsersCreateGpgKey_Options]
  }
}

