package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStates extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IState
}

object IStates {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, IState]): IStates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IStates]
  }
}

