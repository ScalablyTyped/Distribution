package typings
package meteorDashUniverseDashI18nLib.`meteorUniverse:i18nMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslaterOptions extends js.Object {
  var _locale: js.UndefOr[java.lang.String] = js.undefined
  var _purify: js.UndefOr[scala.Boolean] = js.undefined
}

object TranslaterOptions {
  @scala.inline
  def apply(_locale: java.lang.String = null, _purify: js.UndefOr[scala.Boolean] = js.undefined): TranslaterOptions = {
    val __obj = js.Dynamic.literal()
    if (_locale != null) __obj.updateDynamic("_locale")(_locale)
    if (!js.isUndefined(_purify)) __obj.updateDynamic("_purify")(_purify)
    __obj.asInstanceOf[TranslaterOptions]
  }
}

