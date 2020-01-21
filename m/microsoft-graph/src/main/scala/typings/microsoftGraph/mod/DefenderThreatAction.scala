package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typings.microsoftGraph.microsoftGraphStrings.clean
  - typings.microsoftGraph.microsoftGraphStrings.quarantine
  - typings.microsoftGraph.microsoftGraphStrings.remove
  - typings.microsoftGraph.microsoftGraphStrings.allow
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.block
*/
trait DefenderThreatAction extends js.Object

object DefenderThreatAction {
  @scala.inline
  def allow: typings.microsoftGraph.microsoftGraphStrings.allow = this.cast("allow")
  @scala.inline
  def block: typings.microsoftGraph.microsoftGraphStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clean: typings.microsoftGraph.microsoftGraphStrings.clean = this.cast("clean")
  @scala.inline
  def deviceDefault: typings.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def quarantine: typings.microsoftGraph.microsoftGraphStrings.quarantine = this.cast("quarantine")
  @scala.inline
  def remove: typings.microsoftGraph.microsoftGraphStrings.remove = this.cast("remove")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

