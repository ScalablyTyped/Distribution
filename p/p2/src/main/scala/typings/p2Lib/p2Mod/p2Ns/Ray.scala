package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ray extends js.Object {
  var checkCollisionResponse: scala.Boolean
  var collisionGroup: scala.Double
  var collisionMask: scala.Double
  var direction: js.Tuple2[scala.Double, scala.Double]
  var from: js.Tuple2[scala.Double, scala.Double]
  var length: scala.Double
  var mode: scala.Double
  var skipBackfaces: scala.Boolean
  var to: js.Tuple2[scala.Double, scala.Double]
  def callback(result: RaycastResult): scala.Unit
  def getAABB(): AABB
  def intersectBodies(result: RaycastResult, bodies: js.Array[Body]): scala.Unit
  def update(): scala.Unit
}

