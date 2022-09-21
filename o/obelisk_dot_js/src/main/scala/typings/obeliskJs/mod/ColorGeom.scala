package typings.obeliskJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "ColorGeom")
@js.native
open class ColorGeom () extends StObject
/* static members */
object ColorGeom {
  
  @JSImport("obelisk.js", "ColorGeom")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyBrightness(color: Double, brightness: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBrightness")(color.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def applyBrightness(color: Double, brightness: Double, highlight: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBrightness")(color.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any], highlight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get32(color: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get32")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
}
