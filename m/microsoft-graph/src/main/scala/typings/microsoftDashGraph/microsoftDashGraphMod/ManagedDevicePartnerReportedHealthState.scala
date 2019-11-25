package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.activated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deactivated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.secured
  - typings.microsoftDashGraph.microsoftDashGraphStrings.lowSeverity
  - typings.microsoftDashGraph.microsoftDashGraphStrings.mediumSeverity
  - typings.microsoftDashGraph.microsoftDashGraphStrings.highSeverity
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unresponsive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.compromised
  - typings.microsoftDashGraph.microsoftDashGraphStrings.misconfigured
*/
trait ManagedDevicePartnerReportedHealthState extends js.Object

object ManagedDevicePartnerReportedHealthState {
  @scala.inline
  def activated: typings.microsoftDashGraph.microsoftDashGraphStrings.activated = this.cast("activated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compromised: typings.microsoftDashGraph.microsoftDashGraphStrings.compromised = this.cast("compromised")
  @scala.inline
  def deactivated: typings.microsoftDashGraph.microsoftDashGraphStrings.deactivated = this.cast("deactivated")
  @scala.inline
  def highSeverity: typings.microsoftDashGraph.microsoftDashGraphStrings.highSeverity = this.cast("highSeverity")
  @scala.inline
  def lowSeverity: typings.microsoftDashGraph.microsoftDashGraphStrings.lowSeverity = this.cast("lowSeverity")
  @scala.inline
  def mediumSeverity: typings.microsoftDashGraph.microsoftDashGraphStrings.mediumSeverity = this.cast("mediumSeverity")
  @scala.inline
  def misconfigured: typings.microsoftDashGraph.microsoftDashGraphStrings.misconfigured = this.cast("misconfigured")
  @scala.inline
  def secured: typings.microsoftDashGraph.microsoftDashGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typings.microsoftDashGraph.microsoftDashGraphStrings.unresponsive = this.cast("unresponsive")
}

