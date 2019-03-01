package typings
package npmDashUserLib.npmDashUserMod.npmUserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  var avatar: java.lang.String | scala.Null
  var email: java.lang.String | scala.Null
  var github: java.lang.String | scala.Null
  var name: java.lang.String | scala.Null
  var twitter: java.lang.String | scala.Null
}

object UserData {
  @scala.inline
  def apply(
    avatar: java.lang.String = null,
    email: java.lang.String = null,
    github: java.lang.String = null,
    name: java.lang.String = null,
    twitter: java.lang.String = null
  ): UserData = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (email != null) __obj.updateDynamic("email")(email)
    if (github != null) __obj.updateDynamic("github")(github)
    if (name != null) __obj.updateDynamic("name")(name)
    if (twitter != null) __obj.updateDynamic("twitter")(twitter)
    __obj.asInstanceOf[UserData]
  }
}

