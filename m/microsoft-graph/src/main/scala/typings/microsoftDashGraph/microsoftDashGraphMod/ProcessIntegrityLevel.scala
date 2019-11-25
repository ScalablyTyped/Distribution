package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.untrusted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.low
  - typings.microsoftDashGraph.microsoftDashGraphStrings.medium
  - typings.microsoftDashGraph.microsoftDashGraphStrings.high
  - typings.microsoftDashGraph.microsoftDashGraphStrings.system
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait ProcessIntegrityLevel extends js.Object

object ProcessIntegrityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.microsoftDashGraph.microsoftDashGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typings.microsoftDashGraph.microsoftDashGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typings.microsoftDashGraph.microsoftDashGraphStrings.medium = this.cast("medium")
  @scala.inline
  def system: typings.microsoftDashGraph.microsoftDashGraphStrings.system = this.cast("system")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def untrusted: typings.microsoftDashGraph.microsoftDashGraphStrings.untrusted = this.cast("untrusted")
}

