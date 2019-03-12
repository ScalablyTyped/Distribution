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
    Add: (scala.Double, IWorkflowAdmin) => scala.Unit,
    Count: scala.Double,
    Item: scala.Double => IWorkflowAdmin,
    Remove: scala.Double => scala.Unit
  ): IWorkflowsAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IWorkflowsAdmin]
  }
}

