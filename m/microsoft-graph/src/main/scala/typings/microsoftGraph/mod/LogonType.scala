package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.interactive
  - typings.microsoftGraph.microsoftGraphStrings.remoteInteractive
  - typings.microsoftGraph.microsoftGraphStrings.network
  - typings.microsoftGraph.microsoftGraphStrings.batch
  - typings.microsoftGraph.microsoftGraphStrings.service
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait LogonType extends js.Object

object LogonType {
  @scala.inline
  def batch: typings.microsoftGraph.microsoftGraphStrings.batch = this.cast("batch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interactive: typings.microsoftGraph.microsoftGraphStrings.interactive = this.cast("interactive")
  @scala.inline
  def network: typings.microsoftGraph.microsoftGraphStrings.network = this.cast("network")
  @scala.inline
  def remoteInteractive: typings.microsoftGraph.microsoftGraphStrings.remoteInteractive = this.cast("remoteInteractive")
  @scala.inline
  def service: typings.microsoftGraph.microsoftGraphStrings.service = this.cast("service")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

