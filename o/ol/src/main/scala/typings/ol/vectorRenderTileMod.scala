package typings.ol

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorRenderTile", JSImport.Namespace)
@js.native
object vectorRenderTileMod extends js.Object {
  @js.native
  trait ReplayState extends js.Object {
    var dirty: Boolean = js.native
    @JSName("renderedRenderOrder")
    var renderedRenderOrder_Original: OrderFunction = js.native
    var renderedResolution: Double = js.native
    var renderedRevision: Double = js.native
    var renderedTileResolution: Double = js.native
    var renderedTileRevision: Double = js.native
    var renderedTileZ: Double = js.native
    var renderedZ: Double = js.native
    def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double = js.native
  }
  
  @js.native
  trait VectorRenderTile
    extends typings.ol.olTileMod.default {
    def getContext(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): CanvasRenderingContext2D = js.native
    def getImage(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): HTMLCanvasElement = js.native
    def getReplayState(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): ReplayState = js.native
    def hasContext(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): Boolean = js.native
  }
  
  @js.native
  class default protected () extends VectorRenderTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      getSourceTiles: js.Function1[/* p0 */ VectorRenderTile, js.Array[typings.ol.olVectorTileMod.default]],
      removeSourceTiles: js.Function1[/* p0 */ VectorRenderTile, Unit]
    ) = this()
  }
  
}

