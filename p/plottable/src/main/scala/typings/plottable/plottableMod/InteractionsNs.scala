package typings.plottable.plottableMod

import typings.plottable.Anon_X
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcScalesScaleMod.TransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Interactions")
@js.native
object InteractionsNs extends js.Object {
  @js.native
  class Click ()
    extends typings.plottable.buildSrcInteractionsMod.Click
  
  @js.native
  class Drag ()
    extends typings.plottable.buildSrcInteractionsMod.Drag {
    def this(mouseButton: Double) = this()
  }
  
  @js.native
  class Key ()
    extends typings.plottable.buildSrcInteractionsMod.Key
  
  @js.native
  /**
    * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
    * in response to the user panning or zooming.
    *
    * @constructor
    * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
    * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
    */
  class PanZoom ()
    extends typings.plottable.buildSrcInteractionsMod.PanZoom {
    def this(xScale: TransformableScale[_, Double]) = this()
    def this(xScale: TransformableScale[_, Double], yScale: TransformableScale[_, Double]) = this()
  }
  
  @js.native
  class Pointer ()
    extends typings.plottable.buildSrcInteractionsMod.Pointer
  
  def zoomOut(value: Double, zoom: Double, center: Double): Double = js.native
  /* static members */
  @js.native
  object Click extends js.Object {
    /* private */ def _pointsEqual(p1: js.Any, p2: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Drag extends js.Object {
    var _DEFAULT_MOUSE_FILTER: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object PanZoom extends js.Object {
    /**
      * The number of pixels occupied in a line.
      */
    var _PIXELS_PER_LINE: js.Any = js.native
    /* private */ def _pointDistance(point1: js.Any, point2: js.Any): js.Any = js.native
    def centerPoint(point1: Point, point2: Point): Anon_X = js.native
  }
  
}

