package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.featureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.std.HTMLElement
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Layer", JSImport.Namespace)
@js.native
object rendererLayerMod extends js.Object {
  @js.native
  trait LayerRenderer[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */]
    extends typings.ol.observableMod.default {
    /* protected */ def createLoadedTileFinder(
      source: typings.ol.sourceTileMod.default,
      projection: typings.ol.projProjectionMod.default,
      tiles: NumberDictionary[StringDictionary[typings.ol.tileMod.default]]
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
    ): T | Unit = js.native
    def getDataAtPixel(pixel: Pixel, frameState: FrameState, hitTolerance: Double): Uint8ClampedArray | Uint8Array = js.native
    def getFeatures(pixel: Pixel): js.Promise[js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]] = js.native
    def getLayer(): LayerType = js.native
    def handleFontsChanged(): Unit = js.native
    /* protected */ def loadImage(image: typings.ol.imageBaseMod.default): Boolean = js.native
    def loadedTileCallback(
      tiles: NumberDictionary[StringDictionary[typings.ol.tileMod.default]],
      zoom: Double,
      tile: typings.ol.tileMod.default
    ): Unit = js.native
    def prepareFrame(frameState: FrameState): Boolean = js.native
    def renderFrame(frameState: FrameState, target: HTMLElement): HTMLElement = js.native
    /* protected */ def renderIfReadyAndVisible(): Unit = js.native
  }
  
  @js.native
  class default[LayerType /* <: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default] */] protected () extends LayerRenderer[LayerType] {
    def this(layer: LayerType) = this()
  }
  
}

