package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notAllow
  - typings.microsoftGraph.microsoftGraphStrings.requireAtLeastOne
  - typings.microsoftGraph.microsoftGraphStrings.allow
*/
trait WindowsInformationProtectionPinCharacterRequirements extends js.Object

object WindowsInformationProtectionPinCharacterRequirements {
  @scala.inline
  def allow: typings.microsoftGraph.microsoftGraphStrings.allow = this.cast("allow")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notAllow: typings.microsoftGraph.microsoftGraphStrings.notAllow = this.cast("notAllow")
  @scala.inline
  def requireAtLeastOne: typings.microsoftGraph.microsoftGraphStrings.requireAtLeastOne = this.cast("requireAtLeastOne")
}

