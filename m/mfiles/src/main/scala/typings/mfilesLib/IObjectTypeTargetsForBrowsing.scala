package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeTargetsForBrowsing extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): scala.Unit
  def Clone(): IObjectTypeTargetsForBrowsing
  def Item(Index: scala.Double): IObjectTypeTargetForBrowsing
  def Remove(Index: scala.Double): scala.Unit
}

object IObjectTypeTargetsForBrowsing {
  @scala.inline
  def apply(
    Add: (scala.Double, IObjectTypeTargetForBrowsing) => scala.Unit,
    Clone: () => IObjectTypeTargetsForBrowsing,
    Count: scala.Double,
    Item: scala.Double => IObjectTypeTargetForBrowsing,
    Remove: scala.Double => scala.Unit
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
}

