package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/distance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(a: Point, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type Point = typings.popmotionPopcorn.typesMod.Point | Double
}
