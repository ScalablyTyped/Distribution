package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlapKeeper extends js.Object {
  var OverlapKeeperRecordPool: OverlapKeeperRecordPool
  var bodyA: Body
  var bodyB: Body
  var overlappingShapesCurrentState: TupleDictionary
  var overlappingShapesLastState: TupleDictionary
  var shapeA: Shape
  var shapeB: Shape
  var tmpArray1: js.Array[_]
  var tmpDict: TupleDictionary
  def bodiesAreOverlapping(bodyA: Body, bodyB: Body): scala.Boolean
  def setOverlapping(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Body): scala.Unit
  def tick(): scala.Unit
}

