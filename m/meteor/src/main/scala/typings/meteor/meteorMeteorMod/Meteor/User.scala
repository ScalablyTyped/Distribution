package typings.meteor.meteorMeteorMod.Meteor

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var _id: String
  var createdAt: js.UndefOr[Date] = js.undefined
  // One of the tests assigns a new property to the user so it has to be typed
  var dexterity: js.UndefOr[Double] = js.undefined
  var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
  var profile: js.UndefOr[js.Any] = js.undefined
  var services: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    _id: String,
    createdAt: Date = null,
    dexterity: Int | Double = null,
    emails: js.Array[UserEmail] = null,
    profile: js.Any = null,
    services: js.Any = null,
    username: String = null
  ): User = {
    val __obj = js.Dynamic.literal(_id = _id)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (dexterity != null) __obj.updateDynamic("dexterity")(dexterity.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (services != null) __obj.updateDynamic("services")(services)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[User]
  }
}

@JSImport("meteor/meteor", "Meteor.user")
@js.native
object user extends js.Object {
  def apply(): User | Null = js.native
}

