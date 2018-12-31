package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlapKeeper extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var shapeA: Shape
  var shapeB: Shape
  def bodiesAreOverlapping(bodyA: Body, bodyB: Body): scala.Boolean
  def set(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Shape): scala.Unit
  def setOverlapping(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Body): scala.Unit
  def tick(): scala.Unit
}

