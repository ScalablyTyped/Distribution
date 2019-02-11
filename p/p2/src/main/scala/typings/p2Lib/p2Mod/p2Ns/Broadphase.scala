package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broadphase extends js.Object {
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

