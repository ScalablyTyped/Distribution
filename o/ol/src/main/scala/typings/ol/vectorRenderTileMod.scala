package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.featureMod.FeatureLike
import typings.ol.renderMod.OrderFunction
import typings.ol.tilecoordMod.TileCoord
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorRenderTileMod {
  
  @JSImport("ol/VectorRenderTile", JSImport.Default)
  @js.native
  open class default protected () extends VectorRenderTile {
    /**
      * @param {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("./TileState.js").default} state State.
      * @param {import("./tilecoord.js").TileCoord} urlTileCoord Wrapped tile coordinate for source urls.
      * @param {function(VectorRenderTile):Array<import("./VectorTile").default>} getSourceTiles Function
      * to get source tiles for this tile.
      */
    def this(
      tileCoord: TileCoord,
      state: Any,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[/* arg0 */ VectorRenderTile, js.Array[typings.ol.vectorTileMod.default]]
    ) = this()
  }
  
  trait ReplayState extends StObject {
    
    /**
      * Dirty.
      */
    var dirty: Boolean
    
    /**
      * RenderedRenderOrder.
      */
    var renderedRenderOrder: Null | OrderFunction
    
    /**
      * RenderedResolution.
      */
    var renderedResolution: Double
    
    /**
      * RenderedRevision.
      */
    var renderedRevision: Double
    
    /**
      * RenderedTileResolution.
      */
    var renderedTileResolution: Double
    
    /**
      * RenderedTileRevision.
      */
    var renderedTileRevision: Double
    
    /**
      * RenderedTileZ.
      */
    var renderedTileZ: Double
  }
  object ReplayState {
    
    inline def apply(
      dirty: Boolean,
      renderedResolution: Double,
      renderedRevision: Double,
      renderedTileResolution: Double,
      renderedTileRevision: Double,
      renderedTileZ: Double
    ): ReplayState = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], renderedResolution = renderedResolution.asInstanceOf[js.Any], renderedRevision = renderedRevision.asInstanceOf[js.Any], renderedTileResolution = renderedTileResolution.asInstanceOf[js.Any], renderedTileRevision = renderedTileRevision.asInstanceOf[js.Any], renderedTileZ = renderedTileZ.asInstanceOf[js.Any], renderedRenderOrder = null)
      __obj.asInstanceOf[ReplayState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplayState] (val x: Self) extends AnyVal {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setRenderedRenderOrder(value: (/* arg0 */ FeatureLike, /* arg1 */ FeatureLike) => Double): Self = StObject.set(x, "renderedRenderOrder", js.Any.fromFunction2(value))
      
      inline def setRenderedRenderOrderNull: Self = StObject.set(x, "renderedRenderOrder", null)
      
      inline def setRenderedResolution(value: Double): Self = StObject.set(x, "renderedResolution", value.asInstanceOf[js.Any])
      
      inline def setRenderedRevision(value: Double): Self = StObject.set(x, "renderedRevision", value.asInstanceOf[js.Any])
      
      inline def setRenderedTileResolution(value: Double): Self = StObject.set(x, "renderedTileResolution", value.asInstanceOf[js.Any])
      
      inline def setRenderedTileRevision(value: Double): Self = StObject.set(x, "renderedTileRevision", value.asInstanceOf[js.Any])
      
      inline def setRenderedTileZ(value: Double): Self = StObject.set(x, "renderedTileZ", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VectorRenderTile
    extends typings.ol.tileMod.default {
    
    /**
      * @private
      * @type {!Object<string, CanvasRenderingContext2D>}
      */
    /* private */ var context_ : Any = js.native
    
    /**
      * Executor groups for decluttering, by layer uid. Entries are read/written by the renderer.
      * @type {Object<string, Array<import("./render/canvas/ExecutorGroup.js").default>>}
      */
    var declutterExecutorGroups: StringDictionary[js.Array[typings.ol.renderCanvasExecutorGroupMod.default]] = js.native
    
    /**
      * @type {Object<string, boolean>}
      */
    var errorTileKeys: StringDictionary[Boolean] = js.native
    
    /**
      * Executor groups by layer uid. Entries are read/written by the renderer.
      * @type {Object<string, Array<import("./render/canvas/ExecutorGroup.js").default>>}
      */
    var executorGroups: StringDictionary[js.Array[typings.ol.renderCanvasExecutorGroupMod.default]] = js.native
    
    /**
      * @param {import("./layer/Layer.js").default} layer Layer.
      * @return {CanvasRenderingContext2D} The rendering context.
      */
    def getContext(
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
    ): CanvasRenderingContext2D = js.native
    
    /**
      * Get the Canvas for this tile.
      * @param {import("./layer/Layer.js").default} layer Layer.
      * @return {HTMLCanvasElement} Canvas.
      */
    def getImage(
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
    ): HTMLCanvasElement = js.native
    
    /**
      * @param {import("./layer/Layer.js").default} layer Layer.
      * @return {ReplayState} The replay state.
      */
    def getReplayState(
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
    ): ReplayState = js.native
    
    /**
      * @type {!function():Array<import("./VectorTile.js").default>}
      */
    def getSourceTiles(): js.Array[typings.ol.vectorTileMod.default] = js.native
    
    /**
      * @param {import("./layer/Layer.js").default} layer Layer.
      * @return {boolean} Tile has a rendering context for the given layer.
      */
    def hasContext(
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
    ): Boolean = js.native
    
    /**
      * @type {Object<number, ImageData>}
      */
    var hitDetectionImageData: NumberDictionary[ImageData] = js.native
    
    /**
      * Number of loading source tiles. Read/written by the source.
      * @type {number}
      */
    var loadingSourceTiles: Double = js.native
    
    /**
      * @private
      * @type {!Object<string, ReplayState>}
      */
    /* private */ var replayState_ : Any = js.native
    
    /**
      * @type {Array<import("./VectorTile.js").default>}
      */
    var sourceTiles: js.Array[typings.ol.vectorTileMod.default] = js.native
    
    /**
      * @type {number}
      */
    var wantedResolution: Double = js.native
    
    /**
      * @type {import("./tilecoord.js").TileCoord}
      */
    var wrappedTileCoord: TileCoord = js.native
  }
}
