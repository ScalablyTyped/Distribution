package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSvgClassName extends js.Object {
  var borderRadius: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object AnonSvgClassName {
  @scala.inline
  def apply(
    borderRadius: String = null,
    height: Int | Double = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): AnonSvgClassName = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSvgClassName]
  }
}

