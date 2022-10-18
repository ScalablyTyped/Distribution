package typings.popmotion

import typings.popmotion.anon.X
import typings.popmotion.libTypesMod.Point2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPointFromVectorMod {
  
  @JSImport("popmotion/lib/utils/point-from-vector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointFromVector(origin: Point2D, angle: Double, distance: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("pointFromVector")(origin.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[X]
}
