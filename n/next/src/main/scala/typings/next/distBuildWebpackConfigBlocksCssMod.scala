package typings.next

import typings.lodash.mod.CurriedFunction2
import typings.next.distBuildWebpackConfigUtilsMod.ConfigurationContext
import typings.next.distCompiledWebpackWebpackMod.webpack.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackConfigBlocksCssMod {
  
  @JSImport("next/dist/build/webpack/config/blocks/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/build/webpack/config/blocks/css", "css")
  @js.native
  val css: CurriedFunction2[ConfigurationContext, Configuration, js.Promise[Configuration]] = js.native
  
  inline def lazyPostCSS(rootDirectory: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazyPostCSS")(rootDirectory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def lazyPostCSS(rootDirectory: String, supportedBrowsers: js.Array[String]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyPostCSS")(rootDirectory.asInstanceOf[js.Any], supportedBrowsers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def lazyPostCSS(rootDirectory: String, supportedBrowsers: js.Array[String], disablePostcssPresetEnv: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyPostCSS")(rootDirectory.asInstanceOf[js.Any], supportedBrowsers.asInstanceOf[js.Any], disablePostcssPresetEnv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def lazyPostCSS(rootDirectory: String, supportedBrowsers: Unit, disablePostcssPresetEnv: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyPostCSS")(rootDirectory.asInstanceOf[js.Any], supportedBrowsers.asInstanceOf[js.Any], disablePostcssPresetEnv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSImport("next/dist/build/webpack/config/blocks/css", "regexLikeCss")
  @js.native
  val regexLikeCss: js.RegExp = js.native
}
