package typings.npmUser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInfo extends js.Object {
  /**
  		URL to user's avatar.
  		*/
  var avatar: String | Null = js.native
  /**
  		User's email.
  		*/
  var email: String | Null = js.native
  /**
  		User's associated GitHub account.
  		*/
  var github: String | Null = js.native
  /**
  		User's name.
  		*/
  var name: String | Null = js.native
  /**
  		User's associated Twitter account.
  		*/
  var twitter: String | Null = js.native
}

object UserInfo {
  @scala.inline
  def apply(): UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInfo]
  }
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatarNull: Self = this.set("avatar", null)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setGithub(value: String): Self = this.set("github", value.asInstanceOf[js.Any])
    @scala.inline
    def setGithubNull: Self = this.set("github", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setTwitter(value: String): Self = this.set("twitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwitterNull: Self = this.set("twitter", null)
  }
  
}

