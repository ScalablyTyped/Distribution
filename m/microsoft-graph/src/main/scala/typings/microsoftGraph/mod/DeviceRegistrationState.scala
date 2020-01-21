package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notRegistered
  - typings.microsoftGraph.microsoftGraphStrings.registered
  - typings.microsoftGraph.microsoftGraphStrings.revoked
  - typings.microsoftGraph.microsoftGraphStrings.keyConflict
  - typings.microsoftGraph.microsoftGraphStrings.approvalPending
  - typings.microsoftGraph.microsoftGraphStrings.certificateReset
  - typings.microsoftGraph.microsoftGraphStrings.notRegisteredPendingEnrollment
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait DeviceRegistrationState extends js.Object

object DeviceRegistrationState {
  @scala.inline
  def approvalPending: typings.microsoftGraph.microsoftGraphStrings.approvalPending = this.cast("approvalPending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certificateReset: typings.microsoftGraph.microsoftGraphStrings.certificateReset = this.cast("certificateReset")
  @scala.inline
  def keyConflict: typings.microsoftGraph.microsoftGraphStrings.keyConflict = this.cast("keyConflict")
  @scala.inline
  def notRegistered: typings.microsoftGraph.microsoftGraphStrings.notRegistered = this.cast("notRegistered")
  @scala.inline
  def notRegisteredPendingEnrollment: typings.microsoftGraph.microsoftGraphStrings.notRegisteredPendingEnrollment = this.cast("notRegisteredPendingEnrollment")
  @scala.inline
  def registered: typings.microsoftGraph.microsoftGraphStrings.registered = this.cast("registered")
  @scala.inline
  def revoked: typings.microsoftGraph.microsoftGraphStrings.revoked = this.cast("revoked")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

