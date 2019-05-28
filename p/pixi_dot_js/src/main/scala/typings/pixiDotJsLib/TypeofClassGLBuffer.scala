package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassGLBuffer
  extends org.scalablytyped.runtime.Instantiable4[
      /* gl */ stdLib.WebGLRenderingContext, 
      /* type */ scala.Double, 
      (/* data */ js.Any) | (/* data */ stdLib.ArrayBuffer) | (/* data */ stdLib.ArrayBufferView), 
      /* drawType */ scala.Double, 
      pixiDotJsLib.PIXINs.glCoreNs.GLBuffer
    ] {
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

