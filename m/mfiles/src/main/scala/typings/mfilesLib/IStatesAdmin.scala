package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatesAdmin extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, StateAdmin: IStateAdmin): scala.Unit
  def Item(Index: scala.Double): IStateAdmin
  def Remove(Index: scala.Double): scala.Unit
}

object IStatesAdmin {
  @scala.inline
  def apply(
    Add: (scala.Double, IStateAdmin) => scala.Unit,
    Count: scala.Double,
    Item: scala.Double => IStateAdmin,
    Remove: scala.Double => scala.Unit
  ): IStatesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IStatesAdmin]
  }
}

