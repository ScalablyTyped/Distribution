package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Options ***/
trait PhononOptions extends js.Object {
  var i18n: js.UndefOr[PhononI18nOptions | scala.Null] = js.undefined
  var navigator: js.UndefOr[PhononNavigatorOptions] = js.undefined
}

object PhononOptions {
  @scala.inline
  def apply(i18n: PhononI18nOptions = null, navigator: PhononNavigatorOptions = null): PhononOptions = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (navigator != null) __obj.updateDynamic("navigator")(navigator)
    __obj.asInstanceOf[PhononOptions]
  }
}

