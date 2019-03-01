package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultRootLabel extends js.Object {
  var defaultRootLabel: js.UndefOr[java.lang.String] = js.undefined
  var hierMenuBtnLabel: js.UndefOr[java.lang.String] = js.undefined
  var previousIcon: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DefaultRootLabel {
  @scala.inline
  def apply(
    defaultRootLabel: java.lang.String = null,
    hierMenuBtnLabel: java.lang.String = null,
    previousIcon: java.lang.String = null
  ): Anon_DefaultRootLabel = {
    val __obj = js.Dynamic.literal()
    if (defaultRootLabel != null) __obj.updateDynamic("defaultRootLabel")(defaultRootLabel)
    if (hierMenuBtnLabel != null) __obj.updateDynamic("hierMenuBtnLabel")(hierMenuBtnLabel)
    if (previousIcon != null) __obj.updateDynamic("previousIcon")(previousIcon)
    __obj.asInstanceOf[Anon_DefaultRootLabel]
  }
}

