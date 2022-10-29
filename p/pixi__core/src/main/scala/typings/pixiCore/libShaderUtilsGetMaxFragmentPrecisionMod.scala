package typings.pixiCore

import typings.pixiConstants.mod.PRECISION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsGetMaxFragmentPrecisionMod {
  
  @JSImport("@pixi/core/lib/shader/utils/getMaxFragmentPrecision", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMaxFragmentPrecision(): PRECISION = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxFragmentPrecision")().asInstanceOf[PRECISION]
}
