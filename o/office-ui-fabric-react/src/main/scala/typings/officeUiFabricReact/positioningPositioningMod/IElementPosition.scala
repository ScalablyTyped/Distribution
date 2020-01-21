package typings.officeUiFabricReact.positioningPositioningMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementPosition extends js.Object {
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.undefined
  var elementRectangle: Rectangle
  var targetEdge: RectangleEdge
}

object IElementPosition {
  @scala.inline
  def apply(elementRectangle: Rectangle, targetEdge: RectangleEdge, alignmentEdge: RectangleEdge = null): IElementPosition = {
    val __obj = js.Dynamic.literal(elementRectangle = elementRectangle.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementPosition]
  }
}

