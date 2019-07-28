package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "OverlapKeeperRecord")
@js.native
class OverlapKeeperRecord protected () extends js.Object {
  def this(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape) = this()
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  def set(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape): Unit = js.native
}

