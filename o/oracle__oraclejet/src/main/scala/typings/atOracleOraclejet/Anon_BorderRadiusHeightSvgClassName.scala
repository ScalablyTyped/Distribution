package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderRadiusHeightSvgClassName extends js.Object {
  var borderRadius: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Anon_BorderRadiusHeightSvgClassName {
  @scala.inline
  def apply(
    borderRadius: String = null,
    height: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    value: Int | Double = null
  ): Anon_BorderRadiusHeightSvgClassName = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (height != null) __obj.updateDynamic("height")(height)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderRadiusHeightSvgClassName]
  }
}

