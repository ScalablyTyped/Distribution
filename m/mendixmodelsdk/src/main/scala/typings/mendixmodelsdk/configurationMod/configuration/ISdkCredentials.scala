package typings.mendixmodelsdk.configurationMod.configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISdkCredentials extends js.Object {
  var apikey: String = js.native
  var username: String = js.native
}

object ISdkCredentials {
  @scala.inline
  def apply(apikey: String, username: String): ISdkCredentials = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISdkCredentials]
  }
  @scala.inline
  implicit class ISdkCredentialsOps[Self <: ISdkCredentials] (val x: Self) extends AnyVal {
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
    def setApikey(value: String): Self = this.set("apikey", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

