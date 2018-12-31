package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionedData extends js.Object {
  /**
    * The finalized alignment edge that the element is aligning too. For instance, RectangleEdge.left means
    * that the left edge of the target should be in line with the left edge of the element being positioned.
    */
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.undefined
  /**
    * The new position of the element.
    */
  var elementPosition: IPosition
  /**
    * The finalized target edge that element is aligning to. For instance RectangleEdge.bottom would mean
    * that the bottom edge of the target is being aligned to by the RectangleEdge.top of the element
    * that is being positioned.
    */
  var targetEdge: RectangleEdge
}

