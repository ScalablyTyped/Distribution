package typings.popmotion

import typings.popmotion.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsAngleMod {
  
  @JSImport("popmotion/lib/utils/angle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def angle(a: Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def angle(a: Point, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
