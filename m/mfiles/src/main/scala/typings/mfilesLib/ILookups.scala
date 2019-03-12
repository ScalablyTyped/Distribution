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
    Add: (scala.Double, ILookup) => scala.Unit,
    Clone: () => ILookups,
    CloneFrom: ILookups => scala.Unit,
    Count: scala.Double,
    GetLookupByItem: scala.Double => ILookup,
    GetLookupIndexByItem: scala.Double => scala.Double,
    Item: scala.Double => ILookup,
    Remove: scala.Double => scala.Unit
  ): ILookups = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count, GetLookupByItem = js.Any.fromFunction1(GetLookupByItem), GetLookupIndexByItem = js.Any.fromFunction1(GetLookupIndexByItem), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[ILookups]
  }
}

