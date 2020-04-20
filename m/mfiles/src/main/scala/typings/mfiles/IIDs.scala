package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDs extends js.Object {
  val Count: Double
  def Add(Index: Double, ID: Double): Unit
  def Clone(): IIDs
  def IndexOf(ID: Double): Double
  def Item(Index: Double): Double
  def Remove(Index: Double): Unit
  def RemoveAll(ID: Double): Double
}

object IIDs {
  @scala.inline
  def apply(
    Add: (Double, Double) => Unit,
    Clone: () => IIDs,
    Count: Double,
    IndexOf: Double => Double,
    Item: Double => Double,
    Remove: Double => Unit,
    RemoveAll: Double => Double
  ): IIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], IndexOf = js.Any.fromFunction1(IndexOf), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction1(RemoveAll))
    __obj.asInstanceOf[IIDs]
  }
}

