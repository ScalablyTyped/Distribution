package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.informational
  - typings.microsoftGraph.microsoftGraphStrings.low
  - typings.microsoftGraph.microsoftGraphStrings.medium
  - typings.microsoftGraph.microsoftGraphStrings.high
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertSeverity extends js.Object

object AlertSeverity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def informational: typings.microsoftGraph.microsoftGraphStrings.informational = this.cast("informational")
  @scala.inline
  def low: typings.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

