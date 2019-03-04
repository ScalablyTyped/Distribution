package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelConstraint extends Constraint {
  var engineForce: scala.Double
  var forwardEquation: FrictionEquation
  var localForwardVector: js.Tuple2[scala.Double, scala.Double]
  var localPosition: js.Tuple2[scala.Double, scala.Double]
  var sideEquation: FrictionEquation
  var steerValue: scala.Double
  var vehicle: TopDownVehicle
  def getSpeed(): scala.Double
  def setBrakeForce(force: scala.Double): scala.Unit
  def setSideFriction(force: scala.Double): scala.Unit
}

object WheelConstraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: scala.Boolean,
    engineForce: scala.Double,
    equeations: js.Array[Equation],
    forwardEquation: FrictionEquation,
    getSpeed: js.Function0[scala.Double],
    localForwardVector: js.Tuple2[scala.Double, scala.Double],
    localPosition: js.Tuple2[scala.Double, scala.Double],
    setBrakeForce: js.Function1[scala.Double, scala.Unit],
    setRelaxation: js.Function1[scala.Double, scala.Unit],
    setSideFriction: js.Function1[scala.Double, scala.Unit],
    setStiffness: js.Function1[scala.Double, scala.Unit],
    sideEquation: FrictionEquation,
    steerValue: scala.Double,
    `type`: scala.Double,
    update: js.Function0[scala.Unit],
    vehicle: TopDownVehicle
  ): WheelConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, engineForce = engineForce, equeations = equeations, forwardEquation = forwardEquation, getSpeed = getSpeed, localForwardVector = localForwardVector, localPosition = localPosition, setBrakeForce = setBrakeForce, setRelaxation = setRelaxation, setSideFriction = setSideFriction, setStiffness = setStiffness, sideEquation = sideEquation, steerValue = steerValue, update = update, vehicle = vehicle)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WheelConstraint]
  }
}

