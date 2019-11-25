package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.medium
  - typings.microsoftDashGraph.microsoftDashGraphStrings.mediumHigh
  - typings.microsoftDashGraph.microsoftDashGraphStrings.high
*/
trait InternetSiteSecurityLevel extends js.Object

object InternetSiteSecurityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftDashGraph.microsoftDashGraphStrings.high = this.cast("high")
  @scala.inline
  def medium: typings.microsoftDashGraph.microsoftDashGraphStrings.medium = this.cast("medium")
  @scala.inline
  def mediumHigh: typings.microsoftDashGraph.microsoftDashGraphStrings.mediumHigh = this.cast("mediumHigh")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

