package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.invalid
  - typings.microsoftGraph.microsoftGraphStrings.cloneTeam
  - typings.microsoftGraph.microsoftGraphStrings.archiveTeam
  - typings.microsoftGraph.microsoftGraphStrings.unarchiveTeam
  - typings.microsoftGraph.microsoftGraphStrings.createTeam
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait TeamsAsyncOperationType extends js.Object

object TeamsAsyncOperationType {
  @scala.inline
  def archiveTeam: typings.microsoftGraph.microsoftGraphStrings.archiveTeam = this.cast("archiveTeam")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cloneTeam: typings.microsoftGraph.microsoftGraphStrings.cloneTeam = this.cast("cloneTeam")
  @scala.inline
  def createTeam: typings.microsoftGraph.microsoftGraphStrings.createTeam = this.cast("createTeam")
  @scala.inline
  def invalid: typings.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def unarchiveTeam: typings.microsoftGraph.microsoftGraphStrings.unarchiveTeam = this.cast("unarchiveTeam")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

