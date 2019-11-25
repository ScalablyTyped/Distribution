package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.NotStarted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.Running
  - typings.microsoftDashGraph.microsoftDashGraphStrings.Completed
  - typings.microsoftDashGraph.microsoftDashGraphStrings.Failed
*/
trait OperationStatus extends js.Object

object OperationStatus {
  @scala.inline
  def Completed: typings.microsoftDashGraph.microsoftDashGraphStrings.Completed = this.cast("Completed")
  @scala.inline
  def Failed: typings.microsoftDashGraph.microsoftDashGraphStrings.Failed = this.cast("Failed")
  @scala.inline
  def NotStarted: typings.microsoftDashGraph.microsoftDashGraphStrings.NotStarted = this.cast("NotStarted")
  @scala.inline
  def Running: typings.microsoftDashGraph.microsoftDashGraphStrings.Running = this.cast("Running")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

