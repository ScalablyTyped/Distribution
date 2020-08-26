package typings.nodeSsh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigGiven extends js.Object {
  var host: String = js.native
  var onKeyboardInteractive: js.UndefOr[js.Function0[Unit | Boolean]] = js.native
  var password: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var privateKey: js.UndefOr[String] = js.native
  var username: String = js.native
}

object ConfigGiven {
  @scala.inline
  def apply(host: String, username: String): ConfigGiven = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigGiven]
  }
  @scala.inline
  implicit class ConfigGivenOps[Self <: ConfigGiven] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyboardInteractive(value: () => Unit | Boolean): Self = this.set("onKeyboardInteractive", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnKeyboardInteractive: Self = this.set("onKeyboardInteractive", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
  }
  
}

