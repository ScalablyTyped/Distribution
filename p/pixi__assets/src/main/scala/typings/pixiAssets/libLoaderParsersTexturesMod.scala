package typings.pixiAssets

import typings.pixiAssets.libLoaderLoaderMod.Loader
import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.Texture
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersTexturesMod {
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkExtension(url: String, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkExtension(url: String, `extension`: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createTexture(base: BaseTexture[Resource, IAutoDetectOptions], loader: Loader, url: String): Texture[typings.pixiCore.mod.Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTexture")(base.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Texture[typings.pixiCore.mod.Resource]]
  
  inline def loadImageBitmap(url: String): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImageBitmap")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures", "loadSVG")
  @js.native
  val loadSVG: LoaderParser[String | Texture[typings.pixiCore.mod.Resource], IBaseTextureOptions[Any]] = js.native
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures", "loadTextures")
  @js.native
  val loadTextures: LoaderParser[Texture[typings.pixiCore.mod.Resource], IBaseTextureOptions[Any]] = js.native
}
