package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps extends js.Object {
  var blendMode: atNivoCoreLib.atNivoCoreMod.CssMixBlendMode
  var color: java.lang.String
  var node: Node
  var onClick: js.UndefOr[stdLib.VoidFunction] = js.undefined
  var onMouseEnter: js.UndefOr[stdLib.VoidFunction] = js.undefined
  var onMouseLeave: js.UndefOr[stdLib.VoidFunction] = js.undefined
  var onMouseMove: js.UndefOr[stdLib.VoidFunction] = js.undefined
  var size: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object NodeProps {
  @scala.inline
  def apply(
    blendMode: atNivoCoreLib.atNivoCoreMod.CssMixBlendMode,
    color: java.lang.String,
    node: Node,
    size: scala.Double,
    x: scala.Double,
    y: scala.Double,
    onClick: stdLib.VoidFunction = null,
    onMouseEnter: stdLib.VoidFunction = null,
    onMouseLeave: stdLib.VoidFunction = null,
    onMouseMove: stdLib.VoidFunction = null
  ): NodeProps = {
    val __obj = js.Dynamic.literal(blendMode = blendMode, color = color, node = node, size = size, x = x, y = y)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    __obj.asInstanceOf[NodeProps]
  }
}

