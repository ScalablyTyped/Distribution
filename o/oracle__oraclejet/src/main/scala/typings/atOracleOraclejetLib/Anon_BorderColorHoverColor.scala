package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorHoverColor extends js.Object {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var selectedInnerColor: js.UndefOr[java.lang.String] = js.undefined
  var selectedOuterColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BorderColorHoverColor {
  @scala.inline
  def apply(
    borderColor: java.lang.String = null,
    hoverColor: java.lang.String = null,
    selectedInnerColor: java.lang.String = null,
    selectedOuterColor: java.lang.String = null
  ): Anon_BorderColorHoverColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (selectedInnerColor != null) __obj.updateDynamic("selectedInnerColor")(selectedInnerColor)
    if (selectedOuterColor != null) __obj.updateDynamic("selectedOuterColor")(selectedOuterColor)
    __obj.asInstanceOf[Anon_BorderColorHoverColor]
  }
}

