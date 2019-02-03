package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.glCore.GLBuffer")
@js.native
class GLBuffer protected () extends js.Object {
  def this(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: js.Any, drawType: scala.Double) = this()
  def this(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: stdLib.ArrayBufferView, drawType: scala.Double) = this()
  def this(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: stdLib.ArrayBuffer, drawType: scala.Double) = this()
  var _updateID: js.UndefOr[scala.Double] = js.native
  var buffer: stdLib.WebGLBuffer = js.native
  var data: stdLib.ArrayBuffer | stdLib.ArrayBufferView | js.Any = js.native
  var drawType: scala.Double = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var `type`: scala.Double = js.native
  def bind(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def upload(): scala.Unit = js.native
  def upload(data: js.Any): scala.Unit = js.native
  def upload(data: js.Any, offset: scala.Double): scala.Unit = js.native
  def upload(data: js.Any, offset: scala.Double, dontBind: scala.Boolean): scala.Unit = js.native
  def upload(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def upload(data: stdLib.ArrayBufferView): scala.Unit = js.native
  def upload(data: stdLib.ArrayBufferView, offset: scala.Double): scala.Unit = js.native
  def upload(data: stdLib.ArrayBufferView, offset: scala.Double, dontBind: scala.Boolean): scala.Unit = js.native
  def upload(data: stdLib.ArrayBuffer, offset: scala.Double): scala.Unit = js.native
  def upload(data: stdLib.ArrayBuffer, offset: scala.Double, dontBind: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.glCore.GLBuffer")
@js.native
object GLBuffer extends js.Object {
  def create(gl: stdLib.WebGLRenderingContext, `type`: scala.Double, data: js.Any, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def create(
    gl: stdLib.WebGLRenderingContext,
    `type`: scala.Double,
    data: stdLib.ArrayBufferView,
    drawType: scala.Double
  ): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def create(
    gl: stdLib.WebGLRenderingContext,
    `type`: scala.Double,
    data: stdLib.ArrayBuffer,
    drawType: scala.Double
  ): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def createIndexBuffer(gl: stdLib.WebGLRenderingContext, data: js.Any, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def createIndexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBufferView, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def createIndexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBuffer, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def createVertexBuffer(gl: stdLib.WebGLRenderingContext, data: js.Any, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def createVertexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBufferView, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
  def createVertexBuffer(gl: stdLib.WebGLRenderingContext, data: stdLib.ArrayBuffer, drawType: scala.Double): pixiDotJsLib.PIXINs.glCoreNs.GLBuffer = js.native
}

