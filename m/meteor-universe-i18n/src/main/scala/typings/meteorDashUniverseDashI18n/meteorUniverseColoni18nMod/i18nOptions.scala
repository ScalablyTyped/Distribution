package typings.meteorDashUniverseDashI18n.meteorUniverseColoni18nMod

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
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMissing)) __obj.updateDynamic("hideMissing")(hideMissing.asInstanceOf[js.Any])
    if (hostUrl != null) __obj.updateDynamic("hostUrl")(hostUrl.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (purify != null) __obj.updateDynamic("purify")(js.Any.fromFunction0(purify))
    if (!js.isUndefined(sameLocaleOnServerConnection)) __obj.updateDynamic("sameLocaleOnServerConnection")(sameLocaleOnServerConnection.asInstanceOf[js.Any])
    if (translationsHeaders != null) __obj.updateDynamic("translationsHeaders")(translationsHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nOptions]
  }
}

