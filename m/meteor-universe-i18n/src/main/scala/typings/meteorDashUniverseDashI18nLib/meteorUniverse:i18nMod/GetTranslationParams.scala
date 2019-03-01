package typings
package meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTranslationParams
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var _locale: js.UndefOr[java.lang.String] = js.undefined
  var _namespace: js.UndefOr[java.lang.String] = js.undefined
}

object GetTranslationParams {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _locale: java.lang.String = null,
    _namespace: java.lang.String = null
  ): GetTranslationParams = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_locale != null) __obj.updateDynamic("_locale")(_locale)
    if (_namespace != null) __obj.updateDynamic("_namespace")(_namespace)
    __obj.asInstanceOf[GetTranslationParams]
  }
}

