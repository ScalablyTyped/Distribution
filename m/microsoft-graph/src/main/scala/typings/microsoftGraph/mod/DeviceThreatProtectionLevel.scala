package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unavailable
  - typings.microsoftGraph.microsoftGraphStrings.secured
  - typings.microsoftGraph.microsoftGraphStrings.low
  - typings.microsoftGraph.microsoftGraphStrings.medium
  - typings.microsoftGraph.microsoftGraphStrings.high
  - typings.microsoftGraph.microsoftGraphStrings.notSet
*/
trait DeviceThreatProtectionLevel extends js.Object

object DeviceThreatProtectionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def notSet: typings.microsoftGraph.microsoftGraphStrings.notSet = this.cast("notSet")
  @scala.inline
  def secured: typings.microsoftGraph.microsoftGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unavailable: typings.microsoftGraph.microsoftGraphStrings.unavailable = this.cast("unavailable")
}

