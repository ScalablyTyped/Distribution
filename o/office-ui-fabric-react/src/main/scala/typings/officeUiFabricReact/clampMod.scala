package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clampMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/clamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clamp(value: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def clamp(value: Double, max: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
}
