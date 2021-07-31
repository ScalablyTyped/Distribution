package typings.obeliskJs.mod

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "CanvasTool")
@js.native
class CanvasTool () extends StObject
/* static members */
object CanvasTool {
  
  @JSImport("obelisk.js", "CanvasTool")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPixel(imageData: ImageData, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPixel")(imageData.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
}
