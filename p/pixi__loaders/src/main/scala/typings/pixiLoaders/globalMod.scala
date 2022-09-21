package typings.pixiLoaders

import typings.pixiCore.GlobalMixins.Texture
import typings.pixiLoaders.mod.Loader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object GlobalMixins {
    
    trait Application extends StObject {
      
      var loader: Loader
    }
    object Application {
      
      inline def apply(loader: Loader): Application = {
        val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any])
        __obj.asInstanceOf[Application]
      }
      
      extension [Self <: Application](x: Self) {
        
        inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      }
    }
    
    trait IApplicationOptions extends StObject {
      
      var sharedLoader: js.UndefOr[Boolean] = js.undefined
    }
    object IApplicationOptions {
      
      inline def apply(): IApplicationOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IApplicationOptions]
      }
      
      extension [Self <: IApplicationOptions](x: Self) {
        
        inline def setSharedLoader(value: Boolean): Self = StObject.set(x, "sharedLoader", value.asInstanceOf[js.Any])
        
        inline def setSharedLoaderUndefined: Self = StObject.set(x, "sharedLoader", js.undefined)
      }
    }
    
    /** @deprecated Use LoaderResource instead */
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    trait ILoaderResource extends StObject
    
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    trait IResourceMetadata extends StObject
    
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    trait LoaderResource extends StObject {
      
      /** Texture reference for loading images and other textures. */
      var texture: js.UndefOr[Texture] = js.undefined
    }
    object LoaderResource {
      
      inline def apply(): LoaderResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoaderResource]
      }
      
      extension [Self <: LoaderResource](x: Self) {
        
        inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
        
        inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
      }
    }
  }
}
