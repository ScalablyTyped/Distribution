package typings.ol

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorRenderTileMod {
  
  @JSImport("ol/VectorRenderTile", JSImport.Default)
  @js.native
  class default protected () extends VectorRenderTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[/* p0 */ VectorRenderTile, js.Array[typings.ol.olVectorTileMod.default]]
    ) = this()
  }
  
  @js.native
  trait ReplayState extends StObject {
    
    var dirty: Boolean = js.native
    
    def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double = js.native
    @JSName("renderedRenderOrder")
    var renderedRenderOrder_Original: OrderFunction = js.native
    
    var renderedResolution: Double = js.native
    
    var renderedRevision: Double = js.native
    
    var renderedTileResolution: Double = js.native
    
    var renderedTileRevision: Double = js.native
    
    var renderedTileZ: Double = js.native
    
    var renderedZ: Double = js.native
  }
  
  @js.native
  trait VectorRenderTile
    extends typings.ol.olTileMod.default {
    
    def getContext(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): CanvasRenderingContext2D = js.native
    
    /**
      * Get the Canvas for this tile.
      */
    def getImage(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): HTMLCanvasElement = js.native
    
    def getReplayState(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): ReplayState = js.native
    
    def hasContext(layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): Boolean = js.native
  }
}
