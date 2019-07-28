package typings.meteorDashUniverseDashI18n.`meteorUniverse:i18nMod`

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nOptions extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var defaultLocale: js.UndefOr[String] = js.undefined
  var hideMissing: js.UndefOr[Boolean] = js.undefined
  var hostUrl: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[String] = js.undefined
  var purify: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sameLocaleOnServerConnection: js.UndefOr[Boolean] = js.undefined
  var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
}

object i18nOptions {
  @scala.inline
  def apply(
    close: String = null,
    defaultLocale: String = null,
    hideMissing: js.UndefOr[Boolean] = js.undefined,
    hostUrl: String = null,
    open: String = null,
    purify: () => Unit = null,
    sameLocaleOnServerConnection: js.UndefOr[Boolean] = js.undefined,
    translationsHeaders: OutgoingHttpHeaders = null
  ): i18nOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale)
    if (!js.isUndefined(hideMissing)) __obj.updateDynamic("hideMissing")(hideMissing)
    if (hostUrl != null) __obj.updateDynamic("hostUrl")(hostUrl)
    if (open != null) __obj.updateDynamic("open")(open)
    if (purify != null) __obj.updateDynamic("purify")(js.Any.fromFunction0(purify))
    if (!js.isUndefined(sameLocaleOnServerConnection)) __obj.updateDynamic("sameLocaleOnServerConnection")(sameLocaleOnServerConnection)
    if (translationsHeaders != null) __obj.updateDynamic("translationsHeaders")(translationsHeaders)
    __obj.asInstanceOf[i18nOptions]
  }
}

