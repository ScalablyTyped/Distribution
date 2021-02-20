package typings.ol

import typings.std.Uint8Array
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderTargetMod {
  
  @JSImport("ol/webgl/RenderTarget", JSImport.Default)
  @js.native
  class default protected () extends WebGLRenderTarget {
    def this(helper: typings.ol.helperMod.default) = this()
    def this(helper: typings.ol.helperMod.default, opt_size: js.Array[Double]) = this()
  }
  
  @js.native
  trait WebGLRenderTarget extends StObject {
    
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
    implicit class WebGLRenderTargetMutableBuilder[Self <: WebGLRenderTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearCachedData(value: () => Unit): Self = StObject.set(x, "clearCachedData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFramebuffer(value: () => WebGLFramebuffer): Self = StObject.set(x, "getFramebuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSize(value: () => js.Array[Double]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTexture(value: () => WebGLTexture): Self = StObject.set(x, "getTexture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadAll(value: () => Uint8Array): Self = StObject.set(x, "readAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadPixel(value: (Double, Double) => Uint8Array): Self = StObject.set(x, "readPixel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSize(value: js.Array[Double] => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    }
  }
}
