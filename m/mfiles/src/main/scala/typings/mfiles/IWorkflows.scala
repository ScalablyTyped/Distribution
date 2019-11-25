package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflows extends js.Object {
  val Count: Double
  def Item(Index: Double): IWorkflow
}

object IWorkflows {
  @scala.inline
  def apply(Count: Double, Item: Double => IWorkflow): IWorkflows = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IWorkflows]
  }
}

