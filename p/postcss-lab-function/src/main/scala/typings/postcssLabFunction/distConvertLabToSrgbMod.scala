package typings.postcssLabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertLabToSrgbMod {
  
  @JSImport("postcss-lab-function/dist/convert-lab-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def labToSRgb(labRaw: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("labToSRgb")(labRaw.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
