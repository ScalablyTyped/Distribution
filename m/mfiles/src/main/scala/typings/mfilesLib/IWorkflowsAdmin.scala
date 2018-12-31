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

