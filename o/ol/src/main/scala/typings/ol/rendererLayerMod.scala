package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.rendererMapMod.HitMatch
import typings.ol.rendererVectorMod.FeatureCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererLayerMod {
  
  @JSImport("ol/renderer/Layer", JSImport.Default)
  @js.native
  open class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */] protected () extends LayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
  
  @js.native
  trait LayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */]
    extends typings.ol.observableMod.default {
    
    /**
      * Create a function that adds loaded tiles to the tile lookup.
      */
    /* protected */ def createLoadedTileFinder(
      source: typings.ol.sourceTileMod.default,
      projection: typings.ol.projProjectionMod.default,
      tiles: NumberDictionary[StringDictionary[typings.ol.tileMod.default]]
    ): js.Function2[/* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean] = js.native
    
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: FeatureCallback[T],
      matches: js.Array[HitMatch[T]]
    ): js.UndefOr[T] = js.native
    
    def getDataAtPixel(pixel: Pixel, frameState: FrameState, hitTolerance: Double): js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array = js.native
    
    /**
      * Asynchronous layer level hit detection.
      */
    def getFeatures(pixel: Pixel): js.Promise[js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]] = js.native
    
    def getLayer(): LayerType = js.native
    
    /**
      * Perform action necessary to get the layer rendered after new fonts have loaded
      */
    def handleFontsChanged(): Unit = js.native
    
    /* protected */ var layer_ : LayerType = js.native
    
    /**
      * Load the image if not already loaded, and register the image change
      * listener if needed.
      */
    /* protected */ def loadImage(image: typings.ol.imageBaseMod.default): Boolean = js.native
    
    def loadedTileCallback(
      tiles: NumberDictionary[StringDictionary[typings.ol.tileMod.default]],
      zoom: Double,
      tile: typings.ol.tileMod.default
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
}
