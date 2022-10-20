package typings.ngPackagr

import typings.rollup.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFlattenDownlevelPluginMod {
  
  @JSImport("ng-packagr/lib/flatten/downlevel-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def downlevelCodeWithTsc(code: String, filePath: String): TransformResult = (^.asInstanceOf[js.Dynamic].applyDynamic("downlevelCodeWithTsc")(code.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[TransformResult]
}
