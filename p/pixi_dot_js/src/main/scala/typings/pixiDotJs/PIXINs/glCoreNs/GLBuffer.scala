package typings.pixiDotJs.PIXINs.glCoreNs

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.WebGLBuffer
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLBuffer")
@js.native
class GLBuffer protected () extends js.Object {
  def this(gl: WebGLRenderingContext, `type`: Double, data: js.Any, drawType: Double) = this()
  def this(gl: WebGLRenderingContext, `type`: Double, data: ArrayBufferView, drawType: Double) = this()
  def this(gl: WebGLRenderingContext, `type`: Double, data: ArrayBuffer, drawType: Double) = this()
  var _updateID: js.UndefOr[Double] = js.native
  var buffer: WebGLBuffer = js.native
  var data: ArrayBuffer | ArrayBufferView | js.Any = js.native
  var drawType: Double = js.native
  var gl: WebGLRenderingContext = js.native
  var `type`: Double = js.native
  def bind(): Unit = js.native
  def destroy(): Unit = js.native
  def upload(): Unit = js.native
  def upload(data: js.Any): Unit = js.native
  def upload(data: js.Any, offset: Double): Unit = js.native
  def upload(data: js.Any, offset: Double, dontBind: Boolean): Unit = js.native
  def upload(data: ArrayBuffer): Unit = js.native
  def upload(data: ArrayBufferView): Unit = js.native
  def upload(data: ArrayBufferView, offset: Double): Unit = js.native
  def upload(data: ArrayBufferView, offset: Double, dontBind: Boolean): Unit = js.native
  def upload(data: ArrayBuffer, offset: Double): Unit = js.native
  def upload(data: ArrayBuffer, offset: Double, dontBind: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.glCore.GLBuffer")
@js.native
object GLBuffer extends js.Object {
  def create(gl: WebGLRenderingContext, `type`: Double, data: js.Any, drawType: Double): GLBuffer = js.native
  def create(gl: WebGLRenderingContext, `type`: Double, data: ArrayBufferView, drawType: Double): GLBuffer = js.native
  def create(gl: WebGLRenderingContext, `type`: Double, data: ArrayBuffer, drawType: Double): GLBuffer = js.native
  def createIndexBuffer(gl: WebGLRenderingContext, data: js.Any, drawType: Double): GLBuffer = js.native
  def createIndexBuffer(gl: WebGLRenderingContext, data: ArrayBufferView, drawType: Double): GLBuffer = js.native
  def createIndexBuffer(gl: WebGLRenderingContext, data: ArrayBuffer, drawType: Double): GLBuffer = js.native
  def createVertexBuffer(gl: WebGLRenderingContext, data: js.Any, drawType: Double): GLBuffer = js.native
  def createVertexBuffer(gl: WebGLRenderingContext, data: ArrayBufferView, drawType: Double): GLBuffer = js.native
  def createVertexBuffer(gl: WebGLRenderingContext, data: ArrayBuffer, drawType: Double): GLBuffer = js.native
}

