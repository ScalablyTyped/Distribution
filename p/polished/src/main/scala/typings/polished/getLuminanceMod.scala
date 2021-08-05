package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLuminanceMod {
  
  @JSImport("polished/lib/color/getLuminance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
}
