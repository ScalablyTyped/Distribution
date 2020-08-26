package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerConfig extends js.Object {
  var host: String = js.native
  var password: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var servers: js.UndefOr[js.Array[ServerConfig]] = js.native
  var useToken: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
}

object ServerConfig {
  @scala.inline
  def apply(host: String): ServerConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  @scala.inline
  implicit class ServerConfigOps[Self <: ServerConfig] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setServersVarargs(value: ServerConfig*): Self = this.set("servers", js.Array(value :_*))
    @scala.inline
    def setServers(value: js.Array[ServerConfig]): Self = this.set("servers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
    @scala.inline
    def setUseToken(value: Boolean): Self = this.set("useToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseToken: Self = this.set("useToken", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

