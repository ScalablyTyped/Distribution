package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.adminGeneratedTemporaryPassword
  - typings.microsoftGraph.microsoftGraphStrings.userPerformedSecuredPasswordChange
  - typings.microsoftGraph.microsoftGraphStrings.userPerformedSecuredPasswordReset
  - typings.microsoftGraph.microsoftGraphStrings.adminConfirmedSigninSafe
  - typings.microsoftGraph.microsoftGraphStrings.aiConfirmedSigninSafe
  - typings.microsoftGraph.microsoftGraphStrings.userPassedMFADrivenByRiskBasedPolicy
  - typings.microsoftGraph.microsoftGraphStrings.adminDismissedAllRiskForUser
  - typings.microsoftGraph.microsoftGraphStrings.adminConfirmedSigninCompromised
  - typings.microsoftGraph.microsoftGraphStrings.hidden
  - typings.microsoftGraph.microsoftGraphStrings.adminConfirmedUserCompromised
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskDetail extends js.Object

object RiskDetail {
  @scala.inline
  def adminConfirmedSigninCompromised: typings.microsoftGraph.microsoftGraphStrings.adminConfirmedSigninCompromised = this.cast("adminConfirmedSigninCompromised")
  @scala.inline
  def adminConfirmedSigninSafe: typings.microsoftGraph.microsoftGraphStrings.adminConfirmedSigninSafe = this.cast("adminConfirmedSigninSafe")
  @scala.inline
  def adminConfirmedUserCompromised: typings.microsoftGraph.microsoftGraphStrings.adminConfirmedUserCompromised = this.cast("adminConfirmedUserCompromised")
  @scala.inline
  def adminDismissedAllRiskForUser: typings.microsoftGraph.microsoftGraphStrings.adminDismissedAllRiskForUser = this.cast("adminDismissedAllRiskForUser")
  @scala.inline
  def adminGeneratedTemporaryPassword: typings.microsoftGraph.microsoftGraphStrings.adminGeneratedTemporaryPassword = this.cast("adminGeneratedTemporaryPassword")
  @scala.inline
  def aiConfirmedSigninSafe: typings.microsoftGraph.microsoftGraphStrings.aiConfirmedSigninSafe = this.cast("aiConfirmedSigninSafe")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typings.microsoftGraph.microsoftGraphStrings.hidden = this.cast("hidden")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def userPassedMFADrivenByRiskBasedPolicy: typings.microsoftGraph.microsoftGraphStrings.userPassedMFADrivenByRiskBasedPolicy = this.cast("userPassedMFADrivenByRiskBasedPolicy")
  @scala.inline
  def userPerformedSecuredPasswordChange: typings.microsoftGraph.microsoftGraphStrings.userPerformedSecuredPasswordChange = this.cast("userPerformedSecuredPasswordChange")
  @scala.inline
  def userPerformedSecuredPasswordReset: typings.microsoftGraph.microsoftGraphStrings.userPerformedSecuredPasswordReset = this.cast("userPerformedSecuredPasswordReset")
}

