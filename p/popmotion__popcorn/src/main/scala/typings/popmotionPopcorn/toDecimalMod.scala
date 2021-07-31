package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toDecimalMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/to-decimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def default(num: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(num.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
}
