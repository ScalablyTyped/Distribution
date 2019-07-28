package typings.pixiDotJs

import org.scalablytyped.runtime.Instantiable4
import typings.pixiDotJs.PIXINs.glCoreNs.GLBuffer
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassGLBuffer
  extends Instantiable4[
      /* gl */ WebGLRenderingContext, 
      /* type */ Double, 
      (/* data */ js.Any) | (/* data */ ArrayBuffer) | (/* data */ ArrayBufferView), 
      /* drawType */ Double, 
      GLBuffer
    ] {
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

