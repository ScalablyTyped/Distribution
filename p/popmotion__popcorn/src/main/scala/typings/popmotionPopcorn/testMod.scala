package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  object Point {
    
    @JSImport("@popmotion/popcorn/lib/utils/test", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def remove(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
