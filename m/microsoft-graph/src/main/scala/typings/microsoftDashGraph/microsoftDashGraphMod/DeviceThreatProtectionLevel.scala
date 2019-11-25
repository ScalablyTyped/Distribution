package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unavailable
  - typings.microsoftDashGraph.microsoftDashGraphStrings.secured
  - typings.microsoftDashGraph.microsoftDashGraphStrings.low
  - typings.microsoftDashGraph.microsoftDashGraphStrings.medium
  - typings.microsoftDashGraph.microsoftDashGraphStrings.high
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notSet
*/
trait DeviceThreatProtectionLevel extends js.Object

object DeviceThreatProtectionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftDashGraph.microsoftDashGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftDashGraph.microsoftDashGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.microsoftDashGraph.microsoftDashGraphStrings.medium = this.cast("medium")
  @scala.inline
  def notSet: typings.microsoftDashGraph.microsoftDashGraphStrings.notSet = this.cast("notSet")
  @scala.inline
  def secured: typings.microsoftDashGraph.microsoftDashGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unavailable: typings.microsoftDashGraph.microsoftDashGraphStrings.unavailable = this.cast("unavailable")
}

