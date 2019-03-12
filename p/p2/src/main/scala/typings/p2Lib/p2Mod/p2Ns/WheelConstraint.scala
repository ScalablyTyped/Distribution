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
    getSpeed: () => scala.Double,
    localForwardVector: js.Tuple2[scala.Double, scala.Double],
    localPosition: js.Tuple2[scala.Double, scala.Double],
    setBrakeForce: scala.Double => scala.Unit,
    setRelaxation: scala.Double => scala.Unit,
    setSideFriction: scala.Double => scala.Unit,
    setStiffness: scala.Double => scala.Unit,
    sideEquation: FrictionEquation,
    steerValue: scala.Double,
    `type`: scala.Double,
    update: () => scala.Unit,
    vehicle: TopDownVehicle
  ): WheelConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, collideConnected = collideConnected, engineForce = engineForce, equeations = equeations, forwardEquation = forwardEquation, getSpeed = js.Any.fromFunction0(getSpeed), localForwardVector = localForwardVector, localPosition = localPosition, setBrakeForce = js.Any.fromFunction1(setBrakeForce), setRelaxation = js.Any.fromFunction1(setRelaxation), setSideFriction = js.Any.fromFunction1(setSideFriction), setStiffness = js.Any.fromFunction1(setStiffness), sideEquation = sideEquation, steerValue = steerValue, update = js.Any.fromFunction0(update), vehicle = vehicle)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WheelConstraint]
  }
}

