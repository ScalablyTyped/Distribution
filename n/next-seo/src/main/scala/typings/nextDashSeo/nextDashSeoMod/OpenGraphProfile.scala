package typings.nextDashSeo.nextDashSeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphProfile extends js.Object {
  var firstName: js.UndefOr[String] = js.undefined
  var gender: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object OpenGraphProfile {
  @scala.inline
  def apply(firstName: String = null, gender: String = null, lastName: String = null, username: String = null): OpenGraphProfile = {
    val __obj = js.Dynamic.literal()
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphProfile]
  }
}

