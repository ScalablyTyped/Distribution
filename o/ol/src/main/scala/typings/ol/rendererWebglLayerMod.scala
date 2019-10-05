package typings.ol

import typings.ol.layerLayerMod.State
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.rendererWebglLayerMod.WebGLLayerRenderer
import typings.ol.transformMod.Transform
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/webgl/Layer", JSImport.Namespace)
@js.native
object rendererWebglLayerMod extends js.Object {
  @js.native
  trait WebGLLayerRenderer
    extends typings.ol.rendererLayerMod.default {
    var framebuffer: WebGLFramebuffer = js.native
    var framebufferDimension: Double = js.native
    var mapRenderer: typings.ol.rendererWebglMapMod.default = js.native
    var projectionMatrix: Transform = js.native
    var texCoordMatrix: Transform = js.native
    var texture: WebGLTexture = js.native
    /* protected */ def bindFramebuffer(frameState: FrameState, framebufferDimension: Double): Unit = js.native
    def composeFrame(frameState: FrameState, layerState: State, context: typings.ol.webglContextMod.default): Unit = js.native
    def forEachLayerAtPixel[S, T, U](
      pixel: Pixel,
      frameState: FrameState,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typings.ol.layerLayerMod.default, 
          /* p1 */ Uint8ClampedArray | Uint8Array, 
          T
        ],
      thisArg: S
    ): js.UndefOr[T] = js.native
    def getProjectionMatrix(): Transform = js.native
    def getTexCoordMatrix(): Transform = js.native
    def getTexture(): WebGLTexture = js.native
    def handleWebGLContextLost(): Unit = js.native
    def prepareFrame(frameState: FrameState, layerState: State, context: typings.ol.webglContextMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends WebGLLayerRenderer {
    def this(mapRenderer: typings.ol.rendererWebglMapMod.default, layer: typings.ol.layerLayerMod.default) = this()
  }
  
}

