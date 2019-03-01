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
    set: js.Function4[Body, Shape, Body, Shape, scala.Unit],
    shapeA: Shape,
    shapeB: Shape
  ): OverlapKeeperRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("shapeA")(shapeA)
    __obj.updateDynamic("shapeB")(shapeB)
    __obj.asInstanceOf[OverlapKeeperRecord]
  }
}

