package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceConstraint extends Constraint {
  var distance: scala.Double
  var localAnchorA: js.Tuple2[scala.Double, scala.Double]
  var localAnchorB: js.Tuple2[scala.Double, scala.Double]
  var lowerLimit: scala.Double
  var lowerLimitEnabled: scala.Boolean
  var maxForce: scala.Double
  var position: scala.Double
  var upperLimit: scala.Double
  var upperLimitEnabled: scala.Boolean
  def getMaxForce(): scala.Double
  def setMaxForce(maxForce: scala.Double): scala.Unit
}

object DistanceConstraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: scala.Boolean,
    distance: scala.Double,
    equeations: js.Array[Equation],
    getMaxForce: js.Function0[scala.Double],
    localAnchorA: js.Tuple2[scala.Double, scala.Double],
    localAnchorB: js.Tuple2[scala.Double, scala.Double],
    lowerLimit: scala.Double,
    lowerLimitEnabled: scala.Boolean,
    maxForce: scala.Double,
    position: scala.Double,
    setMaxForce: js.Function1[scala.Double, scala.Unit],
    setRelaxation: js.Function1[scala.Double, scala.Unit],
    setStiffness: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    update: js.Function0[scala.Unit],
    upperLimit: scala.Double,
    upperLimitEnabled: scala.Boolean
  ): DistanceConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, distance = distance, equeations = equeations, getMaxForce = getMaxForce, localAnchorA = localAnchorA, localAnchorB = localAnchorB, lowerLimit = lowerLimit, lowerLimitEnabled = lowerLimitEnabled, maxForce = maxForce, position = position, setMaxForce = setMaxForce, setRelaxation = setRelaxation, setStiffness = setStiffness, update = update, upperLimit = upperLimit, upperLimitEnabled = upperLimitEnabled)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DistanceConstraint]
  }
}

