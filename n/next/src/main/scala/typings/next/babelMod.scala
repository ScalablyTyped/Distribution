package typings.next

import typings.next.distBuildBabelPresetMod.BabelPreset
import typings.next.distBuildBabelPresetMod.NextBabelPresetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelMod {
  
  @JSImport("next/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(api: Any): BabelPreset = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(api.asInstanceOf[js.Any]).asInstanceOf[BabelPreset]
  inline def default(api: Any, options: NextBabelPresetOptions): BabelPreset = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BabelPreset]
}
