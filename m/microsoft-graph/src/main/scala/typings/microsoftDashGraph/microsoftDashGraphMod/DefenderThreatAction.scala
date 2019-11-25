package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault
  - typings.microsoftDashGraph.microsoftDashGraphStrings.clean
  - typings.microsoftDashGraph.microsoftDashGraphStrings.quarantine
  - typings.microsoftDashGraph.microsoftDashGraphStrings.remove
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allow
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.block
*/
trait DefenderThreatAction extends js.Object

object DefenderThreatAction {
  @scala.inline
  def allow: typings.microsoftDashGraph.microsoftDashGraphStrings.allow = this.cast("allow")
  @scala.inline
  def block: typings.microsoftDashGraph.microsoftDashGraphStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clean: typings.microsoftDashGraph.microsoftDashGraphStrings.clean = this.cast("clean")
  @scala.inline
  def deviceDefault: typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def quarantine: typings.microsoftDashGraph.microsoftDashGraphStrings.quarantine = this.cast("quarantine")
  @scala.inline
  def remove: typings.microsoftDashGraph.microsoftDashGraphStrings.remove = this.cast("remove")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

