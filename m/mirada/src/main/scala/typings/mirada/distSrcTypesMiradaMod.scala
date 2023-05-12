package typings.mirada

import typings.mirada.distSrcTypesOpencvMod.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMiradaMod {
  
  @js.native
  trait FormatCodec extends StObject {
    
    /**
      * Given an array buffer that contains the content of an encoded image it will return a decoded ImageData
      * object. The format parameter could be needed by some poor decoders that don't support file type sniffing.
      * For example, magica or jimp libraries don't need this.
      */
    def decode(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[ImageData]] = js.native
    def decode(buffer: js.typedarray.ArrayBuffer, format: String): js.Promise[js.UndefOr[ImageData]] = js.native
    
    /**
      * given an image data representing an unencoded raw image it will return an array buffer containing the
      * enconcoded image content in given format.
      */
    def encode(data: ImageData, format: String): js.Promise[js.UndefOr[js.typedarray.ArrayBuffer]] = js.native
    def encode(data: ImageData, format: String, quality: Double): js.Promise[js.UndefOr[js.typedarray.ArrayBuffer]] = js.native
    
    /**
      * if provided an error will be thrown in case users request to decode to a format not included in this
      * list.
      */
    var getSupportedDecodeFormats: js.UndefOr[js.Function0[js.Array[String]]] = js.native
    
    /**
      * if provided an error will be thrown in case users request to encode to a format not included in this
      * list.
      */
    var getSupportedEncodeFormats: js.UndefOr[js.Function0[js.Array[String]]] = js.native
  }
  
  type FormatProxy = FormatProxyClass | (js.Function0[FormatCodec | js.Promise[FormatCodec]])
  
  trait FormatProxyClass extends StObject {
    
    /**
      * This is probably called only once and after obtaining a codec the same instance is used by the manager.
      */
    def create(): js.Promise[FormatCodec]
  }
  object FormatProxyClass {
    
    inline def apply(create: () => js.Promise[FormatCodec]): FormatProxyClass = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
      __obj.asInstanceOf[FormatProxyClass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatProxyClass] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: () => js.Promise[FormatCodec]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    }
  }
  
  trait LoadOptions extends StObject {
    
    /**
      * (Node.js only): current working dir. By default is '.'.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * It will force the library loading - reloading it if it's already loaded
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Format proxies to be installed and loaded.
      */
    var formatProxies: js.UndefOr[js.Array[FormatProxy]] = js.undefined
    
    /**
      * Callback function to be called when library is ready to be used. (equivalent to promise resolve).
      */
    var onloadCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Loads opencv_exception.js instead of default opencv.js file which has better exception handling for
      * development at some cost on speed.
      */
    var opencvJsExceptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The location of opencv.js file to load. In the case of browser it can be a relative or absolute URL.
      */
    var opencvJsLocation: js.UndefOr[String] = js.undefined
  }
  object LoadOptions {
    
    inline def apply(): LoadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setFormatProxies(value: js.Array[FormatProxy]): Self = StObject.set(x, "formatProxies", value.asInstanceOf[js.Any])
      
      inline def setFormatProxiesUndefined: Self = StObject.set(x, "formatProxies", js.undefined)
      
      inline def setFormatProxiesVarargs(value: FormatProxy*): Self = StObject.set(x, "formatProxies", js.Array(value*))
      
      inline def setOnloadCallback(value: () => Unit): Self = StObject.set(x, "onloadCallback", js.Any.fromFunction0(value))
      
      inline def setOnloadCallbackUndefined: Self = StObject.set(x, "onloadCallback", js.undefined)
      
      inline def setOpencvJsExceptions(value: Boolean): Self = StObject.set(x, "opencvJsExceptions", value.asInstanceOf[js.Any])
      
      inline def setOpencvJsExceptionsUndefined: Self = StObject.set(x, "opencvJsExceptions", js.undefined)
      
      inline def setOpencvJsLocation(value: String): Self = StObject.set(x, "opencvJsLocation", value.asInstanceOf[js.Any])
      
      inline def setOpencvJsLocationUndefined: Self = StObject.set(x, "opencvJsLocation", js.undefined)
    }
  }
}
