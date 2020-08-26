package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureOptions extends js.Object {
  var authorize_url: js.UndefOr[String] = js.native
  var client_id: String = js.native
  var client_secret: String = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var host: js.UndefOr[String] = js.native
  var logout_url: js.UndefOr[String] = js.native
  var mode: String = js.native
  var openid_connect_host: js.UndefOr[String] = js.native
  var openid_connect_port: js.UndefOr[String] = js.native
  var openid_connect_schema: js.UndefOr[String] = js.native
  var port: js.UndefOr[String] = js.native
  var schema: js.UndefOr[String] = js.native
}

object ConfigureOptions {
  @scala.inline
  def apply(client_id: String, client_secret: String, mode: String): ConfigureOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
  @scala.inline
  implicit class ConfigureOptionsOps[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorize_url(value: String): Self = this.set("authorize_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorize_url: Self = this.set("authorize_url", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLogout_url(value: String): Self = this.set("logout_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogout_url: Self = this.set("logout_url", js.undefined)
    @scala.inline
    def setOpenid_connect_host(value: String): Self = this.set("openid_connect_host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenid_connect_host: Self = this.set("openid_connect_host", js.undefined)
    @scala.inline
    def setOpenid_connect_port(value: String): Self = this.set("openid_connect_port", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenid_connect_port: Self = this.set("openid_connect_port", js.undefined)
    @scala.inline
    def setOpenid_connect_schema(value: String): Self = this.set("openid_connect_schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenid_connect_schema: Self = this.set("openid_connect_schema", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

