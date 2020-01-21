package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.NotStarted
  - typings.microsoftGraph.microsoftGraphStrings.Running
  - typings.microsoftGraph.microsoftGraphStrings.Completed
  - typings.microsoftGraph.microsoftGraphStrings.Failed
*/
trait OperationStatus extends js.Object

object OperationStatus {
  @scala.inline
  def Completed: typings.microsoftGraph.microsoftGraphStrings.Completed = this.cast("Completed")
  @scala.inline
  def Failed: typings.microsoftGraph.microsoftGraphStrings.Failed = this.cast("Failed")
  @scala.inline
  def NotStarted: typings.microsoftGraph.microsoftGraphStrings.NotStarted = this.cast("NotStarted")
  @scala.inline
  def Running: typings.microsoftGraph.microsoftGraphStrings.Running = this.cast("Running")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

