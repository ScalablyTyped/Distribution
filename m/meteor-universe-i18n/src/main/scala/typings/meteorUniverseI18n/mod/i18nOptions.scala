package typings.meteorUniverseI18n.mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18nOptions extends js.Object {
  var close: String = js.native
  var defaultLocale: String = js.native
  var hideMissing: Boolean = js.native
  var hostUrl: String = js.native
  var open: String = js.native
  var purify: js.UndefOr[js.Function0[Unit]] = js.native
  var sameLocaleOnServerConnection: Boolean = js.native
  var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
}

object i18nOptions {
  @scala.inline
  def apply(
    close: String,
    defaultLocale: String,
    hideMissing: Boolean,
    hostUrl: String,
    open: String,
    sameLocaleOnServerConnection: Boolean
  ): i18nOptions = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], hideMissing = hideMissing.asInstanceOf[js.Any], hostUrl = hostUrl.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sameLocaleOnServerConnection = sameLocaleOnServerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nOptions]
  }
  @scala.inline
  implicit class i18nOptionsOps[Self <: i18nOptions] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideMissing(value: Boolean): Self = this.set("hideMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostUrl(value: String): Self = this.set("hostUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setSameLocaleOnServerConnection(value: Boolean): Self = this.set("sameLocaleOnServerConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurify(value: () => Unit): Self = this.set("purify", js.Any.fromFunction0(value))
    @scala.inline
    def deletePurify: Self = this.set("purify", js.undefined)
    @scala.inline
    def setTranslationsHeaders(value: OutgoingHttpHeaders): Self = this.set("translationsHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslationsHeaders: Self = this.set("translationsHeaders", js.undefined)
  }
  
}

