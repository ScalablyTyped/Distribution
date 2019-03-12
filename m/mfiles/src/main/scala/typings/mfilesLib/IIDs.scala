package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIDs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ID: scala.Double): scala.Unit
  def Clone(): IIDs
  def IndexOf(ID: scala.Double): scala.Double
  def Item(Index: scala.Double): scala.Double
  def Remove(Index: scala.Double): scala.Unit
  def RemoveAll(ID: scala.Double): scala.Double
}

object IIDs {
  @scala.inline
  def apply(
    Add: (scala.Double, scala.Double) => scala.Unit,
    Clone: () => IIDs,
    Count: scala.Double,
    IndexOf: scala.Double => scala.Double,
    Item: scala.Double => scala.Double,
    Remove: scala.Double => scala.Unit,
    RemoveAll: scala.Double => scala.Double
  ): IIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, IndexOf = js.Any.fromFunction1(IndexOf), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), RemoveAll = js.Any.fromFunction1(RemoveAll))
  
    __obj.asInstanceOf[IIDs]
  }
}

