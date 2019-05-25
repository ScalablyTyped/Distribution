package typings
package olLib.rendererCanvasTileLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTileLayerRenderer
  extends olLib.rendererCanvasIntermediateCanvasMod.default {
  var context: stdLib.CanvasRenderingContext2D = js.native
  var renderedRevision: scala.Double = js.native
  var renderedTiles: js.Array[olLib.tileMod.default] = js.native
  var tmpExtent: olLib.extentMod.Extent = js.native
  var zDirection: scala.Double = js.native
  def create(mapRenderer: olLib.rendererMapMod.default, layer: olLib.layerLayerMod.default): CanvasTileLayerRenderer = js.native
  def drawTileImage(
    tile: olLib.tileMod.default,
    frameState: olLib.pluggableMapMod.FrameState,
    layerState: olLib.layerLayerMod.State,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    gutter: scala.Double,
    transition: scala.Boolean
  ): scala.Unit = js.native
  @JSName("getLayer")
  def getLayer_default(): olLib.layerLayerMod.default = js.native
  def getTile(
    z: scala.Double,
    x: scala.Double,
    y: scala.Double,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default
  ): olLib.tileMod.default = js.native
  /* protected */ def getTileImage(tile: olLib.tileMod.default): stdLib.HTMLCanvasElement | stdLib.HTMLImageElement | stdLib.HTMLVideoElement = js.native
  def handles(layer: olLib.layerLayerMod.default): scala.Boolean = js.native
}

