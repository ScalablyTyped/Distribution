package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoBorderColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var rendered: js.UndefOr[on | off | auto] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Anon_AutoBorderColor {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderRadius: String = null,
    color: String = null,
    rendered: on | off | auto = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): Anon_AutoBorderColor = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (color != null) __obj.updateDynamic("color")(color)
    if (rendered != null) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.asInstanceOf[Anon_AutoBorderColor]
  }
}

