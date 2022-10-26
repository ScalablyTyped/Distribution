package typings.next

import typings.next.distBuildWebpackPluginsWellknownErrorsPluginSimpleWebpackErrorMod.SimpleWebpackError
import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsWellknownErrorsPluginParseRSCMod {
  
  @JSImport("next/dist/build/webpack/plugins/wellknown-errors-plugin/parseRSC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatRSCErrorMessage(message: String): Null | (js.Tuple2[String, String]) = ^.asInstanceOf[js.Dynamic].applyDynamic("formatRSCErrorMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Null | (js.Tuple2[String, String])]
  
  inline def getRscError(fileName: String, err: js.Error, module: Any, compilation: Compilation, compiler: Compiler): SimpleWebpackError | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("getRscError")(fileName.asInstanceOf[js.Any], err.asInstanceOf[js.Any], module.asInstanceOf[js.Any], compilation.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any])).asInstanceOf[SimpleWebpackError | `false`]
}
