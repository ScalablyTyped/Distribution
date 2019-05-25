package typings
package olLib.rendererWebglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLLayerRenderer
  extends olLib.rendererLayerMod.default {
  var framebuffer: stdLib.WebGLFramebuffer = js.native
  var framebufferDimension: scala.Double = js.native
  var mapRenderer: olLib.rendererWebglMapMod.default = js.native
  var projectionMatrix: olLib.transformMod.Transform = js.native
  var texCoordMatrix: olLib.transformMod.Transform = js.native
  var texture: stdLib.WebGLTexture = js.native
  /* protected */ def bindFramebuffer(frameState: olLib.pluggableMapMod.FrameState, framebufferDimension: scala.Double): scala.Unit = js.native
  def composeFrame(
    frameState: olLib.pluggableMapMod.FrameState,
    layerState: olLib.layerLayerMod.State,
    context: olLib.webglContextMod.default
  ): scala.Unit = js.native
  def forEachLayerAtPixel[S, T, U](
    pixel: olLib.pixelMod.Pixel,
    frameState: olLib.pluggableMapMod.FrameState,
    callback: js.ThisFunction2[
      /* this */ S, 
      /* param1 */ olLib.layerLayerMod.default, 
      /* param2 */ stdLib.Uint8ClampedArray | stdLib.Uint8Array, 
      T
    ],
    thisArg: S
  ): T = js.native
  def getProjectionMatrix(): olLib.transformMod.Transform = js.native
  def getTexCoordMatrix(): olLib.transformMod.Transform = js.native
  def getTexture(): stdLib.WebGLTexture = js.native
  def handleWebGLContextLost(): scala.Unit = js.native
  def prepareFrame(
    frameState: olLib.pluggableMapMod.FrameState,
    layerState: olLib.layerLayerMod.State,
    context: olLib.webglContextMod.default
  ): scala.Boolean = js.native
}

