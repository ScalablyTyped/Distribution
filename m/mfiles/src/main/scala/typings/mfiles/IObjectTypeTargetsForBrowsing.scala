package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeTargetsForBrowsing extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): Unit
  def Clone(): IObjectTypeTargetsForBrowsing
  def Item(Index: Double): IObjectTypeTargetForBrowsing
  def Remove(Index: Double): Unit
}

object IObjectTypeTargetsForBrowsing {
  @scala.inline
  def apply(
    Add: (Double, IObjectTypeTargetForBrowsing) => Unit,
    Clone: () => IObjectTypeTargetsForBrowsing,
    Count: Double,
    Item: Double => IObjectTypeTargetForBrowsing,
    Remove: Double => Unit
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
}

