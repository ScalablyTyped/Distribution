package typings
package olLib.rendererCanvasLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasLayerRenderer
  extends olLib.rendererLayerMod.default {
  var renderedResolution: scala.Double = js.native
  /* protected */ def clip(
    context: stdLib.CanvasRenderingContext2D,
    frameState: olLib.pluggableMapMod.FrameState,
    extent: olLib.extentMod.Extent
  ): scala.Unit = js.native
  def composeFrame(
    frameState: olLib.pluggableMapMod.FrameState,
    layerState: olLib.layerLayerMod.State,
    context: stdLib.CanvasRenderingContext2D
  ): scala.Unit = js.native
  /* protected */ def dispatchRenderEvent(context: stdLib.CanvasRenderingContext2D, frameState: olLib.pluggableMapMod.FrameState): scala.Unit = js.native
  /* protected */ def dispatchRenderEvent(
    context: stdLib.CanvasRenderingContext2D,
    frameState: olLib.pluggableMapMod.FrameState,
    opt_transform: olLib.transformMod.Transform
  ): scala.Unit = js.native
  def forEachLayerAtCoordinate[S, T, U](
    coordinate: olLib.coordinateMod.Coordinate,
    frameState: olLib.pluggableMapMod.FrameState,
    hitTolerance: scala.Double,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* p1 */ olLib.layerLayerMod.default, 
      /* p2 */ stdLib.Uint8ClampedArray | stdLib.Uint8Array, 
      T
    ],
    thisArg: S
  ): T = js.native
  /* protected */ def getTransform(frameState: olLib.pluggableMapMod.FrameState, offsetX: scala.Double): olLib.transformMod.Transform = js.native
  /* protected */ def postCompose(
    context: stdLib.CanvasRenderingContext2D,
    frameState: olLib.pluggableMapMod.FrameState,
    layerState: olLib.layerLayerMod.State
  ): scala.Unit = js.native
  /* protected */ def postCompose(
    context: stdLib.CanvasRenderingContext2D,
    frameState: olLib.pluggableMapMod.FrameState,
    layerState: olLib.layerLayerMod.State,
    opt_transform: olLib.transformMod.Transform
  ): scala.Unit = js.native
  /* protected */ def preCompose(context: stdLib.CanvasRenderingContext2D, frameState: olLib.pluggableMapMod.FrameState): scala.Unit = js.native
  /* protected */ def preCompose(
    context: stdLib.CanvasRenderingContext2D,
    frameState: olLib.pluggableMapMod.FrameState,
    opt_transform: olLib.transformMod.Transform
  ): scala.Unit = js.native
  def prepareFrame(frameState: olLib.pluggableMapMod.FrameState, layerState: olLib.layerLayerMod.State): scala.Boolean = js.native
}

