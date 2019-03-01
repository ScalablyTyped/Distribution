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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("collideConnected")(collideConnected)
    __obj.updateDynamic("engineForce")(engineForce)
    __obj.updateDynamic("equeations")(equeations)
    __obj.updateDynamic("forwardEquation")(forwardEquation)
    __obj.updateDynamic("getSpeed")(getSpeed)
    __obj.updateDynamic("localForwardVector")(localForwardVector)
    __obj.updateDynamic("localPosition")(localPosition)
    __obj.updateDynamic("setBrakeForce")(setBrakeForce)
    __obj.updateDynamic("setRelaxation")(setRelaxation)
    __obj.updateDynamic("setSideFriction")(setSideFriction)
    __obj.updateDynamic("setStiffness")(setStiffness)
    __obj.updateDynamic("sideEquation")(sideEquation)
    __obj.updateDynamic("steerValue")(steerValue)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("vehicle")(vehicle)
    __obj.asInstanceOf[WheelConstraint]
  }
}

