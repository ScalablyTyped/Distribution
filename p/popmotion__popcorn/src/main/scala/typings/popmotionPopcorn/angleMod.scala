package typings.popmotionPopcorn

import typings.popmotionPopcorn.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angleMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/angle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(a: Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def default(a: Point, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
