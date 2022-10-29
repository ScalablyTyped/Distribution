package typings.pixiCore

import typings.pixiConstants.mod.PRECISION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsSetPrecisionMod {
  
  @JSImport("@pixi/core/lib/shader/utils/setPrecision", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setPrecision(src: String, requestedPrecision: PRECISION, maxSupportedPrecision: PRECISION): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrecision")(src.asInstanceOf[js.Any], requestedPrecision.asInstanceOf[js.Any], maxSupportedPrecision.asInstanceOf[js.Any])).asInstanceOf[String]
}
