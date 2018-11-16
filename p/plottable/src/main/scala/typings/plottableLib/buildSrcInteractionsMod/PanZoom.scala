package typings
package plottableLib.buildSrcInteractionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/interactions", "PanZoom")
@js.native
class PanZoom ()
  extends plottableLib.buildSrcInteractionsPanZoomInteractionMod.PanZoom {
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

@JSImport("plottable/build/src/interactions", "PanZoom")
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

