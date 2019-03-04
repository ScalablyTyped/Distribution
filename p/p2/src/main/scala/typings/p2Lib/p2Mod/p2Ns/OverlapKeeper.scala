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

object OverlapKeeper {
  @scala.inline
  def apply(
    OverlapKeeperRecordPool: OverlapKeeperRecordPool,
    bodiesAreOverlapping: js.Function2[Body, Body, scala.Boolean],
    bodyA: Body,
    bodyB: Body,
    overlappingShapesCurrentState: TupleDictionary,
    overlappingShapesLastState: TupleDictionary,
    setOverlapping: js.Function4[Body, Shape, Body, Body, scala.Unit],
    shapeA: Shape,
    shapeB: Shape,
    tick: js.Function0[scala.Unit],
    tmpArray1: js.Array[_],
    tmpDict: TupleDictionary
  ): OverlapKeeper = {
    val __obj = js.Dynamic.literal(OverlapKeeperRecordPool = OverlapKeeperRecordPool, bodiesAreOverlapping = bodiesAreOverlapping, bodyA = bodyA, bodyB = bodyB, overlappingShapesCurrentState = overlappingShapesCurrentState, overlappingShapesLastState = overlappingShapesLastState, setOverlapping = setOverlapping, shapeA = shapeA, shapeB = shapeB, tick = tick, tmpArray1 = tmpArray1, tmpDict = tmpDict)
  
    __obj.asInstanceOf[OverlapKeeper]
  }
}

