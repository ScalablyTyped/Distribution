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
    Add: js.Function2[scala.Double, IStateAdmin, scala.Unit],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IStateAdmin],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IStatesAdmin = {
    val __obj = js.Dynamic.literal(Add = Add, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IStatesAdmin]
  }
}

