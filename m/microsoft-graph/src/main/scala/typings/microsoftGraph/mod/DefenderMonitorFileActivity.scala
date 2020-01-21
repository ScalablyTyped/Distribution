package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.disable
  - typings.microsoftGraph.microsoftGraphStrings.monitorAllFiles
  - typings.microsoftGraph.microsoftGraphStrings.monitorIncomingFilesOnly
  - typings.microsoftGraph.microsoftGraphStrings.monitorOutgoingFilesOnly
*/
trait DefenderMonitorFileActivity extends js.Object

object DefenderMonitorFileActivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typings.microsoftGraph.microsoftGraphStrings.disable = this.cast("disable")
  @scala.inline
  def monitorAllFiles: typings.microsoftGraph.microsoftGraphStrings.monitorAllFiles = this.cast("monitorAllFiles")
  @scala.inline
  def monitorIncomingFilesOnly: typings.microsoftGraph.microsoftGraphStrings.monitorIncomingFilesOnly = this.cast("monitorIncomingFilesOnly")
  @scala.inline
  def monitorOutgoingFilesOnly: typings.microsoftGraph.microsoftGraphStrings.monitorOutgoingFilesOnly = this.cast("monitorOutgoingFilesOnly")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

