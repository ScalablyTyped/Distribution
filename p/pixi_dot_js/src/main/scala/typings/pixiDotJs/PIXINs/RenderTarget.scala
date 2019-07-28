package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.Anon_Index
import typings.pixiDotJs.PIXINs.glCoreNs.GLFramebuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.RenderTarget")
@js.native
class RenderTarget protected () extends js.Object {
  def this(gl: WebGLRenderingContext, width: Double, height: Double, scaleMode: Double, resolution: Double) = this()
  def this(
    gl: WebGLRenderingContext,
    width: Double,
    height: Double,
    scaleMode: Double,
    resolution: Double,
    root: Boolean
  ) = this()
  var clearColor: js.Array[Double] = js.native
  var defaultFrame: Rectangle = js.native
  var destinationFrame: Rectangle = js.native
  var filterData: Anon_Index = js.native
  var filterPoolKey: String = js.native
  var frame: Rectangle = js.native
  var frameBuffer: GLFramebuffer = js.native
  var gl: WebGLRenderingContext = js.native
  var projectionMatrix: Matrix = js.native
  var resolution: Double = js.native
  var root: Boolean = js.native
  var scaleMode: Double = js.native
  var size: Rectangle = js.native
  var sourceFrame: js.UndefOr[Rectangle] = js.native
  var stencilBuffer: GLFramebuffer = js.native
  var stencilMaskStack: js.Array[Graphics] = js.native
  var texture: Texture = js.native
  var transform: Matrix = js.native
  def activate(): Unit = js.native
  def attachStencilBuffer(): Unit = js.native
  def calculateProjection(destinationFrame: Rectangle, sourceFrame: Rectangle): Unit = js.native
  def clear(): Unit = js.native
  def clear(clearColor: js.Array[Double]): Unit = js.native
  def destroy(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setFrame(destinationFrame: Rectangle, sourceFrame: Rectangle): Unit = js.native
}

