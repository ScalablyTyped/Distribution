package typings
package olLib.rendererMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapRenderer
  extends olLib.disposableMod.default {
  /* protected */ def calculateMatrices2D(frameState: olLib.pluggableMapMod.FrameState): scala.Unit = js.native
  def dispatchRenderEvent(`type`: olLib.renderEventTypeMod.EventType, frameState: olLib.pluggableMapMod.FrameState): scala.Unit = js.native
  def forEachFeatureAtCoordinate[S, T, U](
    coordinate: olLib.coordinateMod.Coordinate,
    frameState: olLib.pluggableMapMod.FrameState,
    hitTolerance: scala.Double,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ olLib.featureMod.FeatureLike, 
      /* p1 */ olLib.layerLayerMod.default, 
      T
    ],
    thisArg: S,
    layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ olLib.layerLayerMod.default, scala.Boolean],
    thisArg2: U
  ): T = js.native
  def forEachLayerAtPixel[S, T, U](
    pixel: olLib.pixelMod.Pixel,
    frameState: olLib.pluggableMapMod.FrameState,
    hitTolerance: scala.Double,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p0 */ olLib.layerLayerMod.default, 
      /* p1 */ stdLib.Uint8ClampedArray | stdLib.Uint8Array, 
      T
    ],
    thisArg: S,
    layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ olLib.layerLayerMod.default, scala.Boolean],
    thisArg2: U
  ): T = js.native
  /* protected */ def getLayerRenderer(layer: olLib.layerBaseMod.default): olLib.rendererLayerMod.default = js.native
  /* protected */ def getLayerRendererByKey(layerKey: java.lang.String): olLib.rendererLayerMod.default = js.native
  /* protected */ def getLayerRenderers(): org.scalablytyped.runtime.StringDictionary[olLib.rendererLayerMod.default] = js.native
  def getMap(): olLib.pluggableMapMod.default = js.native
  def hasFeatureAtCoordinate[U](
    coordinate: olLib.coordinateMod.Coordinate,
    frameState: olLib.pluggableMapMod.FrameState,
    hitTolerance: scala.Double,
    layerFilter: js.ThisFunction1[/* this */ U, /* p0 */ olLib.layerLayerMod.default, scala.Boolean],
    thisArg: U
  ): scala.Boolean = js.native
  def registerLayerRenderers(constructors: js.Array[olLib.rendererLayerMod.default]): scala.Unit = js.native
  def removeLayerRenderers(): scala.Unit = js.native
  def renderFrame(frameState: olLib.pluggableMapMod.FrameState): scala.Unit = js.native
  /* protected */ def scheduleExpireIconCache(frameState: olLib.pluggableMapMod.FrameState): scala.Unit = js.native
  /* protected */ def scheduleRemoveUnusedLayerRenderers(frameState: olLib.pluggableMapMod.FrameState): scala.Unit = js.native
}

