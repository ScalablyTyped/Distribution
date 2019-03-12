package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransitions extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, StateTransition: IStateTransition): scala.Unit
  def Item(Index: scala.Double): IStateTransition
  def Remove(Index: scala.Double): scala.Unit
}

object IStateTransitions {
  @scala.inline
  def apply(
    Add: (scala.Double, IStateTransition) => scala.Unit,
    Count: scala.Double,
    Item: scala.Double => IStateTransition,
    Remove: scala.Double => scala.Unit
  ): IStateTransitions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IStateTransitions]
  }
}

