package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "WheelConstraint")
@js.native
class WheelConstraint protected () extends Constraint {
  def this(vehicle: TopDownVehicle) = this()
  def this(vehicle: TopDownVehicle, options: WheelConstraintOptions) = this()
  var engineForce: scala.Double = js.native
  var forwardEquation: FrictionEquation = js.native
  var localForwardVector: js.Tuple2[scala.Double, scala.Double] = js.native
  var localPosition: js.Tuple2[scala.Double, scala.Double] = js.native
  var sideEquation: FrictionEquation = js.native
  var steerValue: scala.Double = js.native
  var vehicle: TopDownVehicle = js.native
  def getSpeed(): scala.Double = js.native
  def setBrakeForce(force: scala.Double): scala.Unit = js.native
  def setSideFriction(force: scala.Double): scala.Unit = js.native
}

