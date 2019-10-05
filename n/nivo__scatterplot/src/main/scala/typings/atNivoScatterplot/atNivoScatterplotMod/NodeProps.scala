package typings.atNivoScatterplot.atNivoScatterplotMod

import typings.atNivoCore.atNivoCoreMod.CssMixBlendMode
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps extends js.Object {
  var blendMode: CssMixBlendMode
  var color: String
  var node: Node
  var onClick: js.UndefOr[VoidFunction] = js.undefined
  var onMouseEnter: js.UndefOr[VoidFunction] = js.undefined
  var onMouseLeave: js.UndefOr[VoidFunction] = js.undefined
  var onMouseMove: js.UndefOr[VoidFunction] = js.undefined
  var size: Double
  var x: Double
  var y: Double
}

object NodeProps {
  @scala.inline
  def apply(
    blendMode: CssMixBlendMode,
    color: String,
    node: Node,
    size: Double,
    x: Double,
    y: Double,
    onClick: () => Unit = null,
    onMouseEnter: () => Unit = null,
    onMouseLeave: () => Unit = null,
    onMouseMove: () => Unit = null
  ): NodeProps = {
    val __obj = js.Dynamic.literal(blendMode = blendMode, color = color, node = node, size = size, x = x, y = y)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction0(onMouseMove))
    __obj.asInstanceOf[NodeProps]
  }
}

