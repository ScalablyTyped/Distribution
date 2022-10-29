package typings.pixiAssets

import typings.pixiAssets.libCacheCacheMod.CacheClass
import typings.pixiAssets.libCacheCacheParserMod.CacheParser
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCacheMod {
  
  @JSImport("@pixi/assets/lib/cache", "Cache")
  @js.native
  val Cache: CacheClass = js.native
  
  @JSImport("@pixi/assets/lib/cache", "cacheTextureArray")
  @js.native
  val cacheTextureArray: CacheParser[js.Array[Texture[Resource]]] = js.native
}
