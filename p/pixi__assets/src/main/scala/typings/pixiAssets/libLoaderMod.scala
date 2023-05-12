package typings.pixiAssets

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiAssets.libLoaderParsersTexturesLoadTexturesMod.LoadTextureConfig
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.Texture
import typings.std.FontFace
import typings.std.ImageBitmap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderMod {
  
  @JSImport("@pixi/assets/lib/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/assets/lib/loader", "Loader")
  @js.native
  open class Loader ()
    extends typings.pixiAssets.libLoaderLoaderMod.Loader
  
  @JSImport("@pixi/assets/lib/loader", "LoaderParserPriority")
  @js.native
  object LoaderParserPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority & Double] = js.native
    
    /* 2 */ val High: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.High & Double = js.native
    
    /* 0 */ val Low: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.Low & Double = js.native
    
    /* 1 */ val Normal: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.Normal & Double = js.native
  }
  
  inline def createTexture(
    base: BaseTexture[Resource, IAutoDetectOptions],
    loader: typings.pixiAssets.libLoaderLoaderMod.Loader,
    url: String
  ): Texture[typings.pixiCore.mod.Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTexture")(base.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Texture[typings.pixiCore.mod.Resource]]
  
  inline def getFontFamilyName(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontFamilyName")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadImageBitmap(url: String): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImageBitmap")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  
  @JSImport("@pixi/assets/lib/loader", "loadJson")
  @js.native
  val loadJson: LoaderParser[Any, Any, Record[String, Any]] = js.native
  
  @JSImport("@pixi/assets/lib/loader", "loadSVG")
  @js.native
  val loadSVG: LoaderParser[
    String | Texture[typings.pixiCore.mod.Resource], 
    IBaseTextureOptions[Any], 
    Record[String, Any]
  ] = js.native
  
  @JSImport("@pixi/assets/lib/loader", "loadTextures")
  @js.native
  val loadTextures: LoaderParser[Texture[typings.pixiCore.mod.Resource], IBaseTextureOptions[Any], LoadTextureConfig] = js.native
  
  @JSImport("@pixi/assets/lib/loader", "loadTxt")
  @js.native
  val loadTxt: LoaderParser[Any, Any, Record[String, Any]] = js.native
  
  @JSImport("@pixi/assets/lib/loader", "loadWebFont")
  @js.native
  val loadWebFont: LoaderParser[FontFace | js.Array[FontFace], Any, Record[String, Any]] = js.native
}
