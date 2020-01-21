package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.exchangeGlobalRule
  - typings.microsoftGraph.microsoftGraphStrings.exchangeIndividualRule
  - typings.microsoftGraph.microsoftGraphStrings.exchangeDeviceRule
  - typings.microsoftGraph.microsoftGraphStrings.exchangeUpgrade
  - typings.microsoftGraph.microsoftGraphStrings.exchangeMailboxPolicy
  - typings.microsoftGraph.microsoftGraphStrings.other
  - typings.microsoftGraph.microsoftGraphStrings.compliant
  - typings.microsoftGraph.microsoftGraphStrings.notCompliant
  - typings.microsoftGraph.microsoftGraphStrings.notEnrolled
  - typings.microsoftGraph.microsoftGraphStrings.unknownLocation
  - typings.microsoftGraph.microsoftGraphStrings.mfaRequired
  - typings.microsoftGraph.microsoftGraphStrings.azureADBlockDueToAccessPolicy
  - typings.microsoftGraph.microsoftGraphStrings.compromisedPassword
  - typings.microsoftGraph.microsoftGraphStrings.deviceNotKnownWithManagedApp
*/
trait DeviceManagementExchangeAccessStateReason extends js.Object

object DeviceManagementExchangeAccessStateReason {
  @scala.inline
  def azureADBlockDueToAccessPolicy: typings.microsoftGraph.microsoftGraphStrings.azureADBlockDueToAccessPolicy = this.cast("azureADBlockDueToAccessPolicy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typings.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def compromisedPassword: typings.microsoftGraph.microsoftGraphStrings.compromisedPassword = this.cast("compromisedPassword")
  @scala.inline
  def deviceNotKnownWithManagedApp: typings.microsoftGraph.microsoftGraphStrings.deviceNotKnownWithManagedApp = this.cast("deviceNotKnownWithManagedApp")
  @scala.inline
  def exchangeDeviceRule: typings.microsoftGraph.microsoftGraphStrings.exchangeDeviceRule = this.cast("exchangeDeviceRule")
  @scala.inline
  def exchangeGlobalRule: typings.microsoftGraph.microsoftGraphStrings.exchangeGlobalRule = this.cast("exchangeGlobalRule")
  @scala.inline
  def exchangeIndividualRule: typings.microsoftGraph.microsoftGraphStrings.exchangeIndividualRule = this.cast("exchangeIndividualRule")
  @scala.inline
  def exchangeMailboxPolicy: typings.microsoftGraph.microsoftGraphStrings.exchangeMailboxPolicy = this.cast("exchangeMailboxPolicy")
  @scala.inline
  def exchangeUpgrade: typings.microsoftGraph.microsoftGraphStrings.exchangeUpgrade = this.cast("exchangeUpgrade")
  @scala.inline
  def mfaRequired: typings.microsoftGraph.microsoftGraphStrings.mfaRequired = this.cast("mfaRequired")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notCompliant: typings.microsoftGraph.microsoftGraphStrings.notCompliant = this.cast("notCompliant")
  @scala.inline
  def notEnrolled: typings.microsoftGraph.microsoftGraphStrings.notEnrolled = this.cast("notEnrolled")
  @scala.inline
  def other: typings.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownLocation: typings.microsoftGraph.microsoftGraphStrings.unknownLocation = this.cast("unknownLocation")
}

