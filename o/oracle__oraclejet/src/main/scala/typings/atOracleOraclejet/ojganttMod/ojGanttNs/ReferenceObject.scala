package typings.atOracleOraclejet.ojganttMod.ojGanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceObject extends js.Object {
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ReferenceObject {
  @scala.inline
  def apply(svgClassName: String = null, svgStyle: js.Object = null, value: String = null): ReferenceObject = {
    val __obj = js.Dynamic.literal()
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ReferenceObject]
  }
}

