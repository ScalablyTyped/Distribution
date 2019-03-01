package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderRadiusHeight extends js.Object {
  var borderRadius: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Anon_BorderRadiusHeight {
  @scala.inline
  def apply(
    borderRadius: java.lang.String = null,
    height: java.lang.String = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null
  ): Anon_BorderRadiusHeight = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (height != null) __obj.updateDynamic("height")(height)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.asInstanceOf[Anon_BorderRadiusHeight]
  }
}

