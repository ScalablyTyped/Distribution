package typings.popcnt32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calculate population count (popcnt) on a 32-bit number, branch free.
    *
    * @return Number of 1-bits in `int`. Int is implicitly cast to a 32-bit unsigned int.
    * This means `popcnt32(-1) === 32` while `popcnt32(1) === 1`.
    *
    * @example
    * import popcnt32 = require('popcnt32')
    *
    * popcnt32(0b1) // 1
    * popcnt32(0b1000001) // 2
    */
  inline def apply(int: Double): Double = ^.asInstanceOf[js.Dynamic].apply(int.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("popcnt32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
