package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.low
  - typings.microsoftDashGraph.microsoftDashGraphStrings.medium
  - typings.microsoftDashGraph.microsoftDashGraphStrings.high
  - typings.microsoftDashGraph.microsoftDashGraphStrings.hidden
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait RiskLevel extends js.Object

object RiskLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typings.microsoftDashGraph.microsoftDashGraphStrings.hidden = this.cast("hidden")
  @scala.inline
  def high: typings.microsoftDashGraph.microsoftDashGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftDashGraph.microsoftDashGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.microsoftDashGraph.microsoftDashGraphStrings.medium = this.cast("medium")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

