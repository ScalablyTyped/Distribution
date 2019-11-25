package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.settingsOnly
  - typings.microsoftDashGraph.microsoftDashGraphStrings.settingsAndExperimentations
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notAllowed
*/
trait PrereleaseFeatures extends js.Object

object PrereleaseFeatures {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notAllowed: typings.microsoftDashGraph.microsoftDashGraphStrings.notAllowed = this.cast("notAllowed")
  @scala.inline
  def settingsAndExperimentations: typings.microsoftDashGraph.microsoftDashGraphStrings.settingsAndExperimentations = this.cast("settingsAndExperimentations")
  @scala.inline
  def settingsOnly: typings.microsoftDashGraph.microsoftDashGraphStrings.settingsOnly = this.cast("settingsOnly")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

