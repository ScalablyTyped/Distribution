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
    Add: js.Function2[scala.Double, IStateTransition, scala.Unit],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IStateTransition],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IStateTransitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IStateTransitions]
  }
}

