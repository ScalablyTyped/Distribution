package typings.plottable

import typings.plottable.dragBoxLayerMod.DragBoxLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/components/xDragBoxLayer", JSImport.Namespace)
@js.native
object xDragBoxLayerMod extends js.Object {
  
  @js.native
  /**
    * An XDragBoxLayer is a DragBoxLayer whose size can only be set in the X-direction.
    * The y-values of the bounds() are always set to 0 and the height() of the XDragBoxLayer.
    *
    * @constructor
    */
  class XDragBoxLayer () extends DragBoxLayer
}
