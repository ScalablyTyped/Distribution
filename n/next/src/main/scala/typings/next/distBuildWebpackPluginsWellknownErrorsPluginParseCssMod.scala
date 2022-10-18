package typings.next

import typings.next.distBuildWebpackPluginsWellknownErrorsPluginSimpleWebpackErrorMod.SimpleWebpackError
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsWellknownErrorsPluginParseCssMod {
  
  @JSImport("next/dist/build/webpack/plugins/wellknown-errors-plugin/parseCss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCssError(fileName: String, err: js.Error): SimpleWebpackError | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("getCssError")(fileName.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[SimpleWebpackError | `false`]
}
