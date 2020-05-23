package typings.meteorUniverseI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslaterOptions extends js.Object {
  var _locale: js.UndefOr[String] = js.undefined
  var _purify: js.UndefOr[Boolean] = js.undefined
}

object TranslaterOptions {
  @scala.inline
  def apply(_locale: String = null, _purify: js.UndefOr[Boolean] = js.undefined): TranslaterOptions = {
    val __obj = js.Dynamic.literal()
    if (_locale != null) __obj.updateDynamic("_locale")(_locale.asInstanceOf[js.Any])
    if (!js.isUndefined(_purify)) __obj.updateDynamic("_purify")(_purify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslaterOptions]
  }
}

