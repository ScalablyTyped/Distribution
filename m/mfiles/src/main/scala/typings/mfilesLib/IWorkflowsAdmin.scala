package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowsAdmin extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, WorkflowAdmin: IWorkflowAdmin): scala.Unit
  def Item(Index: scala.Double): IWorkflowAdmin
  def Remove(Index: scala.Double): scala.Unit
}

object IWorkflowsAdmin {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IWorkflowAdmin, scala.Unit],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IWorkflowAdmin],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IWorkflowsAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IWorkflowsAdmin]
  }
}

