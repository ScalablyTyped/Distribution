package typings.numSort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("num-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def numberSortAscending(left: Double, right: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("numberSortAscending")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def numberSortDescending(left: Double, right: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("numberSortDescending")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
}
