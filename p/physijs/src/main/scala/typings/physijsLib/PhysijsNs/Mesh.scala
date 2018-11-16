package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Physijs.Mesh")
@js.native
class Mesh protected ()
  extends threeLib.threeMod.Mesh {
  def this(geometry: threeLib.threeMod.Geometry) = this()
  def this(geometry: threeLib.threeMod.Geometry, material: threeLib.threeMod.Material) = this()
  def this(geometry: threeLib.threeMod.Geometry, material: threeLib.threeMod.Material, mass: scala.Double) = this()
  def applyCentralForce(force: threeLib.threeMod.Vector3): scala.Unit = js.native
  def applyCentralImpulse(force: threeLib.threeMod.Vector3): scala.Unit = js.native
  def applyForce(force: threeLib.threeMod.Vector3, offset: threeLib.threeMod.Vector3): scala.Unit = js.native
  def applyImpulse(force: threeLib.threeMod.Vector3, offset: threeLib.threeMod.Vector3): scala.Unit = js.native
  def dispatchEvent(event_name: java.lang.String): scala.Unit = js.native
  // (extends from Object3D)
  def dispatchEvent(event: physijsLib.Anon_Type): scala.Unit = js.native
  def getAngularVelocity(): threeLib.threeMod.Vector3 = js.native
  def getLinearVelocity(): threeLib.threeMod.Vector3 = js.native
  def setAngularFactor(factor: threeLib.threeMod.Vector3): scala.Unit = js.native
  def setAngularVelocity(velocity: threeLib.threeMod.Vector3): scala.Unit = js.native
  def setCcdMotionThreshold(threshold: scala.Double): scala.Unit = js.native
  def setCcdSweptSphereRadius(radius: scala.Double): scala.Unit = js.native
  def setDamping(linear: scala.Double, angular: scala.Double): scala.Unit = js.native
  def setLinearFactor(factor: threeLib.threeMod.Vector3): scala.Unit = js.native
  def setLinearVelocity(velocity: threeLib.threeMod.Vector3): scala.Unit = js.native
}

