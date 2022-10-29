package typings.pixiAssets

import typings.pixiAssets.libResolverTypesMod.ResolveURLParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolverMod {
  
  @JSImport("@pixi/assets/lib/resolver", "Resolver")
  @js.native
  open class Resolver ()
    extends typings.pixiAssets.libResolverResolverMod.Resolver
  
  @JSImport("@pixi/assets/lib/resolver", "resolveTextureUrl")
  @js.native
  val resolveTextureUrl: ResolveURLParser = js.native
}
