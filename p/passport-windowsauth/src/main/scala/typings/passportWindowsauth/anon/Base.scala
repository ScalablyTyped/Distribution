package typings.passportWindowsauth.anon

import typings.ldapjs.mod.Client
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var base: js.UndefOr[String] = js.native
  var bindCredentials: js.UndefOr[String] = js.native
  var bindDN: js.UndefOr[String] = js.native
  var binder: js.UndefOr[Client] = js.native
  var client: js.UndefOr[Client] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var idleTimeout: js.UndefOr[Double] = js.native
  var maxConnections: js.UndefOr[Double] = js.native
  var reconnect: js.UndefOr[Boolean | FailAfter] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tlsOptions: js.UndefOr[TlsOptions] = js.native
  var url: js.UndefOr[String] = js.native
}

object Base {
  @scala.inline
  def apply(): Base = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setBindCredentials(value: String): Self = this.set("bindCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindCredentials: Self = this.set("bindCredentials", js.undefined)
    @scala.inline
    def setBindDN(value: String): Self = this.set("bindDN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindDN: Self = this.set("bindDN", js.undefined)
    @scala.inline
    def setBinder(value: Client): Self = this.set("binder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinder: Self = this.set("binder", js.undefined)
    @scala.inline
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    @scala.inline
    def setReconnect(value: Boolean | FailAfter): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTlsOptions(value: TlsOptions): Self = this.set("tlsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsOptions: Self = this.set("tlsOptions", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

