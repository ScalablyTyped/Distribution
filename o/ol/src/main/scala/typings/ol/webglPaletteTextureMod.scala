package typings.ol

import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglPaletteTextureMod {
  
  /**
    * @module ol/webgl/PaletteTexture
    */
  @JSImport("ol/webgl/PaletteTexture", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PaletteTexture {
    /**
      * @param {string} name The name of the texture.
      * @param {Uint8Array} data The texture data.
      */
    def this(name: String, data: js.typedarray.Uint8Array) = this()
    
    /* CompleteClass */
    var data: js.typedarray.Uint8Array = js.native
    
    /**
      * @param {WebGLRenderingContext} gl Rendering context.
      * @return {WebGLTexture} The texture.
      */
    /* CompleteClass */
    override def getTexture(gl: WebGLRenderingContext): WebGLTexture = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @type {WebGLTexture}
      * @private
      */
    /* private */ /* CompleteClass */
    var texture_ : Any = js.native
  }
  
  /**
    * @module ol/webgl/PaletteTexture
    */
  trait PaletteTexture extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    /**
      * @param {WebGLRenderingContext} gl Rendering context.
      * @return {WebGLTexture} The texture.
      */
    def getTexture(gl: WebGLRenderingContext): WebGLTexture
    
    var name: String
    
    /**
      * @type {WebGLTexture}
      * @private
      */
    /* private */ var texture_ : Any
  }
  object PaletteTexture {
    
    inline def apply(
      data: js.typedarray.Uint8Array,
      getTexture: WebGLRenderingContext => WebGLTexture,
      name: String,
      texture_ : Any
    ): PaletteTexture = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getTexture = js.Any.fromFunction1(getTexture), name = name.asInstanceOf[js.Any], texture_ = texture_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteTexture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteTexture] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGetTexture(value: WebGLRenderingContext => WebGLTexture): Self = StObject.set(x, "getTexture", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTexture_(value: Any): Self = StObject.set(x, "texture_", value.asInstanceOf[js.Any])
    }
  }
}
