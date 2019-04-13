package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Broadphase")
@js.native
class Broadphase protected () extends js.Object {
  def this(`type`: scala.Double) = this()
  var boundingVolumeType: scala.Double = js.native
  var result: js.Array[Body] = js.native
  var `type`: scala.Double = js.native
  var world: World = js.native
  def aabbCheck(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def aabbQuery(): js.Array[Body] = js.native
  def aabbQuery(world: World): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  def boundingRadiusCheck(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def boundingVolumeCheck(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def canCollide(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def getCollisionPairs(world: World): js.Array[Body] = js.native
  def setWorld(world: World): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "Broadphase")
@js.native
object Broadphase extends js.Object {
  var AABB: scala.Double = js.native
  var BOUNDING_CIRCLE: scala.Double = js.native
  var NAIVE: scala.Double = js.native
  var SAP: scala.Double = js.native
  def aabbCheck(bodyA: p2Lib.p2Mod.Body, bodyB: p2Lib.p2Mod.Body): scala.Boolean = js.native
  def boundingRadiusCheck(bodyA: p2Lib.p2Mod.Body, bodyB: p2Lib.p2Mod.Body): scala.Boolean = js.native
  def canCollide(bodyA: p2Lib.p2Mod.Body, bodyB: p2Lib.p2Mod.Body): scala.Boolean = js.native
}

