package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "OverlapKeeper")
@js.native
class OverlapKeeper () extends js.Object {
  var OverlapKeeperRecordPool: typings.p2.p2Mod.OverlapKeeperRecordPool = js.native
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var overlappingShapesCurrentState: TupleDictionary = js.native
  var overlappingShapesLastState: TupleDictionary = js.native
  var shapeA: Shape = js.native
  var shapeB: Shape = js.native
  var tmpArray1: js.Array[_] = js.native
  var tmpDict: TupleDictionary = js.native
  def bodiesAreOverlapping(bodyA: Body, bodyB: Body): Boolean = js.native
  def setOverlapping(bodyA: Body, shapeA: Shape, bodyB: Body, shapeB: Body): Unit = js.native
  def tick(): Unit = js.native
}

