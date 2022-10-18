package typings.next

import typings.next.distBuildWebpackPluginsWellknownErrorsPluginSimpleWebpackErrorMod.SimpleWebpackError
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsWellknownErrorsPluginParseScssMod {
  
  @JSImport("next/dist/build/webpack/plugins/wellknown-errors-plugin/parseScss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScssError(fileName: String, fileContent: String, err: js.Error): SimpleWebpackError | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("getScssError")(fileName.asInstanceOf[js.Any], fileContent.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[SimpleWebpackError | `false`]
  inline def getScssError(fileName: String, fileContent: Null, err: js.Error): SimpleWebpackError | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("getScssError")(fileName.asInstanceOf[js.Any], fileContent.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[SimpleWebpackError | `false`]
}
