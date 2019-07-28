package typings.mlDashLevenbergDashMarquardt.mlDashLevenbergDashMarquardtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The Levenberg-Marquardt lambda parameter.
    * Default value: 0
    */
  var damping: Double
  /**
    * Minimum uncertainty allowed for each point.
    * Default value: 10e-3
    */
  var errorTolerance: Double
  /**
    * Adjustment for decrease the damping parameter.
    * Default value: 10e-2
    */
  var gradientDifference: Double
  /**
    * Initial guesses for the parameters.
    * Default value: Array(parameters.lengh).fill(1)
    */
  var initialValues: js.Array[Double]
  /**
    * The maximum number of iterations before halting.
    * Default value: 100
    */
  var maxIterations: Double
  /**
    * Maximum values for the parameters.
    * Default value: Array(data.x.length).fill(MAX_SAFE_INTEGER)
    */
  var maxValue: js.Array[Double]
  /**
    * Minimum values for the parameters.
    * Default value: Array(data.x.length).fill(MIN_SAFE_INTEGER)
    */
  var minValue: js.Array[Double]
}

object Options {
  @scala.inline
  def apply(
    damping: Double,
    errorTolerance: Double,
    gradientDifference: Double,
    initialValues: js.Array[Double],
    maxIterations: Double,
    maxValue: js.Array[Double],
    minValue: js.Array[Double]
  ): Options = {
    val __obj = js.Dynamic.literal(damping = damping, errorTolerance = errorTolerance, gradientDifference = gradientDifference, initialValues = initialValues, maxIterations = maxIterations, maxValue = maxValue, minValue = minValue)
  
    __obj.asInstanceOf[Options]
  }
}

