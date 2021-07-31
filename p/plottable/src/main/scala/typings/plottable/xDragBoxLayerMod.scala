package typings.plottable

import typings.plottable.dragBoxLayerMod.DragBoxLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xDragBoxLayerMod {
  
  @JSImport("plottable/build/src/components/xDragBoxLayer", "XDragBoxLayer")
  @js.native
  /**
    * An XDragBoxLayer is a DragBoxLayer whose size can only be set in the X-direction.
    * The y-values of the bounds() are always set to 0 and the height() of the XDragBoxLayer.
    *
    * @constructor
    */
  class XDragBoxLayer () extends DragBoxLayer
}
