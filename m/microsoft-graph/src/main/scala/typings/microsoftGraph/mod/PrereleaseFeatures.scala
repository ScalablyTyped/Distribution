package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.settingsOnly
  - typings.microsoftGraph.microsoftGraphStrings.settingsAndExperimentations
  - typings.microsoftGraph.microsoftGraphStrings.notAllowed
*/
trait PrereleaseFeatures extends js.Object

object PrereleaseFeatures {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notAllowed: typings.microsoftGraph.microsoftGraphStrings.notAllowed = this.cast("notAllowed")
  @scala.inline
  def settingsAndExperimentations: typings.microsoftGraph.microsoftGraphStrings.settingsAndExperimentations = this.cast("settingsAndExperimentations")
  @scala.inline
  def settingsOnly: typings.microsoftGraph.microsoftGraphStrings.settingsOnly = this.cast("settingsOnly")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

