package typings.pixiSpineLoaderBase

import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiLoaders.mod.LoaderResource
import typings.pixiSpineBase.mod.ISkeletonParser
import typings.pixiSpineBase.mod.TextureAtlas
import typings.pixiSpineLoaderBase.anon.Use
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi-spine/loader-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi-spine/loader-base", "AbstractSpineParser")
  @js.native
  abstract class AbstractSpineParser () extends StObject {
    
    def createBinaryParser(): ISkeletonParser = js.native
    
    def createJsonParser(): ISkeletonParser = js.native
    
    def genMiddleware(): Use = js.native
    
    def parseData(resource: LoaderResource, parser: ISkeletonParser, atlas: TextureAtlas, dataToParse: Any): Unit = js.native
  }
  
  inline def imageLoaderAdapter(loader: Any, namePrefix: Any, baseUrl: Any, imageOptions: Any): js.Function2[
    /* line */ String, 
    /* callback */ js.Function1[/* baseTexture */ BaseTexture[Resource, IAutoDetectOptions], Any], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageLoaderAdapter")(loader.asInstanceOf[js.Any], namePrefix.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], imageOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* line */ String, 
    /* callback */ js.Function1[/* baseTexture */ BaseTexture[Resource, IAutoDetectOptions], Any], 
    Unit
  ]]
  
  inline def staticImageLoader(pages: StringDictionary[(BaseTexture[Resource, IAutoDetectOptions]) | Texture[Resource]]): js.Function2[/* line */ Any, /* callback */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("staticImageLoader")(pages.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* line */ Any, /* callback */ Any, Unit]]
  
  inline def syncImageLoaderAdapter(baseUrl: Any, crossOrigin: Any): js.Function2[/* line */ Any, /* callback */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncImageLoaderAdapter")(baseUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* line */ Any, /* callback */ Any, Unit]]
}
