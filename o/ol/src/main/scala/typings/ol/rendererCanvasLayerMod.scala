package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.layerLayerMod.State
import typings.ol.pluggableMapMod.FrameState
import typings.ol.rendererCanvasLayerMod.CanvasLayerRenderer
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/Layer", JSImport.Namespace)
@js.native
object rendererCanvasLayerMod extends js.Object {
  @js.native
  trait CanvasLayerRenderer
    extends typings.ol.rendererLayerMod.default {
    var renderedResolution: Double = js.native
    /* protected */ def clip(context: CanvasRenderingContext2D, frameState: FrameState, extent: Extent): Unit = js.native
    def composeFrame(frameState: FrameState, layerState: State, context: CanvasRenderingContext2D): Unit = js.native
    /* protected */ def dispatchRenderEvent(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    /* protected */ def dispatchRenderEvent(context: CanvasRenderingContext2D, frameState: FrameState, opt_transform: Transform): Unit = js.native
    def forEachLayerAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typings.ol.layerLayerMod.default, 
          /* p1 */ Uint8ClampedArray | Uint8Array, 
          T
        ],
      thisArg: S
    ): js.UndefOr[T] = js.native
    /* protected */ def getTransform(frameState: FrameState, offsetX: Double): Transform = js.native
    /* protected */ def postCompose(context: CanvasRenderingContext2D, frameState: FrameState, layerState: State): Unit = js.native
    /* protected */ def postCompose(
      context: CanvasRenderingContext2D,
      frameState: FrameState,
      layerState: State,
      opt_transform: Transform
    ): Unit = js.native
    /* protected */ def preCompose(context: CanvasRenderingContext2D, frameState: FrameState): Unit = js.native
    /* protected */ def preCompose(context: CanvasRenderingContext2D, frameState: FrameState, opt_transform: Transform): Unit = js.native
    def prepareFrame(frameState: FrameState, layerState: State): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasLayerRenderer {
    def this(layer: typings.ol.layerLayerMod.default) = this()
  }
  
}

