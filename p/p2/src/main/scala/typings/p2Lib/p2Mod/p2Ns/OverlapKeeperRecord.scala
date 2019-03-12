package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlapKeeperRecord extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var shapeA: Shape
  var shapeB: Shape
  def set(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape): scala.Unit
}

object OverlapKeeperRecord {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    set: (Body, Shape, Body, Shape) => scala.Unit,
    shapeA: Shape,
    shapeB: Shape
  ): OverlapKeeperRecord = {
    val __obj = js.Dynamic.literal(bodyA = bodyA, bodyB = bodyB, set = js.Any.fromFunction4(set), shapeA = shapeA, shapeB = shapeB)
  
    __obj.asInstanceOf[OverlapKeeperRecord]
  }
}

