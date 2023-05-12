package typings.miniCssExtractPlugin

import typings.miniCssExtractPlugin.miniCssExtractPluginInts.`-1`
import typings.miniCssExtractPlugin.miniCssExtractPluginInts.`0`
import typings.miniCssExtractPlugin.miniCssExtractPluginInts.`1`
import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.__mini_css_extract_plugin_public_path_auto__
import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.__mini_css_extract_plugin_single_dot_path_segment__
import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.`cssSlashmini-extract`
import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.`webpackColonSlashSlashSlashmini-css-extract-pluginSlash`
import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.webpackColonSlashSlash
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("mini-css-extract-plugin/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mini-css-extract-plugin/types/utils", "ABSOLUTE_PUBLIC_PATH")
  @js.native
  val ABSOLUTE_PUBLIC_PATH: `webpackColonSlashSlashSlashmini-css-extract-pluginSlash` = js.native
  
  @JSImport("mini-css-extract-plugin/types/utils", "AUTO_PUBLIC_PATH")
  @js.native
  val AUTO_PUBLIC_PATH: __mini_css_extract_plugin_public_path_auto__ = js.native
  
  @JSImport("mini-css-extract-plugin/types/utils", "BASE_URI")
  @js.native
  val BASE_URI: webpackColonSlashSlash = js.native
  
  @JSImport("mini-css-extract-plugin/types/utils", "MODULE_TYPE")
  @js.native
  val MODULE_TYPE: `cssSlashmini-extract` = js.native
  
  @JSImport("mini-css-extract-plugin/types/utils", "SINGLE_DOT_PATH_SEGMENT")
  @js.native
  val SINGLE_DOT_PATH_SEGMENT: __mini_css_extract_plugin_single_dot_path_segment__ = js.native
  
  inline def compareModulesByIdentifier(a: Module, b: Module): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareModulesByIdentifier")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
  
  inline def evalModuleCode(loaderContext: LoaderContext, code: String, filename: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("evalModuleCode")(loaderContext.asInstanceOf[js.Any], code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def evalModuleCode(loaderContext: LoaderContext, code: Buffer, filename: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("evalModuleCode")(loaderContext.asInstanceOf[js.Any], code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def findModuleById(compilation: Compilation, id: String): Null | Module = (^.asInstanceOf[js.Dynamic].applyDynamic("findModuleById")(compilation.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Null | Module]
  inline def findModuleById(compilation: Compilation, id: Double): Null | Module = (^.asInstanceOf[js.Dynamic].applyDynamic("findModuleById")(compilation.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Null | Module]
  
  inline def getUndoPath(filename: String, outputPath: String, enforceRelative: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUndoPath")(filename.asInstanceOf[js.Any], outputPath.asInstanceOf[js.Any], enforceRelative.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyLocal(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyLocal")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyLocal(value: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyLocal")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyRequest(loaderContext: LoaderContext, request: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRequest")(loaderContext.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def trueFn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("trueFn")().asInstanceOf[Boolean]
  
  type Compilation = typings.webpack.mod.Compilation
  
  type LoaderContext = typings.webpack.mod.LoaderContext[Any]
  
  type Module = typings.webpack.mod.Module
}
