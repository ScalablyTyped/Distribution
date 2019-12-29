package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.layerLayerMod.State
import typings.ol.pluggableMapMod.FrameState
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/TileLayer", JSImport.Namespace)
@js.native
object rendererCanvasTileLayerMod extends js.Object {
  @js.native
  trait CanvasTileLayerRenderer
    extends typings.ol.rendererCanvasIntermediateCanvasMod.default {
    var context: CanvasRenderingContext2D = js.native
    var renderedRevision: Double = js.native
    var renderedTiles: js.Array[typings.ol.tileMod.default] = js.native
    var tmpExtent: Extent = js.native
    var zDirection: Double = js.native
    def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): CanvasTileLayerRenderer = js.native
    def drawTileImage(
      tile: typings.ol.tileMod.default,
      frameState: FrameState,
      layerState: State,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      gutter: Double,
      transition: Boolean
    ): Unit = js.native
    def getTile(
      z: Double,
      x: Double,
      y: Double,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default
    ): typings.ol.tileMod.default = js.native
    /* protected */ def getTileImage(tile: typings.ol.tileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasTileLayerRenderer {
    def this(tileLayer: typings.ol.layerTileMod.default) = this()
    def this(tileLayer: typings.ol.layerVectorTileMod.default) = this()
    def this(tileLayer: typings.ol.layerTileMod.default, opt_noContext: Boolean) = this()
    def this(tileLayer: typings.ol.layerVectorTileMod.default, opt_noContext: Boolean) = this()
  }
  
}

