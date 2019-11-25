package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.interactive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.remoteInteractive
  - typings.microsoftDashGraph.microsoftDashGraphStrings.network
  - typings.microsoftDashGraph.microsoftDashGraphStrings.batch
  - typings.microsoftDashGraph.microsoftDashGraphStrings.service
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait LogonType extends js.Object

object LogonType {
  @scala.inline
  def batch: typings.microsoftDashGraph.microsoftDashGraphStrings.batch = this.cast("batch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interactive: typings.microsoftDashGraph.microsoftDashGraphStrings.interactive = this.cast("interactive")
  @scala.inline
  def network: typings.microsoftDashGraph.microsoftDashGraphStrings.network = this.cast("network")
  @scala.inline
  def remoteInteractive: typings.microsoftDashGraph.microsoftDashGraphStrings.remoteInteractive = this.cast("remoteInteractive")
  @scala.inline
  def service: typings.microsoftDashGraph.microsoftDashGraphStrings.service = this.cast("service")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

