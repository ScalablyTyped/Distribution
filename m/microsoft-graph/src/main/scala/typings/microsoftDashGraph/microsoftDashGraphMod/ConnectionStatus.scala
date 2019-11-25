package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.attempted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.succeeded
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blocked
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def attempted: typings.microsoftDashGraph.microsoftDashGraphStrings.attempted = this.cast("attempted")
  @scala.inline
  def blocked: typings.microsoftDashGraph.microsoftDashGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def succeeded: typings.microsoftDashGraph.microsoftDashGraphStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

