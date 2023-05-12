package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.featureMod.FeatureLike
import typings.ol.mapMod.FrameState
import typings.ol.pixelMod.Pixel
import typings.ol.rendererMapMod.HitMatch
import typings.ol.rendererVectorMod.FeatureCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererLayerMod {
  
  /**
    * @template {import("../layer/Layer.js").default} LayerType
    */
  @JSImport("ol/renderer/Layer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, LayerRenderer[Any]] */] protected () extends LayerRenderer[LayerType] {
    /**
      * @param {LayerType} layer Layer.
      */
    def this(layer: LayerType) = this()
  }
  
  /**
    * @template {import("../layer/Layer.js").default} LayerType
    */
  @js.native
  trait LayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, LayerRenderer[Any]] */]
    extends typings.ol.observableMod.default {
    
    /** @private */
    /* private */ var boundHandleImageChange_ : Any = js.native
    
    /**
      * Create a function that adds loaded tiles to the tile lookup.
      * @param {import("../source/Tile.js").default} source Tile source.
      * @param {import("../proj/Projection.js").default} projection Projection of the tiles.
      * @param {Object<number, Object<string, import("../Tile.js").default>>} tiles Lookup of loaded tiles by zoom level.
      * @return {function(number, import("../TileRange.js").default):boolean} A function that can be
      *     called with a zoom level and a tile range to add loaded tiles to the lookup.
      * @protected
      */
    /* protected */ def createLoadedTileFinder(
      source: typings.ol.tileMod.default,
      projection: typings.ol.projProjectionMod.default,
      tiles: NumberDictionary[StringDictionary[typings.ol.tileMod.default]]
    ): js.Function2[/* arg0 */ Double, /* arg1 */ typings.ol.tileRangeMod.default, Boolean] = js.native
    
    /**
      * @type {import("../render/canvas/ExecutorGroup").default}
      */
    var declutterExecutorGroup: typings.ol.renderCanvasExecutorGroupMod.default = js.native
    
    /**
      * @abstract
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      * @param {number} hitTolerance Hit tolerance in pixels.
      * @param {import("./vector.js").FeatureCallback<T>} callback Feature callback.
      * @param {Array<import("./Map.js").HitMatch<T>>} matches The hit detected matches with tolerance.
      * @return {T|undefined} Callback result.
      * @template T
      */
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: FeatureCallback[T],
      matches: js.Array[HitMatch[T]]
    ): js.UndefOr[T] = js.native
    
    /**
      * @param {import("../pixel.js").Pixel} pixel Pixel.
      * @return {Uint8ClampedArray|Uint8Array|Float32Array|DataView|null} Pixel data.
      */
    def getData(pixel: Pixel): js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array | js.typedarray.Float32Array | js.typedarray.DataView | Null = js.native
    
    /**
      * Asynchronous layer level hit detection.
      * @param {import("../pixel.js").Pixel} pixel Pixel.
      * @return {Promise<Array<import("../Feature").FeatureLike>>} Promise that resolves with
      * an array of features.
      */
    def getFeatures(pixel: Pixel): js.Promise[js.Array[FeatureLike]] = js.native
    
    /**
      * @return {LayerType} Layer.
      */
    def getLayer(): LayerType = js.native
    
    /**
      * Perform action necessary to get the layer rendered after new fonts have loaded
      * @abstract
      */
    def handleFontsChanged(): Unit = js.native
    
    /**
      * Handle changes in image state.
      * @param {import("../events/Event.js").default} event Image change event.
      * @private
      */
    /* private */ var handleImageChange_ : Any = js.native
    
    /**
      * @protected
      * @type {LayerType}
      */
    /* protected */ var layer_ : LayerType = js.native
    
    /**
      * Load the image if not already loaded, and register the image change
      * listener if needed.
      * @param {import("../ImageBase.js").default} image Image.
      * @return {boolean} `true` if the image is already loaded, `false` otherwise.
      * @protected
      */
    /* protected */ def loadImage(image: typings.ol.imageBaseMod.default): Boolean = js.native
    
    /**
      * @param {Object<number, Object<string, import("../Tile.js").default>>} tiles Lookup of loaded tiles by zoom level.
      * @param {number} zoom Zoom level.
      * @param {import("../Tile.js").default} tile Tile.
      * @return {boolean|void} If `false`, the tile will not be considered loaded.
      */
    def loadedTileCallback(
      tiles: NumberDictionary[StringDictionary[typings.ol.tileMod.default]],
      zoom: Double,
      tile: typings.ol.tileMod.default
    ): Boolean | Unit = js.native
    
    /**
      * Determine whether render should be called.
      * @abstract
      * @param {import("../Map.js").FrameState} frameState Frame state.
      * @return {boolean} Layer is ready to be rendered.
      */
    def prepareFrame(frameState: FrameState): Boolean = js.native
    
    /**
      * The renderer is initialized and ready to render.
      * @type {boolean}
      */
    var ready: Boolean = js.native
    
    /**
      * Render the layer.
      * @abstract
      * @param {import("../Map.js").FrameState} frameState Frame state.
      * @param {HTMLElement} target Target that may be used to render content to.
      * @return {HTMLElement} The rendered element.
      */
    def renderFrame(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    
    /**
      * @protected
      */
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
  }
}
