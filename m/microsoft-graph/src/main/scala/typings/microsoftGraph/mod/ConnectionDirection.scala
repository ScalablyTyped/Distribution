package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.inbound
  - typings.microsoftGraph.microsoftGraphStrings.outbound
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConnectionDirection extends js.Object

object ConnectionDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound: typings.microsoftGraph.microsoftGraphStrings.inbound = this.cast("inbound")
  @scala.inline
  def outbound: typings.microsoftGraph.microsoftGraphStrings.outbound = this.cast("outbound")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

