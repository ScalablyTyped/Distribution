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
    Add: js.Function2[scala.Double, IObjectTypeTargetForBrowsing, scala.Unit],
    Clone: js.Function0[IObjectTypeTargetsForBrowsing],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjectTypeTargetForBrowsing],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
}

