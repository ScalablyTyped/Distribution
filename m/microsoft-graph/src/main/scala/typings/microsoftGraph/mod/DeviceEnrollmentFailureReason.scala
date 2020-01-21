package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.authentication
  - typings.microsoftGraph.microsoftGraphStrings.authorization
  - typings.microsoftGraph.microsoftGraphStrings.accountValidation
  - typings.microsoftGraph.microsoftGraphStrings.userValidation
  - typings.microsoftGraph.microsoftGraphStrings.deviceNotSupported
  - typings.microsoftGraph.microsoftGraphStrings.inMaintenance
  - typings.microsoftGraph.microsoftGraphStrings.badRequest
  - typings.microsoftGraph.microsoftGraphStrings.featureNotSupported
  - typings.microsoftGraph.microsoftGraphStrings.enrollmentRestrictionsEnforced
  - typings.microsoftGraph.microsoftGraphStrings.clientDisconnected
  - typings.microsoftGraph.microsoftGraphStrings.userAbandonment
*/
trait DeviceEnrollmentFailureReason extends js.Object

object DeviceEnrollmentFailureReason {
  @scala.inline
  def accountValidation: typings.microsoftGraph.microsoftGraphStrings.accountValidation = this.cast("accountValidation")
  @scala.inline
  def authentication: typings.microsoftGraph.microsoftGraphStrings.authentication = this.cast("authentication")
  @scala.inline
  def authorization: typings.microsoftGraph.microsoftGraphStrings.authorization = this.cast("authorization")
  @scala.inline
  def badRequest: typings.microsoftGraph.microsoftGraphStrings.badRequest = this.cast("badRequest")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clientDisconnected: typings.microsoftGraph.microsoftGraphStrings.clientDisconnected = this.cast("clientDisconnected")
  @scala.inline
  def deviceNotSupported: typings.microsoftGraph.microsoftGraphStrings.deviceNotSupported = this.cast("deviceNotSupported")
  @scala.inline
  def enrollmentRestrictionsEnforced: typings.microsoftGraph.microsoftGraphStrings.enrollmentRestrictionsEnforced = this.cast("enrollmentRestrictionsEnforced")
  @scala.inline
  def featureNotSupported: typings.microsoftGraph.microsoftGraphStrings.featureNotSupported = this.cast("featureNotSupported")
  @scala.inline
  def inMaintenance: typings.microsoftGraph.microsoftGraphStrings.inMaintenance = this.cast("inMaintenance")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def userAbandonment: typings.microsoftGraph.microsoftGraphStrings.userAbandonment = this.cast("userAbandonment")
  @scala.inline
  def userValidation: typings.microsoftGraph.microsoftGraphStrings.userValidation = this.cast("userValidation")
}

