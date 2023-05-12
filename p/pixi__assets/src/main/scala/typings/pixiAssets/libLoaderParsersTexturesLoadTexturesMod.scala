package typings.pixiAssets

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersTexturesLoadTexturesMod {
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures/loadTextures", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadImageBitmap(url: String): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImageBitmap")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures/loadTextures", "loadTextures")
  @js.native
  val loadTextures: LoaderParser[Texture[Resource], IBaseTextureOptions[Any], LoadTextureConfig] = js.native
  
  trait LoadTextureConfig extends StObject {
    
    /**
      * The crossOrigin value to use for images when `preferCreateImageBitmap` is `false`.
      * @default 'anonymous'
      */
    var crossOrigin: String | Null
    
    /**
      * When set to `true`, loading and decoding images will happen with `createImageBitmap`,
      * otherwise it will use `new Image()`.
      * @default true
      */
    var preferCreateImageBitmap: Boolean
    
    /**
      * When set to `true`, loading and decoding images will happen with Worker thread,
      * if available on the browser. This is much more performant as network requests
      * and decoding can be expensive on the CPU. However, not all environments support
      * Workers, in some cases it can be helpful to disable by setting to `false`.
      * @default true
      */
    var preferWorkers: Boolean
  }
  object LoadTextureConfig {
    
    inline def apply(preferCreateImageBitmap: Boolean, preferWorkers: Boolean): LoadTextureConfig = {
      val __obj = js.Dynamic.literal(preferCreateImageBitmap = preferCreateImageBitmap.asInstanceOf[js.Any], preferWorkers = preferWorkers.asInstanceOf[js.Any], crossOrigin = null)
      __obj.asInstanceOf[LoadTextureConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadTextureConfig] (val x: Self) extends AnyVal {
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setPreferCreateImageBitmap(value: Boolean): Self = StObject.set(x, "preferCreateImageBitmap", value.asInstanceOf[js.Any])
      
      inline def setPreferWorkers(value: Boolean): Self = StObject.set(x, "preferWorkers", value.asInstanceOf[js.Any])
    }
  }
}
