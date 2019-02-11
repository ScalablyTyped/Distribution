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

