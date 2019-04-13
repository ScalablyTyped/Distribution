package typings
package npmDashUserLib.npmDashUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /**
  		URL to user's avatar.
  		*/
  var avatar: java.lang.String | scala.Null
  /**
  		User's email.
  		*/
  var email: java.lang.String | scala.Null
  /**
  		User's associated GitHub account.
  		*/
  var github: java.lang.String | scala.Null
  /**
  		User's name.
  		*/
  var name: java.lang.String | scala.Null
  /**
  		User's associated Twitter account.
  		*/
  var twitter: java.lang.String | scala.Null
}

object UserInfo {
  @scala.inline
  def apply(
    avatar: java.lang.String = null,
    email: java.lang.String = null,
    github: java.lang.String = null,
    name: java.lang.String = null,
    twitter: java.lang.String = null
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

