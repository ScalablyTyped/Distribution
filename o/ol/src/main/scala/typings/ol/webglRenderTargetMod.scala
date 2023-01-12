package typings.ol

import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglRenderTargetMod {
  
  @JSImport("ol/webgl/RenderTarget", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WebGLRenderTarget {
    def this(helper: typings.ol.webglHelperMod.default) = this()
    def this(helper: typings.ol.webglHelperMod.default, opt_size: js.Array[Double]) = this()
    
    /**
      * This will cause following calls to #readAll or #readPixel to download the content of the
      * render target into memory, which is an expensive operation.
      * This content will be kept in cache but should be cleared after each new render.
      */
    /* CompleteClass */
    override def clearCachedData(): Unit = js.native
    
    /* CompleteClass */
    override def getFramebuffer(): WebGLFramebuffer = js.native
    
    /**
      * Returns the size of the render target texture
      */
    /* CompleteClass */
    override def getSize(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getTexture(): WebGLTexture = js.native
    
    /**
      * Returns the full content of the frame buffer as a series of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      */
    /* CompleteClass */
    override def readAll(): js.typedarray.Uint8Array = js.native
    
    /**
      * Reads one pixel of the frame buffer as an array of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * If x and/or y are outside of existing data, an array filled with 0 is returned.
      */
    /* CompleteClass */
    override def readPixel(x: Double, y: Double): js.typedarray.Uint8Array = js.native
    
    /**
      * Changes the size of the render target texture. Note: will do nothing if the size
      * is already the same.
      */
    /* CompleteClass */
    override def setSize(size: js.Array[Double]): Unit = js.native
  }
  
  trait WebGLRenderTarget extends StObject {
    
    /**
      * This will cause following calls to #readAll or #readPixel to download the content of the
      * render target into memory, which is an expensive operation.
      * This content will be kept in cache but should be cleared after each new render.
      */
    def clearCachedData(): Unit
    
    def getFramebuffer(): WebGLFramebuffer
    
    /**
      * Returns the size of the render target texture
      */
    def getSize(): js.Array[Double]
    
    def getTexture(): WebGLTexture
    
    /**
      * Returns the full content of the frame buffer as a series of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      */
    def readAll(): js.typedarray.Uint8Array
    
    /**
      * Reads one pixel of the frame buffer as an array of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * If x and/or y are outside of existing data, an array filled with 0 is returned.
      */
    def readPixel(x: Double, y: Double): js.typedarray.Uint8Array
    
    /**
      * Changes the size of the render target texture. Note: will do nothing if the size
      * is already the same.
      */
    def setSize(size: js.Array[Double]): Unit
  }
  object WebGLRenderTarget {
    
    inline def apply(
      clearCachedData: () => Unit,
      getFramebuffer: () => WebGLFramebuffer,
      getSize: () => js.Array[Double],
      getTexture: () => WebGLTexture,
      readAll: () => js.typedarray.Uint8Array,
      readPixel: (Double, Double) => js.typedarray.Uint8Array,
      setSize: js.Array[Double] => Unit
    ): WebGLRenderTarget = {
      val __obj = js.Dynamic.literal(clearCachedData = js.Any.fromFunction0(clearCachedData), getFramebuffer = js.Any.fromFunction0(getFramebuffer), getSize = js.Any.fromFunction0(getSize), getTexture = js.Any.fromFunction0(getTexture), readAll = js.Any.fromFunction0(readAll), readPixel = js.Any.fromFunction2(readPixel), setSize = js.Any.fromFunction1(setSize))
      __obj.asInstanceOf[WebGLRenderTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebGLRenderTarget] (val x: Self) extends AnyVal {
      
      inline def setClearCachedData(value: () => Unit): Self = StObject.set(x, "clearCachedData", js.Any.fromFunction0(value))
      
      inline def setGetFramebuffer(value: () => WebGLFramebuffer): Self = StObject.set(x, "getFramebuffer", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => js.Array[Double]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetTexture(value: () => WebGLTexture): Self = StObject.set(x, "getTexture", js.Any.fromFunction0(value))
      
      inline def setReadAll(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "readAll", js.Any.fromFunction0(value))
      
      inline def setReadPixel(value: (Double, Double) => js.typedarray.Uint8Array): Self = StObject.set(x, "readPixel", js.Any.fromFunction2(value))
      
      inline def setSetSize(value: js.Array[Double] => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    }
  }
}
