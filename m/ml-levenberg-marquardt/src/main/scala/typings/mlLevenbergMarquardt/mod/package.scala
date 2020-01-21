package typings.mlLevenbergMarquardt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Function that receives an array of parameters and returns
    * a function with the independent variable as a parameter.
    */
  type FittedFunction = js.Function1[
    /* parameters */ js.Array[scala.Double], 
    js.Function1[/* x */ scala.Double, scala.Double]
  ]
}
