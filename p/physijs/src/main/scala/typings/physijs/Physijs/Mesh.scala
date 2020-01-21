package typings.physijs.Physijs

import typings.physijs.AnonTarget
import typings.three.mod.Geometry
import typings.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Mesh")
@js.native
class Mesh protected ()
  extends typings.three.mod.Mesh {
  def this(geometry: Geometry) = this()
  def this(geometry: Geometry, material: typings.three.mod.Material) = this()
  def this(geometry: Geometry, material: typings.three.mod.Material, mass: Double) = this()
  def applyCentralForce(force: Vector3): Unit = js.native
  def applyCentralImpulse(force: Vector3): Unit = js.native
  def applyForce(force: Vector3, offset: Vector3): Unit = js.native
  def applyImpulse(force: Vector3, offset: Vector3): Unit = js.native
  def dispatchEvent(event_name: String): Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: AnonTarget): Unit = js.native
  def getAngularVelocity(): Vector3 = js.native
  def getLinearVelocity(): Vector3 = js.native
  def setAngularFactor(factor: Vector3): Unit = js.native
  def setAngularVelocity(velocity: Vector3): Unit = js.native
  def setCcdMotionThreshold(threshold: Double): Unit = js.native
  def setCcdSweptSphereRadius(radius: Double): Unit = js.native
  def setDamping(linear: Double, angular: Double): Unit = js.native
  def setLinearFactor(factor: Vector3): Unit = js.native
  def setLinearVelocity(velocity: Vector3): Unit = js.native
}

