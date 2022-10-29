package typings.pixiAssets

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersTexturesLoadTextureMod {
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures/loadTexture", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadImageBitmap(url: String): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadImageBitmap")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures/loadTexture", "loadTextures")
  @js.native
  val loadTextures: LoaderParser[Texture[Resource], IBaseTextureOptions[Any]] = js.native
}
