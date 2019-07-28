package typings.npmDashUser.npmDashUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /**
  		URL to user's avatar.
  		*/
  var avatar: String | Null
  /**
  		User's email.
  		*/
  var email: String | Null
  /**
  		User's associated GitHub account.
  		*/
  var github: String | Null
  /**
  		User's name.
  		*/
  var name: String | Null
  /**
  		User's associated Twitter account.
  		*/
  var twitter: String | Null
}

object UserInfo {
  @scala.inline
  def apply(
    avatar: String = null,
    email: String = null,
    github: String = null,
    name: String = null,
    twitter: String = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (email != null) __obj.updateDynamic("email")(email)
    if (github != null) __obj.updateDynamic("github")(github)
    if (name != null) __obj.updateDynamic("name")(name)
    if (twitter != null) __obj.updateDynamic("twitter")(twitter)
    __obj.asInstanceOf[UserInfo]
  }
}

