package typings
package atNivoCoreLib.atNivoCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartesianMarkerProps extends js.Object {
  var axis: atNivoCoreLib.atNivoCoreLibStrings.x | atNivoCoreLib.atNivoCoreLibStrings.y
  var legend: js.UndefOr[java.lang.String] = js.undefined
  var lineStyle: js.UndefOr[stdLib.Partial[reactLib.reactMod.CSSProperties]] = js.undefined
  var textStyle: js.UndefOr[stdLib.Partial[reactLib.reactMod.CSSProperties]] = js.undefined
  var value: java.lang.String | scala.Double | stdLib.Date
}

object CartesianMarkerProps {
  @scala.inline
  def apply(
    axis: atNivoCoreLib.atNivoCoreLibStrings.x | atNivoCoreLib.atNivoCoreLibStrings.y,
    value: java.lang.String | scala.Double | stdLib.Date,
    legend: java.lang.String = null,
    lineStyle: stdLib.Partial[reactLib.reactMod.CSSProperties] = null,
    textStyle: stdLib.Partial[reactLib.reactMod.CSSProperties] = null
  ): CartesianMarkerProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[CartesianMarkerProps]
  }
}

