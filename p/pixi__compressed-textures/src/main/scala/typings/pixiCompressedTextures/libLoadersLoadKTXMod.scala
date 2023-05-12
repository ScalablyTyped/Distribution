package typings.pixiCompressedTextures

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoadersLoadKTXMod {
  
  @JSImport("@pixi/compressed-textures/lib/loaders/loadKTX", "loadKTX")
  @js.native
  val loadKTX: LoaderParser[
    Texture[Resource] | js.Array[Texture[Resource]], 
    IBaseTextureOptions[Any], 
    Record[String, Any]
  ] = js.native
}
