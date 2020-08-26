package typings.nodeVault.mod

import typings.nodeVault.anon.Method
import typings.request.mod.CoreOptions
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultOptions extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.native
  var apiVersion: js.UndefOr[String] = js.native
  var commands: js.UndefOr[js.Array[Method]] = js.native
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var mustache: js.UndefOr[js.Any] = js.native
  var `request-promise`: js.UndefOr[js.Any] = js.native
  var requestOptions: js.UndefOr[CoreOptions] = js.native
  var token: js.UndefOr[String] = js.native
  var tv4: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object VaultOptions {
  @scala.inline
  def apply(): VaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultOptions]
  }
  @scala.inline
  implicit class VaultOptionsOps[Self <: VaultOptions] (val x: Self) extends AnyVal {
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
    def setPromise(value: PromiseConstructor): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setCommandsVarargs(value: Method*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[Method]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => _): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setMustache(value: js.Any): Self = this.set("mustache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMustache: Self = this.set("mustache", js.undefined)
    @scala.inline
    def `setRequest-promise`(value: js.Any): Self = this.set("request-promise", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequest-promise`: Self = this.set("request-promise", js.undefined)
    @scala.inline
    def setRequestOptions(value: CoreOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setTv4(value: /* repeated */ js.Any => _): Self = this.set("tv4", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTv4: Self = this.set("tv4", js.undefined)
  }
  
}

