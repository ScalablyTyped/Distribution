package typings.meteorUniverseI18n.anon

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<meteor-universe-i18n.meteor/universe:i18n.i18nOptions> */
@js.native
trait Partiali18nOptions extends js.Object {
  var close: js.UndefOr[String] = js.native
  var defaultLocale: js.UndefOr[String] = js.native
  var hideMissing: js.UndefOr[Boolean] = js.native
  var hostUrl: js.UndefOr[String] = js.native
  var open: js.UndefOr[String] = js.native
  var purify: js.UndefOr[js.Function0[Unit]] = js.native
  var sameLocaleOnServerConnection: js.UndefOr[Boolean] = js.native
  var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
}

object Partiali18nOptions {
  @scala.inline
  def apply(): Partiali18nOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partiali18nOptions]
  }
  @scala.inline
  implicit class Partiali18nOptionsOps[Self <: Partiali18nOptions] (val x: Self) extends AnyVal {
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
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    @scala.inline
    def setHideMissing(value: Boolean): Self = this.set("hideMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMissing: Self = this.set("hideMissing", js.undefined)
    @scala.inline
    def setHostUrl(value: String): Self = this.set("hostUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostUrl: Self = this.set("hostUrl", js.undefined)
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPurify(value: () => Unit): Self = this.set("purify", js.Any.fromFunction0(value))
    @scala.inline
    def deletePurify: Self = this.set("purify", js.undefined)
    @scala.inline
    def setSameLocaleOnServerConnection(value: Boolean): Self = this.set("sameLocaleOnServerConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameLocaleOnServerConnection: Self = this.set("sameLocaleOnServerConnection", js.undefined)
    @scala.inline
    def setTranslationsHeaders(value: OutgoingHttpHeaders): Self = this.set("translationsHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslationsHeaders: Self = this.set("translationsHeaders", js.undefined)
  }
  
}

