package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderRadius extends js.Object {
  var borderRadius: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Anon_BorderRadius {
  @scala.inline
  def apply(
    borderRadius: String = null,
    height: Int | Double = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): Anon_BorderRadius = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.asInstanceOf[Anon_BorderRadius]
  }
}

