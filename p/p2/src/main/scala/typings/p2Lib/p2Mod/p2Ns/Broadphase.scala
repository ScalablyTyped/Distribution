package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broadphase extends js.Object {
  var boundingVolumeType: scala.Double
  var result: js.Array[Body]
  var `type`: scala.Double
  var world: World
  def boundingVolumeCheck(bodyA: Body, bodyB: Body): scala.Boolean
  def getCollisionPairs(world: World): js.Array[Body]
  def setWorld(world: World): scala.Unit
}

