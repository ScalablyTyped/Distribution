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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetLookupByItem")(GetLookupByItem)
    __obj.updateDynamic("GetLookupIndexByItem")(GetLookupIndexByItem)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[ILookups]
  }
}

