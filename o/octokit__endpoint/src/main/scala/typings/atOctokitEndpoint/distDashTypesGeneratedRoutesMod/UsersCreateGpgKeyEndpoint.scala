package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersCreateGpgKeyEndpoint extends js.Object {
  var armored_public_key: js.UndefOr[String] = js.undefined
}

object UsersCreateGpgKeyEndpoint {
  @scala.inline
  def apply(armored_public_key: String = null): UsersCreateGpgKeyEndpoint = {
    val __obj = js.Dynamic.literal()
    if (armored_public_key != null) __obj.updateDynamic("armored_public_key")(armored_public_key)
    __obj.asInstanceOf[UsersCreateGpgKeyEndpoint]
  }
}

