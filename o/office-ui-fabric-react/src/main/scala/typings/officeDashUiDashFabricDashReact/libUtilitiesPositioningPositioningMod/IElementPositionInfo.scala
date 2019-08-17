package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementPositionInfo extends IElementPosition {
  var targetRectangle: Rectangle
}

object IElementPositionInfo {
  @scala.inline
  def apply(
    elementRectangle: Rectangle,
    targetEdge: RectangleEdge,
    targetRectangle: Rectangle,
    alignmentEdge: RectangleEdge = null
  ): IElementPositionInfo = {
    val __obj = js.Dynamic.literal(elementRectangle = elementRectangle, targetEdge = targetEdge, targetRectangle = targetRectangle)
    if (alignmentEdge != null) __obj.updateDynamic("alignmentEdge")(alignmentEdge)
    __obj.asInstanceOf[IElementPositionInfo]
  }
}

