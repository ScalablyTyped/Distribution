package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.ellipse
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderStyle extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderStyle: js.UndefOr[none | solid] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonBorderStyle {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderStyle: none | solid = null,
    borderWidth: Int | Double = null,
    color: String = null,
    height: Int | Double = null,
    labelStyle: js.Object = null,
    opacity: Int | Double = null,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null,
    width: Int | Double = null
  ): AnonBorderStyle = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderStyle]
  }
}

