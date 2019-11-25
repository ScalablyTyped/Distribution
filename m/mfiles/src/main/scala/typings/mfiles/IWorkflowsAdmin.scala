package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowsAdmin extends js.Object {
  val Count: Double
  def Add(Index: Double, WorkflowAdmin: IWorkflowAdmin): Unit
  def Item(Index: Double): IWorkflowAdmin
  def Remove(Index: Double): Unit
}

object IWorkflowsAdmin {
  @scala.inline
  def apply(
    Add: (Double, IWorkflowAdmin) => Unit,
    Count: Double,
    Item: Double => IWorkflowAdmin,
    Remove: Double => Unit
  ): IWorkflowsAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IWorkflowsAdmin]
  }
}

