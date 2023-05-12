package typings.ol

import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglRenderTargetMod {
  
  /**
    * @classdesc
    * This class is a wrapper around the association of both a `WebGLTexture` and a `WebGLFramebuffer` instances,
    * simplifying initialization and binding for rendering.
    * @api
    */
  @JSImport("ol/webgl/RenderTarget", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WebGLRenderTarget {
    /**
      * @param {import("./Helper.js").default} helper WebGL helper; mandatory.
      * @param {Array<number>} [size] Expected size of the render target texture; note: this can be changed later on.
      */
    def this(helper: typings.ol.webglHelperMod.default) = this()
    def this(helper: typings.ol.webglHelperMod.default, size: js.Array[Double]) = this()
    
    /**
      * This will cause following calls to `#readAll` or `#readPixel` to download the content of the
      * render target into memory, which is an expensive operation.
      * This content will be kept in cache but should be cleared after each new render.
      * @api
      */
    /* CompleteClass */
    override def clearCachedData(): Unit = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ /* CompleteClass */
    var dataCacheDirty_ : Any = js.native
    
    /**
      * @type {Uint8Array}
      * @private
      */
    /* private */ /* CompleteClass */
    var data_ : Any = js.native
    
    /**
      * @private
      * @type {WebGLFramebuffer}
      */
    /* private */ /* CompleteClass */
    var framebuffer_ : Any = js.native
    
    /**
      * @return {WebGLFramebuffer} Frame buffer of the render target
      */
    /* CompleteClass */
    override def getFramebuffer(): WebGLFramebuffer = js.native
    
    /**
      * Returns the size of the render target texture
      * @return {Array<number>} Size of the render target texture
      * @api
      */
    /* CompleteClass */
    override def getSize(): js.Array[Double] = js.native
    
    /**
      * @return {WebGLTexture} Texture to render to
      */
    /* CompleteClass */
    override def getTexture(): WebGLTexture = js.native
    
    /**
      * @private
      * @type {import("./Helper.js").default}
      */
    /* private */ /* CompleteClass */
    var helper_ : Any = js.native
    
    /**
      * Returns the full content of the frame buffer as a series of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * @return {Uint8Array} Integer array of color values
      * @api
      */
    /* CompleteClass */
    override def readAll(): js.typedarray.Uint8Array = js.native
    
    /**
      * Reads one pixel of the frame buffer as an array of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * If x and/or y are outside of existing data, an array filled with 0 is returned.
      * @param {number} x Pixel coordinate
      * @param {number} y Pixel coordinate
      * @return {Uint8Array} Integer array with one color value (4 components)
      * @api
      */
    /* CompleteClass */
    override def readPixel(x: Double, y: Double): js.typedarray.Uint8Array = js.native
    
    /**
      * Changes the size of the render target texture. Note: will do nothing if the size
      * is already the same.
      * @param {Array<number>} size Expected size of the render target texture
      * @api
      */
    /* CompleteClass */
    override def setSize(size: js.Array[Double]): Unit = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ /* CompleteClass */
    var size_ : Any = js.native
    
    /**
      * @private
      * @type {WebGLTexture}
      */
    /* private */ /* CompleteClass */
    var texture_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    var updateSize_ : Any = js.native
  }
  
  /**
    * @classdesc
    * This class is a wrapper around the association of both a `WebGLTexture` and a `WebGLFramebuffer` instances,
    * simplifying initialization and binding for rendering.
    * @api
    */
  trait WebGLRenderTarget extends StObject {
    
    /**
      * This will cause following calls to `#readAll` or `#readPixel` to download the content of the
      * render target into memory, which is an expensive operation.
      * This content will be kept in cache but should be cleared after each new render.
      * @api
      */
    def clearCachedData(): Unit
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var dataCacheDirty_ : Any
    
    /**
      * @type {Uint8Array}
      * @private
      */
    /* private */ var data_ : Any
    
    /**
      * @private
      * @type {WebGLFramebuffer}
      */
    /* private */ var framebuffer_ : Any
    
    /**
      * @return {WebGLFramebuffer} Frame buffer of the render target
      */
    def getFramebuffer(): WebGLFramebuffer
    
    /**
      * Returns the size of the render target texture
      * @return {Array<number>} Size of the render target texture
      * @api
      */
    def getSize(): js.Array[Double]
    
    /**
      * @return {WebGLTexture} Texture to render to
      */
    def getTexture(): WebGLTexture
    
    /**
      * @private
      * @type {import("./Helper.js").default}
      */
    /* private */ var helper_ : Any
    
    /**
      * Returns the full content of the frame buffer as a series of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * @return {Uint8Array} Integer array of color values
      * @api
      */
    def readAll(): js.typedarray.Uint8Array
    
    /**
      * Reads one pixel of the frame buffer as an array of r, g, b, a components
      * in the 0-255 range (unsigned byte).
      * If x and/or y are outside of existing data, an array filled with 0 is returned.
      * @param {number} x Pixel coordinate
      * @param {number} y Pixel coordinate
      * @return {Uint8Array} Integer array with one color value (4 components)
      * @api
      */
    def readPixel(x: Double, y: Double): js.typedarray.Uint8Array
    
    /**
      * Changes the size of the render target texture. Note: will do nothing if the size
      * is already the same.
      * @param {Array<number>} size Expected size of the render target texture
      * @api
      */
    def setSize(size: js.Array[Double]): Unit
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var size_ : Any
    
    /**
      * @private
      * @type {WebGLTexture}
      */
    /* private */ var texture_ : Any
    
    /**
      * @private
      */
    /* private */ var updateSize_ : Any
  }
  object WebGLRenderTarget {
    
    inline def apply(
      clearCachedData: () => Unit,
      dataCacheDirty_ : Any,
      data_ : Any,
      framebuffer_ : Any,
      getFramebuffer: () => WebGLFramebuffer,
      getSize: () => js.Array[Double],
      getTexture: () => WebGLTexture,
      helper_ : Any,
      readAll: () => js.typedarray.Uint8Array,
      readPixel: (Double, Double) => js.typedarray.Uint8Array,
      setSize: js.Array[Double] => Unit,
      size_ : Any,
      texture_ : Any,
      updateSize_ : Any
    ): WebGLRenderTarget = {
      val __obj = js.Dynamic.literal(clearCachedData = js.Any.fromFunction0(clearCachedData), dataCacheDirty_ = dataCacheDirty_.asInstanceOf[js.Any], data_ = data_.asInstanceOf[js.Any], framebuffer_ = framebuffer_.asInstanceOf[js.Any], getFramebuffer = js.Any.fromFunction0(getFramebuffer), getSize = js.Any.fromFunction0(getSize), getTexture = js.Any.fromFunction0(getTexture), helper_ = helper_.asInstanceOf[js.Any], readAll = js.Any.fromFunction0(readAll), readPixel = js.Any.fromFunction2(readPixel), setSize = js.Any.fromFunction1(setSize), size_ = size_.asInstanceOf[js.Any], texture_ = texture_.asInstanceOf[js.Any], updateSize_ = updateSize_.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLRenderTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebGLRenderTarget] (val x: Self) extends AnyVal {
      
      inline def setClearCachedData(value: () => Unit): Self = StObject.set(x, "clearCachedData", js.Any.fromFunction0(value))
      
      inline def setDataCacheDirty_(value: Any): Self = StObject.set(x, "dataCacheDirty_", value.asInstanceOf[js.Any])
      
      inline def setData_(value: Any): Self = StObject.set(x, "data_", value.asInstanceOf[js.Any])
      
      inline def setFramebuffer_(value: Any): Self = StObject.set(x, "framebuffer_", value.asInstanceOf[js.Any])
      
      inline def setGetFramebuffer(value: () => WebGLFramebuffer): Self = StObject.set(x, "getFramebuffer", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => js.Array[Double]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetTexture(value: () => WebGLTexture): Self = StObject.set(x, "getTexture", js.Any.fromFunction0(value))
      
      inline def setHelper_(value: Any): Self = StObject.set(x, "helper_", value.asInstanceOf[js.Any])
      
      inline def setReadAll(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "readAll", js.Any.fromFunction0(value))
      
      inline def setReadPixel(value: (Double, Double) => js.typedarray.Uint8Array): Self = StObject.set(x, "readPixel", js.Any.fromFunction2(value))
      
      inline def setSetSize(value: js.Array[Double] => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
      
      inline def setSize_(value: Any): Self = StObject.set(x, "size_", value.asInstanceOf[js.Any])
      
      inline def setTexture_(value: Any): Self = StObject.set(x, "texture_", value.asInstanceOf[js.Any])
      
      inline def setUpdateSize_(value: Any): Self = StObject.set(x, "updateSize_", value.asInstanceOf[js.Any])
    }
  }
}
