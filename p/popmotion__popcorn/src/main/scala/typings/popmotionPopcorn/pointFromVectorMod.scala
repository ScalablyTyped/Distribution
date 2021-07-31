package typings.popmotionPopcorn

import typings.popmotionPopcorn.anon.X
import typings.popmotionPopcorn.typesMod.Point2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointFromVectorMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/point-from-vector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(origin: Point2D, angle: Double, distance: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[X]
}
