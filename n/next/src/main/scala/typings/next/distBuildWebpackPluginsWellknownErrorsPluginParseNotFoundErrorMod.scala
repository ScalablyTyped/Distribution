package typings.next

import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsWellknownErrorsPluginParseNotFoundErrorMod {
  
  @JSImport("next/dist/build/webpack/plugins/wellknown-errors-plugin/parseNotFoundError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNotFoundError(compilation: Compilation, input: Any, fileName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotFoundError")(compilation.asInstanceOf[js.Any], input.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
