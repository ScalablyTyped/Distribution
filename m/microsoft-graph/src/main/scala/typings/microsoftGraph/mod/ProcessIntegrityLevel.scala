package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.untrusted
  - typings.microsoftGraph.microsoftGraphStrings.low
  - typings.microsoftGraph.microsoftGraphStrings.medium
  - typings.microsoftGraph.microsoftGraphStrings.high
  - typings.microsoftGraph.microsoftGraphStrings.system
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ProcessIntegrityLevel extends js.Object

object ProcessIntegrityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def system: typings.microsoftGraph.microsoftGraphStrings.system = this.cast("system")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def untrusted: typings.microsoftGraph.microsoftGraphStrings.untrusted = this.cast("untrusted")
}

