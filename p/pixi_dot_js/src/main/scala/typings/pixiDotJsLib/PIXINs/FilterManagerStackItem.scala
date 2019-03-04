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
    val __obj = js.Dynamic.literal(destinationFrame = destinationFrame, filters = filters, renderTarget = renderTarget, resolution = resolution, sourceFrame = sourceFrame, target = target)
  
    __obj.asInstanceOf[FilterManagerStackItem]
  }
}

