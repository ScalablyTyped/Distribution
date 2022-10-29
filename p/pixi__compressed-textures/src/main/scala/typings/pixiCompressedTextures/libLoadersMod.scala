package typings.pixiCompressedTextures

import typings.pixiAssets.libDetectionsMod.FormatDetectionParser
import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiAssets.libResolverTypesMod.ResolveURLParser
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoadersMod {
  
  @JSImport("@pixi/compressed-textures/lib/loaders", "detectCompressedTextures")
  @js.native
  val detectCompressedTextures: FormatDetectionParser = js.native
  
  @JSImport("@pixi/compressed-textures/lib/loaders", "loadDDS")
  @js.native
  val loadDDS: LoaderParser[Any, Any] = js.native
  
  @JSImport("@pixi/compressed-textures/lib/loaders", "loadKTX")
  @js.native
  val loadKTX: LoaderParser[Texture[Resource] | js.Array[Texture[Resource]], IBaseTextureOptions[Any]] = js.native
  
  @JSImport("@pixi/compressed-textures/lib/loaders", "resolveCompressedTextureUrl")
  @js.native
  val resolveCompressedTextureUrl: ResolveURLParser = js.native
}
