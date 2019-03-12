package typings
package meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nOptions extends js.Object {
  var close: js.UndefOr[java.lang.String] = js.undefined
  var defaultLocale: js.UndefOr[java.lang.String] = js.undefined
  var hideMissing: js.UndefOr[scala.Boolean] = js.undefined
  var hostUrl: js.UndefOr[java.lang.String] = js.undefined
  var open: js.UndefOr[java.lang.String] = js.undefined
  var purify: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var sameLocaleOnServerConnection: js.UndefOr[scala.Boolean] = js.undefined
  var translationsHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
}

object i18nOptions {
  @scala.inline
  def apply(
    close: java.lang.String = null,
    defaultLocale: java.lang.String = null,
    hideMissing: js.UndefOr[scala.Boolean] = js.undefined,
    hostUrl: java.lang.String = null,
    open: java.lang.String = null,
    purify: () => scala.Unit = null,
    sameLocaleOnServerConnection: js.UndefOr[scala.Boolean] = js.undefined,
    translationsHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null
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

