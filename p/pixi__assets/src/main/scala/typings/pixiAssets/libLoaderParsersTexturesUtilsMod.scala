package typings.pixiAssets

import typings.pixiAssets.libLoaderLoaderMod.Loader
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersTexturesUtilsMod {
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkExtension(url: String, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkExtension(url: String, `extension`: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createTexture(base: BaseTexture[Resource, IAutoDetectOptions], loader: Loader, url: String): Texture[typings.pixiCore.mod.Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTexture")(base.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Texture[typings.pixiCore.mod.Resource]]
}
