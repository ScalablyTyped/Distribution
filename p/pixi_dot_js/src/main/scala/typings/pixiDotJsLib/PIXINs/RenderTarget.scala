package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.RenderTarget")
@js.native
class RenderTarget protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, scaleMode: scala.Double, resolution: scala.Double) = this()
  def this(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double, scaleMode: scala.Double, resolution: scala.Double, root: scala.Boolean) = this()
  var clearColor: js.Array[scala.Double] = js.native
  var defaultFrame: Rectangle = js.native
  var destinationFrame: Rectangle = js.native
  var filterData: pixiDotJsLib.Anon_Index = js.native
  var filterPoolKey: java.lang.String = js.native
  var frame: Rectangle = js.native
  var frameBuffer: pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var projectionMatrix: Matrix = js.native
  var resolution: scala.Double = js.native
  var root: scala.Boolean = js.native
  var scaleMode: scala.Double = js.native
  var size: Rectangle = js.native
  var sourceFrame: js.UndefOr[Rectangle] = js.native
  var stencilBuffer: pixiDotJsLib.PIXINs.glCoreNs.GLFramebuffer = js.native
  var stencilMaskStack: js.Array[Graphics] = js.native
  var texture: Texture = js.native
  var transform: Matrix = js.native
  def activate(): scala.Unit = js.native
  def attachStencilBuffer(): scala.Unit = js.native
  def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clear(clearColor: js.Array[scala.Double]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setFrame(destinationFrame: Rectangle, sourceFrame: Rectangle): scala.Unit = js.native
}

