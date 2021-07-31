package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object centerMod {
  
  @JSImport("ol/geom/flat/center", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def linearRingss(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("linearRingss")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
