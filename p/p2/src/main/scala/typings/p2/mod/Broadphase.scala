package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Broadphase")
@js.native
class Broadphase protected () extends js.Object {
  def this(`type`: Double) = this()
  var boundingVolumeType: Double = js.native
  var result: js.Array[Body] = js.native
  var `type`: Double = js.native
  var world: World = js.native
  def aabbCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def aabbQuery(): js.Array[Body] = js.native
  def aabbQuery(world: World): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  def boundingRadiusCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def boundingVolumeCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def canCollide(bodyA: Body, bodyB: Body): Boolean = js.native
  def getCollisionPairs(world: World): js.Array[Body] = js.native
  def setWorld(world: World): Unit = js.native
}

/* static members */
@JSImport("p2", "Broadphase")
@js.native
object Broadphase extends js.Object {
  var AABB: Double = js.native
  var BOUNDING_CIRCLE: Double = js.native
  var NAIVE: Double = js.native
  var SAP: Double = js.native
  def aabbCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def boundingRadiusCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  def canCollide(bodyA: Body, bodyB: Body): Boolean = js.native
}

