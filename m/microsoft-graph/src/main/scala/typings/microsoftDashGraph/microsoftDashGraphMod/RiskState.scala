package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.confirmedSafe
  - typings.microsoftDashGraph.microsoftDashGraphStrings.remediated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.dismissed
  - typings.microsoftDashGraph.microsoftDashGraphStrings.atRisk
  - typings.microsoftDashGraph.microsoftDashGraphStrings.confirmedCompromised
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait RiskState extends js.Object

object RiskState {
  @scala.inline
  def atRisk: typings.microsoftDashGraph.microsoftDashGraphStrings.atRisk = this.cast("atRisk")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmedCompromised: typings.microsoftDashGraph.microsoftDashGraphStrings.confirmedCompromised = this.cast("confirmedCompromised")
  @scala.inline
  def confirmedSafe: typings.microsoftDashGraph.microsoftDashGraphStrings.confirmedSafe = this.cast("confirmedSafe")
  @scala.inline
  def dismissed: typings.microsoftDashGraph.microsoftDashGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def remediated: typings.microsoftDashGraph.microsoftDashGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

