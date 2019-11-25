package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeGlobalRule
  - typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeIndividualRule
  - typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeDeviceRule
  - typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeUpgrade
  - typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeMailboxPolicy
  - typings.microsoftDashGraph.microsoftDashGraphStrings.other
  - typings.microsoftDashGraph.microsoftDashGraphStrings.compliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notCompliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notEnrolled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownLocation
  - typings.microsoftDashGraph.microsoftDashGraphStrings.mfaRequired
  - typings.microsoftDashGraph.microsoftDashGraphStrings.azureADBlockDueToAccessPolicy
  - typings.microsoftDashGraph.microsoftDashGraphStrings.compromisedPassword
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deviceNotKnownWithManagedApp
*/
trait DeviceManagementExchangeAccessStateReason extends js.Object

object DeviceManagementExchangeAccessStateReason {
  @scala.inline
  def azureADBlockDueToAccessPolicy: typings.microsoftDashGraph.microsoftDashGraphStrings.azureADBlockDueToAccessPolicy = this.cast("azureADBlockDueToAccessPolicy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typings.microsoftDashGraph.microsoftDashGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def compromisedPassword: typings.microsoftDashGraph.microsoftDashGraphStrings.compromisedPassword = this.cast("compromisedPassword")
  @scala.inline
  def deviceNotKnownWithManagedApp: typings.microsoftDashGraph.microsoftDashGraphStrings.deviceNotKnownWithManagedApp = this.cast("deviceNotKnownWithManagedApp")
  @scala.inline
  def exchangeDeviceRule: typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeDeviceRule = this.cast("exchangeDeviceRule")
  @scala.inline
  def exchangeGlobalRule: typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeGlobalRule = this.cast("exchangeGlobalRule")
  @scala.inline
  def exchangeIndividualRule: typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeIndividualRule = this.cast("exchangeIndividualRule")
  @scala.inline
  def exchangeMailboxPolicy: typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeMailboxPolicy = this.cast("exchangeMailboxPolicy")
  @scala.inline
  def exchangeUpgrade: typings.microsoftDashGraph.microsoftDashGraphStrings.exchangeUpgrade = this.cast("exchangeUpgrade")
  @scala.inline
  def mfaRequired: typings.microsoftDashGraph.microsoftDashGraphStrings.mfaRequired = this.cast("mfaRequired")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notCompliant: typings.microsoftDashGraph.microsoftDashGraphStrings.notCompliant = this.cast("notCompliant")
  @scala.inline
  def notEnrolled: typings.microsoftDashGraph.microsoftDashGraphStrings.notEnrolled = this.cast("notEnrolled")
  @scala.inline
  def other: typings.microsoftDashGraph.microsoftDashGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownLocation: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownLocation = this.cast("unknownLocation")
}

