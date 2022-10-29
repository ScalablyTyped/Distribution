package typings.pixiAssets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersTexturesUtilsCheckExtensionMod {
  
  @JSImport("@pixi/assets/lib/loader/parsers/textures/utils/checkExtension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkExtension(url: String, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkExtension(url: String, `extension`: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkExtension")(url.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
