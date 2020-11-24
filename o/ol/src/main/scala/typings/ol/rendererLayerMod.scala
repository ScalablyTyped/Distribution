package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.std.HTMLElement
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/renderer/Layer", JSImport.Namespace)
@js.native
object rendererLayerMod extends js.Object {
  
  @js.native
  trait LayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */]
    extends typings.ol.observableMod.default {
    
    /**
      * Create a function that adds loaded tiles to the tile lookup.
      */
    /* protected */ def createLoadedTileFinder(
      source: typings.ol.sourceTileMod.default,
      projection: typings.ol.projectionMod.default,
      tiles: NumberDictionary[StringDictionary[typings.ol.olTileMod.default]]
    ): js.Function2[/* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean] = js.native
    
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[
          /* p0 */ FeatureLike, 
          /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          T
        ],
      declutteredFeatures: js.Array[FeatureLike]
    ): T = js.native
    
    def getDataAtPixel(pixel: Pixel, frameState: FrameState, hitTolerance: Double): Uint8ClampedArray | Uint8Array = js.native
    
    /**
      * Asynchronous layer level hit detection.
      */
    def getFeatures(pixel: Pixel): js.Promise[js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]] = js.native
    
    def getLayer(): LayerType = js.native
    
    /**
      * Perform action necessary to get the layer rendered after new fonts have loaded
      */
    def handleFontsChanged(): Unit = js.native
    
    var layer_ : LayerType = js.native
    
    /**
      * Load the image if not already loaded, and register the image change
      * listener if needed.
      */
    /* protected */ def loadImage(image: typings.ol.imageBaseMod.default): Boolean = js.native
    
    def loadedTileCallback(
      tiles: NumberDictionary[StringDictionary[typings.ol.olTileMod.default]],
      zoom: Double,
      tile: typings.ol.olTileMod.default
    ): Boolean = js.native
    
    /**
      * Determine whether render should be called.
      */
    def prepareFrame(frameState: FrameState): Boolean = js.native
    
    /**
      * Render the layer.
      */
    def renderFrame(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
  }
  
  @js.native
  class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */] protected () extends LayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
}
