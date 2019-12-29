package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.featureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.UrlFunction
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorImageTile", JSImport.Namespace)
@js.native
object vectorImageTileMod extends js.Object {
  @js.native
  trait ReplayState extends js.Object {
    var dirty: Boolean = js.native
    @JSName("renderedRenderOrder")
    var renderedRenderOrder_Original: OrderFunction = js.native
    var renderedRevision: Double = js.native
    var renderedTileRevision: Double = js.native
    def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double = js.native
  }
  
  @js.native
  trait VectorImageTile
    extends typings.ol.tileMod.default {
    def getContext(layer: typings.ol.layerLayerMod.default): CanvasRenderingContext2D = js.native
    def getImage(layer: typings.ol.layerLayerMod.default): HTMLCanvasElement = js.native
    def getReplayState(layer: typings.ol.layerLayerMod.default): ReplayState = js.native
    def getTile(tileKey: String): typings.ol.vectorTileMod.default = js.native
  }
  
  @js.native
  class default protected () extends VectorImageTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      sourceRevision: Double,
      format: typings.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction,
      urlTileCoord: TileCoord,
      tileUrlFunction: UrlFunction,
      sourceTileGrid: typings.ol.tilegridTileGridMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      sourceTiles: StringDictionary[typings.ol.vectorTileMod.default],
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default,
      tileClass: typings.ol.vectorTileMod.default,
      handleTileChange: js.ThisFunction1[
            /* this */ typings.ol.sourceVectorTileMod.default, 
            /* p0 */ typings.ol.eventsEventMod.default, 
            Unit
          ],
      zoom: Double
    ) = this()
  }
  
  def defaultLoadFunction(tile: typings.ol.vectorTileMod.default, url: String): Unit = js.native
}

