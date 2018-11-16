package typings
package plottableLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src", "Interactions")
@js.native
object InteractionsNs extends js.Object {
  @js.native
  class Click ()
    extends plottableLib.buildSrcInteractionsMod.Click
  
  @js.native
  class Drag ()
    extends plottableLib.buildSrcInteractionsMod.Drag
  
  @js.native
  class Key ()
    extends plottableLib.buildSrcInteractionsMod.Key
  
  @js.native
  class PanZoom ()
    extends plottableLib.buildSrcInteractionsMod.PanZoom {
    /**
         * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
         * in response to the user panning or zooming.
         *
         * @constructor
         * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
         * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
         */
    def this(xScale: plottableLib.buildSrcScalesScaleMod.TransformableScale[_, scala.Double]) = this()
    /**
         * A PanZoom Interaction updates the domains of an x-scale and/or a y-scale
         * in response to the user panning or zooming.
         *
         * @constructor
         * @param {TransformableScale} [xScale] The x-scale to update on panning/zooming.
         * @param {TransformableScale} [yScale] The y-scale to update on panning/zooming.
         */
    def this(xScale: plottableLib.buildSrcScalesScaleMod.TransformableScale[_, scala.Double], yScale: plottableLib.buildSrcScalesScaleMod.TransformableScale[_, scala.Double]) = this()
  }
  
  @js.native
  class Pointer ()
    extends plottableLib.buildSrcInteractionsMod.Pointer
  
  def zoomOut(value: scala.Double, zoom: scala.Double, center: scala.Double): scala.Double = js.native
  @js.native
  object Click extends js.Object {
    /* private */ def _pointsEqual(p1: js.Any, p2: js.Any): js.Any = js.native
  }
  
  @js.native
  object Drag extends js.Object {
    var _DEFAULT_MOUSE_FILTER: js.Any = js.native
  }
  
  @js.native
  object PanZoom extends js.Object {
    /**
         * The number of pixels occupied in a line.
         */
    var _PIXELS_PER_LINE: js.Any = js.native
    /* private */ def _pointDistance(point1: js.Any, point2: js.Any): js.Any = js.native
    def centerPoint(
      point1: plottableLib.buildSrcCoreInterfacesMod.Point,
      point2: plottableLib.buildSrcCoreInterfacesMod.Point
    ): plottableLib.Anon_Y = js.native
  }
  
}

