package typings.atNivoCore.atNivoCoreMod

import typings.atNivoCore.atNivoCoreStrings.x
import typings.atNivoCore.atNivoCoreStrings.y
import typings.react.reactMod.CSSProperties
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartesianMarkerProps extends js.Object {
  var axis: x | y
  var legend: js.UndefOr[String] = js.undefined
  var lineStyle: js.UndefOr[Partial[CSSProperties]] = js.undefined
  var textStyle: js.UndefOr[Partial[CSSProperties]] = js.undefined
  var value: String | Double | Date
}

object CartesianMarkerProps {
  @scala.inline
  def apply(
    axis: x | y,
    value: String | Double | Date,
    legend: String = null,
    lineStyle: Partial[CSSProperties] = null,
    textStyle: Partial[CSSProperties] = null
  ): CartesianMarkerProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[CartesianMarkerProps]
  }
}

