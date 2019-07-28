package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorCircle extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[circle | diamond | human | square | star | triangle | String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Anon_BorderColorCircle {
  @scala.inline
  def apply(
    borderColor: String = null,
    color: String = null,
    shape: circle | diamond | human | square | star | triangle | String = null,
    source: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): Anon_BorderColorCircle = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.asInstanceOf[Anon_BorderColorCircle]
  }
}

