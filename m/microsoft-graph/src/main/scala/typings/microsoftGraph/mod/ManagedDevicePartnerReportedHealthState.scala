package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.activated
  - typings.microsoftGraph.microsoftGraphStrings.deactivated
  - typings.microsoftGraph.microsoftGraphStrings.secured
  - typings.microsoftGraph.microsoftGraphStrings.lowSeverity
  - typings.microsoftGraph.microsoftGraphStrings.mediumSeverity
  - typings.microsoftGraph.microsoftGraphStrings.highSeverity
  - typings.microsoftGraph.microsoftGraphStrings.unresponsive
  - typings.microsoftGraph.microsoftGraphStrings.compromised
  - typings.microsoftGraph.microsoftGraphStrings.misconfigured
*/
trait ManagedDevicePartnerReportedHealthState extends js.Object

object ManagedDevicePartnerReportedHealthState {
  @scala.inline
  def activated: typings.microsoftGraph.microsoftGraphStrings.activated = this.cast("activated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compromised: typings.microsoftGraph.microsoftGraphStrings.compromised = this.cast("compromised")
  @scala.inline
  def deactivated: typings.microsoftGraph.microsoftGraphStrings.deactivated = this.cast("deactivated")
  @scala.inline
  def highSeverity: typings.microsoftGraph.microsoftGraphStrings.highSeverity = this.cast("highSeverity")
  @scala.inline
  def lowSeverity: typings.microsoftGraph.microsoftGraphStrings.lowSeverity = this.cast("lowSeverity")
  @scala.inline
  def mediumSeverity: typings.microsoftGraph.microsoftGraphStrings.mediumSeverity = this.cast("mediumSeverity")
  @scala.inline
  def misconfigured: typings.microsoftGraph.microsoftGraphStrings.misconfigured = this.cast("misconfigured")
  @scala.inline
  def secured: typings.microsoftGraph.microsoftGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typings.microsoftGraph.microsoftGraphStrings.unresponsive = this.cast("unresponsive")
}

