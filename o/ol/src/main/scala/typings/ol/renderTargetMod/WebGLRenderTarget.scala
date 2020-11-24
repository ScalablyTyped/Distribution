package typings.ol.renderTargetMod

import typings.std.Uint8Array
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLRenderTarget extends js.Object {
  
  /**
    * This will cause following calls to #readAll or #readPixel to download the content of the
    * render target into memory, which is an expensive operation.
    * This content will be kept in cache but should be cleared after each new render.
    */
  def clearCachedData(): Unit = js.native
  
  def getFramebuffer(): WebGLFramebuffer = js.native
  
  /**
    * Returns the size of the render target texture
    */
  def getSize(): js.Array[Double] = js.native
  
  def getTexture(): WebGLTexture = js.native
  
  /**
    * Returns the full content of the frame buffer as a series of r, g, b, a components
    * in the 0-255 range (unsigned byte).
    */
  def readAll(): Uint8Array = js.native
  
  /**
    * Reads one pixel of the frame buffer as an array of r, g, b, a components
    * in the 0-255 range (unsigned byte).
    * If x and/or y are outside of existing data, an array filled with 0 is returned.
    */
  def readPixel(x: Double, y: Double): Uint8Array = js.native
  
  /**
    * Changes the size of the render target texture. Note: will do nothing if the size
    * is already the same.
    */
  def setSize(size: js.Array[Double]): Unit = js.native
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
  
  @scala.inline
  implicit class WebGLRenderTargetOps[Self <: WebGLRenderTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearCachedData(value: () => Unit): Self = this.set("clearCachedData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFramebuffer(value: () => WebGLFramebuffer): Self = this.set("getFramebuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSize(value: () => js.Array[Double]): Self = this.set("getSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTexture(value: () => WebGLTexture): Self = this.set("getTexture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadAll(value: () => Uint8Array): Self = this.set("readAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadPixel(value: (Double, Double) => Uint8Array): Self = this.set("readPixel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSize(value: js.Array[Double] => Unit): Self = this.set("setSize", js.Any.fromFunction1(value))
  }
}
