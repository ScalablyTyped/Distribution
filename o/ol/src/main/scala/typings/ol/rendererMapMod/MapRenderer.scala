package typings.ol.rendererMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.featureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventTypeMod.EventType
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapRenderer
  extends typings.ol.disposableMod.default {
  /* protected */ def calculateMatrices2D(frameState: FrameState): Unit = js.native
  def dispatchRenderEvent(`type`: EventType, frameState: FrameState): Unit = js.native
  def forEachFeatureAtCoordinate[S, T, U](
    coordinate: Coordinate,
    frameState: FrameState,
    hitTolerance: Double,
    callback: js.ThisFunction2[/* this */ S, /* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default, T],
    thisArg: S,
    layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ typings.ol.layerLayerMod.default, Boolean],
    thisArg2: U
  ): js.UndefOr[T] = js.native
  def forEachLayerAtPixel[S, T, U](
    pixel: Pixel,
    frameState: FrameState,
    hitTolerance: Double,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ typings.ol.layerLayerMod.default, 
      /* p1 */ Uint8ClampedArray | Uint8Array, 
      T
    ],
    thisArg: S,
    layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ typings.ol.layerLayerMod.default, Boolean],
    thisArg2: U
  ): js.UndefOr[T] = js.native
  /* protected */ def getLayerRenderer(layer: typings.ol.layerBaseMod.default): typings.ol.rendererLayerMod.default = js.native
  /* protected */ def getLayerRendererByKey(layerKey: String): typings.ol.rendererLayerMod.default = js.native
  /* protected */ def getLayerRenderers(): StringDictionary[typings.ol.rendererLayerMod.default] = js.native
  def getMap(): typings.ol.pluggableMapMod.default = js.native
  def hasFeatureAtCoordinate[U](
    coordinate: Coordinate,
    frameState: FrameState,
    hitTolerance: Double,
    layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ typings.ol.layerLayerMod.default, Boolean],
    thisArg: U
  ): Boolean = js.native
  def registerLayerRenderers(constructors: js.Array[typings.ol.rendererLayerMod.default]): Unit = js.native
  def removeLayerRenderers(): Unit = js.native
  def renderFrame(frameState: FrameState): Unit = js.native
  /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
  /* protected */ def scheduleRemoveUnusedLayerRenderers(frameState: FrameState): Unit = js.native
}

