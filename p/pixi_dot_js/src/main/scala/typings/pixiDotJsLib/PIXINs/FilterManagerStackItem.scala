package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterManagerStackItem extends js.Object {
  var destinationFrame: Rectangle
  var filters: js.Array[Filter[_]]
  var renderTarget: RenderTarget
  var resolution: scala.Double
  var sourceFrame: Rectangle
  var target: js.Any
}

object FilterManagerStackItem {
  @scala.inline
  def apply(
    destinationFrame: Rectangle,
    filters: js.Array[Filter[_]],
    renderTarget: RenderTarget,
    resolution: scala.Double,
    sourceFrame: Rectangle,
    target: js.Any
  ): FilterManagerStackItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destinationFrame")(destinationFrame)
    __obj.updateDynamic("filters")(filters)
    __obj.updateDynamic("renderTarget")(renderTarget)
    __obj.updateDynamic("resolution")(resolution)
    __obj.updateDynamic("sourceFrame")(sourceFrame)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[FilterManagerStackItem]
  }
}

