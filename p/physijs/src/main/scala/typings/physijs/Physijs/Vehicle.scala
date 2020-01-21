package typings.physijs.Physijs

import typings.three.mod.Geometry
import typings.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Vehicle")
@js.native
class Vehicle protected () extends js.Object {
  def this(mesh: Mesh) = this()
  def this(mesh: Mesh, tuning: VehicleTuning) = this()
  var mesh: typings.three.mod.Mesh = js.native
  var wheels: js.Array[typings.three.mod.Mesh] = js.native
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typings.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean
  ): Unit = js.native
  def addWheel(
    wheel_geometry: Geometry,
    wheel_material: typings.three.mod.Material,
    connection_point: Vector3,
    wheel_direction: Vector3,
    wheel_axle: Vector3,
    suspension_rest_length: Double,
    wheel_radius: Double,
    is_front_wheel: Boolean,
    tuning: VehicleTuning
  ): Unit = js.native
  def applyEngineForce(amount: Double): Unit = js.native
  def applyEngineForce(amount: Double, wheel: typings.three.mod.Mesh): Unit = js.native
  def setBrake(amount: Double): Unit = js.native
  def setBrake(amount: Double, wheel: typings.three.mod.Mesh): Unit = js.native
  def setSteering(amount: Double): Unit = js.native
  def setSteering(amount: Double, wheel: typings.three.mod.Mesh): Unit = js.native
}

