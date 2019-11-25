package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.authentication
  - typings.microsoftDashGraph.microsoftDashGraphStrings.authorization
  - typings.microsoftDashGraph.microsoftDashGraphStrings.accountValidation
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userValidation
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deviceNotSupported
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inMaintenance
  - typings.microsoftDashGraph.microsoftDashGraphStrings.badRequest
  - typings.microsoftDashGraph.microsoftDashGraphStrings.featureNotSupported
  - typings.microsoftDashGraph.microsoftDashGraphStrings.enrollmentRestrictionsEnforced
  - typings.microsoftDashGraph.microsoftDashGraphStrings.clientDisconnected
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userAbandonment
*/
trait DeviceEnrollmentFailureReason extends js.Object

object DeviceEnrollmentFailureReason {
  @scala.inline
  def accountValidation: typings.microsoftDashGraph.microsoftDashGraphStrings.accountValidation = this.cast("accountValidation")
  @scala.inline
  def authentication: typings.microsoftDashGraph.microsoftDashGraphStrings.authentication = this.cast("authentication")
  @scala.inline
  def authorization: typings.microsoftDashGraph.microsoftDashGraphStrings.authorization = this.cast("authorization")
  @scala.inline
  def badRequest: typings.microsoftDashGraph.microsoftDashGraphStrings.badRequest = this.cast("badRequest")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clientDisconnected: typings.microsoftDashGraph.microsoftDashGraphStrings.clientDisconnected = this.cast("clientDisconnected")
  @scala.inline
  def deviceNotSupported: typings.microsoftDashGraph.microsoftDashGraphStrings.deviceNotSupported = this.cast("deviceNotSupported")
  @scala.inline
  def enrollmentRestrictionsEnforced: typings.microsoftDashGraph.microsoftDashGraphStrings.enrollmentRestrictionsEnforced = this.cast("enrollmentRestrictionsEnforced")
  @scala.inline
  def featureNotSupported: typings.microsoftDashGraph.microsoftDashGraphStrings.featureNotSupported = this.cast("featureNotSupported")
  @scala.inline
  def inMaintenance: typings.microsoftDashGraph.microsoftDashGraphStrings.inMaintenance = this.cast("inMaintenance")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def userAbandonment: typings.microsoftDashGraph.microsoftDashGraphStrings.userAbandonment = this.cast("userAbandonment")
  @scala.inline
  def userValidation: typings.microsoftDashGraph.microsoftDashGraphStrings.userValidation = this.cast("userValidation")
}

