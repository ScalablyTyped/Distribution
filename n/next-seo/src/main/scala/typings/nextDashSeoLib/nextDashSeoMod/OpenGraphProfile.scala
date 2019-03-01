package typings
package nextDashSeoLib.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphProfile extends js.Object {
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var gender: js.UndefOr[java.lang.String] = js.undefined
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object OpenGraphProfile {
  @scala.inline
  def apply(
    firstName: java.lang.String = null,
    gender: java.lang.String = null,
    lastName: java.lang.String = null,
    username: java.lang.String = null
  ): OpenGraphProfile = {
    val __obj = js.Dynamic.literal()
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[OpenGraphProfile]
  }
}

