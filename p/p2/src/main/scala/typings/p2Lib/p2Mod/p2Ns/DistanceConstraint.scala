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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("collideConnected")(collideConnected)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("equeations")(equeations)
    __obj.updateDynamic("getMaxForce")(getMaxForce)
    __obj.updateDynamic("localAnchorA")(localAnchorA)
    __obj.updateDynamic("localAnchorB")(localAnchorB)
    __obj.updateDynamic("lowerLimit")(lowerLimit)
    __obj.updateDynamic("lowerLimitEnabled")(lowerLimitEnabled)
    __obj.updateDynamic("maxForce")(maxForce)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("setMaxForce")(setMaxForce)
    __obj.updateDynamic("setRelaxation")(setRelaxation)
    __obj.updateDynamic("setStiffness")(setStiffness)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("upperLimit")(upperLimit)
    __obj.updateDynamic("upperLimitEnabled")(upperLimitEnabled)
    __obj.asInstanceOf[DistanceConstraint]
  }
}

