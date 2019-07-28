package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookups extends js.Object {
  val Count: Double
  def Add(Index: Double, Lookup: ILookup): Unit
  def Clone(): ILookups
  def CloneFrom(Lookups: ILookups): Unit
  def GetLookupByItem(Item: Double): ILookup
  def GetLookupIndexByItem(Item: Double): Double
  def Item(Index: Double): ILookup
  def Remove(Index: Double): Unit
}

object ILookups {
  @scala.inline
  def apply(
    Add: (Double, ILookup) => Unit,
    Clone: () => ILookups,
    CloneFrom: ILookups => Unit,
    Count: Double,
    GetLookupByItem: Double => ILookup,
    GetLookupIndexByItem: Double => Double,
    Item: Double => ILookup,
    Remove: Double => Unit
  ): ILookups = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Count = Count, GetLookupByItem = js.Any.fromFunction1(GetLookupByItem), GetLookupIndexByItem = js.Any.fromFunction1(GetLookupIndexByItem), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[ILookups]
  }
}

