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

object Ray {
  @scala.inline
  def apply(
    callback: RaycastResult => scala.Unit,
    checkCollisionResponse: scala.Boolean,
    collisionGroup: scala.Double,
    collisionMask: scala.Double,
    direction: js.Tuple2[scala.Double, scala.Double],
    from: js.Tuple2[scala.Double, scala.Double],
    getAABB: () => AABB,
    intersectBodies: (RaycastResult, js.Array[Body]) => scala.Unit,
    length: scala.Double,
    mode: scala.Double,
    skipBackfaces: scala.Boolean,
    to: js.Tuple2[scala.Double, scala.Double],
    update: () => scala.Unit
  ): Ray = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), checkCollisionResponse = checkCollisionResponse, collisionGroup = collisionGroup, collisionMask = collisionMask, direction = direction, from = from, getAABB = js.Any.fromFunction0(getAABB), intersectBodies = js.Any.fromFunction2(intersectBodies), length = length, mode = mode, skipBackfaces = skipBackfaces, to = to, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Ray]
  }
}

