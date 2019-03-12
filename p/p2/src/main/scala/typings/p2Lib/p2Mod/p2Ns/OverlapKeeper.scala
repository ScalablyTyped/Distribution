package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlapKeeper extends js.Object {
  var OverlapKeeperRecordPool: p2Lib.p2Mod.p2Ns.OverlapKeeperRecordPool
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

object OverlapKeeper {
  @scala.inline
  def apply(
    OverlapKeeperRecordPool: OverlapKeeperRecordPool,
    bodiesAreOverlapping: (Body, Body) => scala.Boolean,
    bodyA: Body,
    bodyB: Body,
    overlappingShapesCurrentState: TupleDictionary,
    overlappingShapesLastState: TupleDictionary,
    setOverlapping: (Body, Shape, Body, Body) => scala.Unit,
    shapeA: Shape,
    shapeB: Shape,
    tick: () => scala.Unit,
    tmpArray1: js.Array[_],
    tmpDict: TupleDictionary
  ): OverlapKeeper = {
    val __obj = js.Dynamic.literal(OverlapKeeperRecordPool = OverlapKeeperRecordPool, bodiesAreOverlapping = js.Any.fromFunction2(bodiesAreOverlapping), bodyA = bodyA, bodyB = bodyB, overlappingShapesCurrentState = overlappingShapesCurrentState, overlappingShapesLastState = overlappingShapesLastState, setOverlapping = js.Any.fromFunction4(setOverlapping), shapeA = shapeA, shapeB = shapeB, tick = js.Any.fromFunction0(tick), tmpArray1 = tmpArray1, tmpDict = tmpDict)
  
    __obj.asInstanceOf[OverlapKeeper]
  }
}

