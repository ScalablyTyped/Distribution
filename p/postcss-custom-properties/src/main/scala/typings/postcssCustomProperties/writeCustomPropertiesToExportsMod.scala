package typings.postcssCustomProperties

import typings.postcssCustomProperties.optionsMod.ExportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeCustomPropertiesToExportsMod {
  
  @JSImport("postcss-custom-properties/dist/lib/write-custom-properties-to-exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(customProperties: Any, destinations: js.Array[ExportOptions]): js.Promise[js.Array[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(customProperties.asInstanceOf[js.Any], destinations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Unit]]]
}
