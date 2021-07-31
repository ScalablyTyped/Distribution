package typings.ol

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait ReplayState extends StObject {
    
    var dirty: Boolean
    
    def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double
    @JSName("renderedRenderOrder")
    var renderedRenderOrder_Original: OrderFunction
    
    var renderedResolution: Double
    
    var renderedRevision: Double
    
    var renderedTileResolution: Double
    
    var renderedTileRevision: Double
    
    var renderedTileZ: Double
    
    var renderedZ: Double
  }
  object ReplayState {
    
    @scala.inline
    def apply(
      dirty: Boolean,
      renderedRenderOrder: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => Double,
      renderedResolution: Double,
      renderedRevision: Double,
      renderedTileResolution: Double,
      renderedTileRevision: Double,
      renderedTileZ: Double,
      renderedZ: Double
    ): ReplayState = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], renderedRenderOrder = js.Any.fromFunction2(renderedRenderOrder), renderedResolution = renderedResolution.asInstanceOf[js.Any], renderedRevision = renderedRevision.asInstanceOf[js.Any], renderedTileResolution = renderedTileResolution.asInstanceOf[js.Any], renderedTileRevision = renderedTileRevision.asInstanceOf[js.Any], renderedTileZ = renderedTileZ.asInstanceOf[js.Any], renderedZ = renderedZ.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplayState]
    }
    
    @scala.inline
    implicit class ReplayStateMutableBuilder[Self <: ReplayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedRenderOrder(value: (/* p0 */ FeatureLike, /* p1 */ FeatureLike) => Double): Self = StObject.set(x, "renderedRenderOrder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderedResolution(value: Double): Self = StObject.set(x, "renderedResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedRevision(value: Double): Self = StObject.set(x, "renderedRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedTileResolution(value: Double): Self = StObject.set(x, "renderedTileResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedTileRevision(value: Double): Self = StObject.set(x, "renderedTileRevision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedTileZ(value: Double): Self = StObject.set(x, "renderedTileZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedZ(value: Double): Self = StObject.set(x, "renderedZ", value.asInstanceOf[js.Any])
    }
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
