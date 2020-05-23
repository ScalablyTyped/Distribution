package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Options ***/
trait PhononOptions extends js.Object {
  var i18n: js.UndefOr[PhononI18nOptions | Null] = js.undefined
  var navigator: js.UndefOr[PhononNavigatorOptions] = js.undefined
}

object PhononOptions {
  @scala.inline
  def apply(
    i18n: js.UndefOr[Null | PhononI18nOptions] = js.undefined,
    navigator: PhononNavigatorOptions = null
  ): PhononOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(i18n)) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (navigator != null) __obj.updateDynamic("navigator")(navigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononOptions]
  }
}

