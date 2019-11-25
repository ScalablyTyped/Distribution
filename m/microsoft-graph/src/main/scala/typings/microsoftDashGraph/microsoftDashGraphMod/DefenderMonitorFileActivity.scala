package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.disable
  - typings.microsoftDashGraph.microsoftDashGraphStrings.monitorAllFiles
  - typings.microsoftDashGraph.microsoftDashGraphStrings.monitorIncomingFilesOnly
  - typings.microsoftDashGraph.microsoftDashGraphStrings.monitorOutgoingFilesOnly
*/
trait DefenderMonitorFileActivity extends js.Object

object DefenderMonitorFileActivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typings.microsoftDashGraph.microsoftDashGraphStrings.disable = this.cast("disable")
  @scala.inline
  def monitorAllFiles: typings.microsoftDashGraph.microsoftDashGraphStrings.monitorAllFiles = this.cast("monitorAllFiles")
  @scala.inline
  def monitorIncomingFilesOnly: typings.microsoftDashGraph.microsoftDashGraphStrings.monitorIncomingFilesOnly = this.cast("monitorIncomingFilesOnly")
  @scala.inline
  def monitorOutgoingFilesOnly: typings.microsoftDashGraph.microsoftDashGraphStrings.monitorOutgoingFilesOnly = this.cast("monitorOutgoingFilesOnly")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

