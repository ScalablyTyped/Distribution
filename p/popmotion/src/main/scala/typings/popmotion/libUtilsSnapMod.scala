package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSnapMod {
  
  @JSImport("popmotion/lib/utils/snap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(points.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  inline def snap(points: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(points.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
}
