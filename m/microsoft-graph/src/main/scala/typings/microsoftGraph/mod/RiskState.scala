package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.confirmedSafe
  - typings.microsoftGraph.microsoftGraphStrings.remediated
  - typings.microsoftGraph.microsoftGraphStrings.dismissed
  - typings.microsoftGraph.microsoftGraphStrings.atRisk
  - typings.microsoftGraph.microsoftGraphStrings.confirmedCompromised
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskState extends js.Object

object RiskState {
  @scala.inline
  def atRisk: typings.microsoftGraph.microsoftGraphStrings.atRisk = this.cast("atRisk")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmedCompromised: typings.microsoftGraph.microsoftGraphStrings.confirmedCompromised = this.cast("confirmedCompromised")
  @scala.inline
  def confirmedSafe: typings.microsoftGraph.microsoftGraphStrings.confirmedSafe = this.cast("confirmedSafe")
  @scala.inline
  def dismissed: typings.microsoftGraph.microsoftGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def remediated: typings.microsoftGraph.microsoftGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

