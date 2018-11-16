package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Broadphase")
@js.native
class Broadphase protected ()
  extends p2Lib.p2Mod.p2Ns.Broadphase {
  def this(`type`: scala.Double) = this()
  /* CompleteClass */
  override var boundingVolumeType: scala.Double = js.native
  /* CompleteClass */
  override var result: js.Array[p2Lib.p2Mod.p2Ns.Body] = js.native
  /* CompleteClass */
  override var `type`: scala.Double = js.native
  /* CompleteClass */
  override var world: p2Lib.p2Mod.p2Ns.World = js.native
  /* CompleteClass */
  override def boundingVolumeCheck(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body): scala.Boolean = js.native
  /* CompleteClass */
  override def getCollisionPairs(world: p2Lib.p2Mod.p2Ns.World): js.Array[p2Lib.p2Mod.p2Ns.Body] = js.native
  /* CompleteClass */
  override def setWorld(world: p2Lib.p2Mod.p2Ns.World): scala.Unit = js.native
}

@JSImport("p2", "Broadphase")
@js.native
object Broadphase extends js.Object {
  var AABB: scala.Double = js.native
  var BOUNDING_CIRCLE: scala.Double = js.native
  var NAIVE: scala.Double = js.native
  var SAP: scala.Double = js.native
  def aabbCheck(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body): scala.Boolean = js.native
  def boundingRadiusCheck(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body): scala.Boolean = js.native
  def canCollide(bodyA: p2Lib.p2Mod.p2Ns.Body, bodyB: p2Lib.p2Mod.p2Ns.Body): scala.Boolean = js.native
}

