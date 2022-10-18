package typings.postcssLabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertLabToDisplayP3Mod {
  
  @JSImport("postcss-lab-function/dist/convert-lab-to-display-p3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def labToDisplayP3(labRaw: color): js.Tuple2[color, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("labToDisplayP3")(labRaw.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[color, Boolean]]
  
  type color = js.Tuple3[Double, Double, Double]
}
