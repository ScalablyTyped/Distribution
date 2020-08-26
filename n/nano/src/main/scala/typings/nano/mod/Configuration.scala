package typings.nano.mod

import typings.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var cookie: js.UndefOr[String] = js.native
  var log: js.UndefOr[js.Function2[/* id */ String, /* args */ js.Any, Unit]] = js.native
  var parseUrl: js.UndefOr[Boolean] = js.native
  var request: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.native
  var requestDefaults: js.UndefOr[CoreOptions] = js.native
  var url: String = js.native
}

object Configuration {
  @scala.inline
  def apply(url: String): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setLog(value: (/* id */ String, /* args */ js.Any) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setParseUrl(value: Boolean): Self = this.set("parseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseUrl: Self = this.set("parseUrl", js.undefined)
    @scala.inline
    def setRequest(value: /* params */ js.Any => Unit): Self = this.set("request", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setRequestDefaults(value: CoreOptions): Self = this.set("requestDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestDefaults: Self = this.set("requestDefaults", js.undefined)
  }
  
}

