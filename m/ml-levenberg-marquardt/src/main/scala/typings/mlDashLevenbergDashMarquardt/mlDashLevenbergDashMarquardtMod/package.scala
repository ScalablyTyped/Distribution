package typings.mlDashLevenbergDashMarquardt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mlDashLevenbergDashMarquardtMod {
  /**
    * Function that receives an array of parameters and returns
    * a function with the independent variable as a parameter.
    */
  type FittedFunction = js.Function1[/* parameters */ js.Array[Double], js.Function1[/* x */ Double, Double]]
}
