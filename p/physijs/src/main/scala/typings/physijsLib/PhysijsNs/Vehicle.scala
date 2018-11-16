package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Vehicle")
@js.native
class Vehicle protected () extends js.Object {
  def this(mesh: Mesh) = this()
  def this(mesh: Mesh, tuning: VehicleTuning) = this()
  var mesh: threeLib.threeMod.Mesh = js.native
  var wheels: js.Array[threeLib.threeMod.Mesh] = js.native
  def addWheel(
    wheel_geometry: threeLib.threeMod.Geometry,
    wheel_material: threeLib.threeMod.Material,
    connection_point: threeLib.threeMod.Vector3,
    wheel_direction: threeLib.threeMod.Vector3,
    wheel_axle: threeLib.threeMod.Vector3,
    suspension_rest_length: scala.Double,
    wheel_radius: scala.Double,
    is_front_wheel: scala.Boolean
  ): scala.Unit = js.native
  def addWheel(
    wheel_geometry: threeLib.threeMod.Geometry,
    wheel_material: threeLib.threeMod.Material,
    connection_point: threeLib.threeMod.Vector3,
    wheel_direction: threeLib.threeMod.Vector3,
    wheel_axle: threeLib.threeMod.Vector3,
    suspension_rest_length: scala.Double,
    wheel_radius: scala.Double,
    is_front_wheel: scala.Boolean,
    tuning: VehicleTuning
  ): scala.Unit = js.native
  def applyEngineForce(amount: scala.Double): scala.Unit = js.native
  def applyEngineForce(amount: scala.Double, wheel: threeLib.threeMod.Mesh): scala.Unit = js.native
  def setBrake(amount: scala.Double): scala.Unit = js.native
  def setBrake(amount: scala.Double, wheel: threeLib.threeMod.Mesh): scala.Unit = js.native
  def setSteering(amount: scala.Double): scala.Unit = js.native
  def setSteering(amount: scala.Double, wheel: threeLib.threeMod.Mesh): scala.Unit = js.native
}

