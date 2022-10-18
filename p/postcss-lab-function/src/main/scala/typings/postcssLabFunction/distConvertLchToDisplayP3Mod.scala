package typings.postcssLabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertLchToDisplayP3Mod {
  
  @JSImport("postcss-lab-function/dist/convert-lch-to-display-p3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lchToDisplayP3(lchRaw: color): js.Tuple2[color, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("lchToDisplayP3")(lchRaw.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[color, Boolean]]
  
  type color = js.Tuple3[Double, Double, Double]
}
