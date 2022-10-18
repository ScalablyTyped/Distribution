package typings.next

import typings.postcss.mod.AcceptedPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackConfigBlocksCssPluginsMod {
  
  @JSImport("next/dist/build/webpack/config/blocks/css/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPostCssPlugins(dir: String): js.Promise[js.Array[AcceptedPlugin]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPostCssPlugins")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AcceptedPlugin]]]
  inline def getPostCssPlugins(dir: String, supportedBrowsers: js.Array[String]): js.Promise[js.Array[AcceptedPlugin]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPostCssPlugins")(dir.asInstanceOf[js.Any], supportedBrowsers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AcceptedPlugin]]]
  inline def getPostCssPlugins(dir: String, supportedBrowsers: js.Array[String], disablePostcssPresetEnv: Boolean): js.Promise[js.Array[AcceptedPlugin]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPostCssPlugins")(dir.asInstanceOf[js.Any], supportedBrowsers.asInstanceOf[js.Any], disablePostcssPresetEnv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AcceptedPlugin]]]
  inline def getPostCssPlugins(dir: String, supportedBrowsers: Unit, disablePostcssPresetEnv: Boolean): js.Promise[js.Array[AcceptedPlugin]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPostCssPlugins")(dir.asInstanceOf[js.Any], supportedBrowsers.asInstanceOf[js.Any], disablePostcssPresetEnv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AcceptedPlugin]]]
}
