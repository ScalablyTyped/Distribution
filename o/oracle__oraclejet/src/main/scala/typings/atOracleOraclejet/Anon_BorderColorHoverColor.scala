package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorHoverColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var selectedInnerColor: js.UndefOr[String] = js.undefined
  var selectedOuterColor: js.UndefOr[String] = js.undefined
}

object Anon_BorderColorHoverColor {
  @scala.inline
  def apply(
    borderColor: String = null,
    hoverColor: String = null,
    selectedInnerColor: String = null,
    selectedOuterColor: String = null
  ): Anon_BorderColorHoverColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    if (selectedInnerColor != null) __obj.updateDynamic("selectedInnerColor")(selectedInnerColor.asInstanceOf[js.Any])
    if (selectedOuterColor != null) __obj.updateDynamic("selectedOuterColor")(selectedOuterColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColorHoverColor]
  }
}

