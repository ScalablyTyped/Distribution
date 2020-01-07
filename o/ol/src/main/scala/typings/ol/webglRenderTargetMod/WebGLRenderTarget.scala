package typings.ol.webglRenderTargetMod

import typings.std.Uint8Array
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderTarget extends js.Object {
  def clearCachedData(): Unit
  def getFramebuffer(): WebGLFramebuffer
  def getSize(): js.Array[Double]
  def getTexture(): WebGLTexture
  def readAll(): Uint8Array
  def readPixel(x: Double, y: Double): Uint8Array
  def setSize(size: js.Array[Double]): Unit
}

object WebGLRenderTarget {
  @scala.inline
  def apply(
    clearCachedData: () => Unit,
    getFramebuffer: () => WebGLFramebuffer,
    getSize: () => js.Array[Double],
    getTexture: () => WebGLTexture,
    readAll: () => Uint8Array,
    readPixel: (Double, Double) => Uint8Array,
    setSize: js.Array[Double] => Unit
  ): WebGLRenderTarget = {
    val __obj = js.Dynamic.literal(clearCachedData = js.Any.fromFunction0(clearCachedData), getFramebuffer = js.Any.fromFunction0(getFramebuffer), getSize = js.Any.fromFunction0(getSize), getTexture = js.Any.fromFunction0(getTexture), readAll = js.Any.fromFunction0(readAll), readPixel = js.Any.fromFunction2(readPixel), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[WebGLRenderTarget]
  }
}

