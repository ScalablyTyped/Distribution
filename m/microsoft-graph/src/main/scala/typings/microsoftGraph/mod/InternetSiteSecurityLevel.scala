package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.medium
  - typings.microsoftGraph.microsoftGraphStrings.mediumHigh
  - typings.microsoftGraph.microsoftGraphStrings.high
*/
trait InternetSiteSecurityLevel extends js.Object

object InternetSiteSecurityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def medium: typings.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def mediumHigh: typings.microsoftGraph.microsoftGraphStrings.mediumHigh = this.cast("mediumHigh")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

