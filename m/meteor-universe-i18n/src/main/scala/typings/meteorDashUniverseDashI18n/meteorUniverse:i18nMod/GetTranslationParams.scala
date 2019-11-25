package typings.meteorDashUniverseDashI18n.`meteorUniverse:i18nMod`

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTranslationParams
  extends /* key */ StringDictionary[js.Any] {
  var _locale: js.UndefOr[String] = js.undefined
  var _namespace: js.UndefOr[String] = js.undefined
}

object GetTranslationParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    _locale: String = null,
    _namespace: String = null
  ): GetTranslationParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_locale != null) __obj.updateDynamic("_locale")(_locale.asInstanceOf[js.Any])
    if (_namespace != null) __obj.updateDynamic("_namespace")(_namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranslationParams]
  }
}

