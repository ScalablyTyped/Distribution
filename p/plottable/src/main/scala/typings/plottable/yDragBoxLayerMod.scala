package typings.plottable

import typings.plottable.dragBoxLayerMod.DragBoxLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/yDragBoxLayer", JSImport.Namespace)
@js.native
object yDragBoxLayerMod extends js.Object {
  @js.native
  /**
    * A YDragBoxLayer is a DragBoxLayer whose size can only be set in the Y-direction.
    * The x-values of the bounds() are always set to 0 and the width() of the YDragBoxLayer.
    *
    * @constructor
    */
  class YDragBoxLayer () extends DragBoxLayer
  
}

