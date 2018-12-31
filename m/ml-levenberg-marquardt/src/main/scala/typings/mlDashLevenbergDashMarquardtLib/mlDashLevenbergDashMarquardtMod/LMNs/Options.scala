package typings
package mlDashLevenbergDashMarquardtLib.mlDashLevenbergDashMarquardtMod.LMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The Levenberg-Marquardt lambda parameter.
    * Default value: 0
    */
  var damping: scala.Double
  /**
    * Minimum uncertainty allowed for each point.
    * Default value: 10e-3
    */
  var errorTolerance: scala.Double
  /**
    * Adjustment for decrease the damping parameter.
    * Default value: 10e-2
    */
  var gradientDifference: scala.Double
  /**
    * Initial guesses for the parameters.
    * Default value: Array(parameters.lengh).fill(1)
    */
  var initialValues: js.Array[scala.Double]
  /**
    * The maximum number of iterations before halting.
    * Default value: 100
    */
  var maxIterations: scala.Double
  /**
    * Maximum values for the parameters.
    * Default value: Array(data.x.length).fill(MAX_SAFE_INTEGER)
    */
  var maxValue: js.Array[scala.Double]
  /**
    * Minimum values for the parameters.
    * Default value: Array(data.x.length).fill(MIN_SAFE_INTEGER)
    */
  var minValue: js.Array[scala.Double]
}

