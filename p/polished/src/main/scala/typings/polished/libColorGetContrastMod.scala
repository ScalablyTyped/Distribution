package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorGetContrastMod {
  
  @JSImport("polished/lib/color/getContrast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color1: String, color2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
