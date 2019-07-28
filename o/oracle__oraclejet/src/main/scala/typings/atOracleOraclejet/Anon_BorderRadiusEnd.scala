package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderRadiusEnd extends js.Object {
  var borderRadius: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Anon_BorderRadiusEnd {
  @scala.inline
  def apply(
    borderRadius: String = null,
    end: String = null,
    height: Int | Double = null,
    start: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): Anon_BorderRadiusEnd = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (end != null) __obj.updateDynamic("end")(end)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.asInstanceOf[Anon_BorderRadiusEnd]
  }
}

