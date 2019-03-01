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
    callback: js.Function1[RaycastResult, scala.Unit],
    checkCollisionResponse: scala.Boolean,
    collisionGroup: scala.Double,
    collisionMask: scala.Double,
    direction: js.Tuple2[scala.Double, scala.Double],
    from: js.Tuple2[scala.Double, scala.Double],
    getAABB: js.Function0[AABB],
    intersectBodies: js.Function2[RaycastResult, js.Array[Body], scala.Unit],
    length: scala.Double,
    mode: scala.Double,
    skipBackfaces: scala.Boolean,
    to: js.Tuple2[scala.Double, scala.Double],
    update: js.Function0[scala.Unit]
  ): Ray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("checkCollisionResponse")(checkCollisionResponse)
    __obj.updateDynamic("collisionGroup")(collisionGroup)
    __obj.updateDynamic("collisionMask")(collisionMask)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("getAABB")(getAABB)
    __obj.updateDynamic("intersectBodies")(intersectBodies)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("skipBackfaces")(skipBackfaces)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Ray]
  }
}

