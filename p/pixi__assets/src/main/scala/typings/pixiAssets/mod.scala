package typings.pixiAssets

import typings.pixiAssets.libCacheCacheMod.CacheClass
import typings.pixiAssets.libCacheCacheParserMod.CacheParser
import typings.pixiAssets.libDetectionsMod.FormatDetectionParser
import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiAssets.libResolverTypesMod.ResolveURLParser
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.Texture
import typings.std.FontFace
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/assets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/assets", "Assets")
  @js.native
  val Assets: typings.pixiAssets.libAssetsMod.AssetsClass = js.native
  
  @JSImport("@pixi/assets", "AssetsClass")
  @js.native
  open class AssetsClass ()
    extends typings.pixiAssets.libAssetsMod.AssetsClass
  
  @JSImport("@pixi/assets", "Cache")
  @js.native
  val Cache: CacheClass = js.native
  
  @JSImport("@pixi/assets", "Loader")
  @js.native
  open class Loader ()
    extends typings.pixiAssets.libLoaderMod.Loader
  
  @JSImport("@pixi/assets", "LoaderParserPriority")
  @js.native
  object LoaderParserPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority & Double] = js.native
    
    /* 2 */ val High: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.High & Double = js.native
    
    /* 0 */ val Low: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.Low & Double = js.native
    
    /* 1 */ val Normal: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.Normal & Double = js.native
  }
  
  @JSImport("@pixi/assets", "Resolver")
  @js.native
  open class Resolver ()
    extends typings.pixiAssets.libResolverMod.Resolver
  
  @JSImport("@pixi/assets", "cacheTextureArray")
  @js.native
  val cacheTextureArray: CacheParser[js.Array[Texture[Resource]]] = js.native
  
  inline def checkExtension(url: String, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkExtension(url: String, `extension`: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def convertToList[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: T, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: String, transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def convertToList[T](input: js.Array[String | T], transform: js.Function1[/* input */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToList")(input.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def createStringVariations(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringVariations")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def createTexture(
    base: BaseTexture[Resource, IAutoDetectOptions],
    loader: typings.pixiAssets.libLoaderLoaderMod.Loader,
    url: String
  ): Texture[typings.pixiCore.mod.Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTexture")(base.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Texture[typings.pixiCore.mod.Resource]]
  
  @JSImport("@pixi/assets", "detectAvif")
  @js.native
  val detectAvif: FormatDetectionParser = js.native
  
  @JSImport("@pixi/assets", "detectDefaults")
  @js.native
  val detectDefaults: FormatDetectionParser = js.native
  
  @JSImport("@pixi/assets", "detectWebp")
  @js.native
  val detectWebp: FormatDetectionParser = js.native
  
  inline def getFontFamilyName(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontFamilyName")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isSingleItem(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def loadImageBitmap(url: String): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImageBitmap")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  
  @JSImport("@pixi/assets", "loadJson")
  @js.native
  val loadJson: LoaderParser[Any, Any] = js.native
  
  @JSImport("@pixi/assets", "loadSVG")
  @js.native
  val loadSVG: LoaderParser[String | Texture[typings.pixiCore.mod.Resource], IBaseTextureOptions[Any]] = js.native
  
  @JSImport("@pixi/assets", "loadTextures")
  @js.native
  val loadTextures: LoaderParser[Texture[typings.pixiCore.mod.Resource], IBaseTextureOptions[Any]] = js.native
  
  @JSImport("@pixi/assets", "loadTxt")
  @js.native
  val loadTxt: LoaderParser[Any, Any] = js.native
  
  @JSImport("@pixi/assets", "loadWebFont")
  @js.native
  val loadWebFont: LoaderParser[FontFace | js.Array[FontFace], Any] = js.native
  
  @JSImport("@pixi/assets", "resolveTextureUrl")
  @js.native
  val resolveTextureUrl: ResolveURLParser = js.native
}
