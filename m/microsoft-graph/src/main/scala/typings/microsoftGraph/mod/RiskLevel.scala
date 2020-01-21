package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.low
  - typings.microsoftGraph.microsoftGraphStrings.medium
  - typings.microsoftGraph.microsoftGraphStrings.high
  - typings.microsoftGraph.microsoftGraphStrings.hidden
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskLevel extends js.Object

object RiskLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typings.microsoftGraph.microsoftGraphStrings.hidden = this.cast("hidden")
  @scala.inline
  def high: typings.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

