package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookups extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, Lookup: ILookup): scala.Unit
  def Clone(): ILookups
  def CloneFrom(Lookups: ILookups): scala.Unit
  def GetLookupByItem(Item: scala.Double): ILookup
  def GetLookupIndexByItem(Item: scala.Double): scala.Double
  def Item(Index: scala.Double): ILookup
  def Remove(Index: scala.Double): scala.Unit
}

object ILookups {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, ILookup, scala.Unit],
    Clone: js.Function0[ILookups],
    CloneFrom: js.Function1[ILookups, scala.Unit],
    Count: scala.Double,
    GetLookupByItem: js.Function1[scala.Double, ILookup],
    GetLookupIndexByItem: js.Function1[scala.Double, scala.Double],
    Item: js.Function1[scala.Double, ILookup],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): ILookups = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, CloneFrom = CloneFrom, Count = Count, GetLookupByItem = GetLookupByItem, GetLookupIndexByItem = GetLookupIndexByItem, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[ILookups]
  }
}

