package typings.npmUser.mod

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
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

