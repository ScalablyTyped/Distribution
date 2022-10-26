package typings.next

import typings.next.distBuildWebpackPluginsWellknownErrorsPluginSimpleWebpackErrorMod.SimpleWebpackError
import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsWellknownErrorsPluginParseNotFoundErrorMod {
  
  @JSImport("next/dist/build/webpack/plugins/wellknown-errors-plugin/parseNotFoundError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getImageError(compilation: Any, input: Any, err: js.Error): js.Promise[SimpleWebpackError | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageError")(compilation.asInstanceOf[js.Any], input.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SimpleWebpackError | `false`]]
  
  inline def getNotFoundError(compilation: Compilation, input: Any, fileName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotFoundError")(compilation.asInstanceOf[js.Any], input.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
