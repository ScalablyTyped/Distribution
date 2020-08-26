package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenloadConfig extends js.Object {
  /* the api_key, available directly from the WebUI after successful login */
  var api_key: String = js.native
  /* the api_login, a string available from the WebUI, NOT the user's e-mail */
  var api_login: String = js.native
  /* the api_version to target, needed for forming the URL, by default 1 */
  var api_version: js.UndefOr[Double] = js.native
}

object OpenloadConfig {
  @scala.inline
  def apply(api_key: String, api_login: String): OpenloadConfig = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_login = api_login.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenloadConfig]
  }
  @scala.inline
  implicit class OpenloadConfigOps[Self <: OpenloadConfig] (val x: Self) extends AnyVal {
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_login(value: String): Self = this.set("api_login", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_version(value: Double): Self = this.set("api_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi_version: Self = this.set("api_version", js.undefined)
  }
  
}

