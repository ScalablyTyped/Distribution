package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.sender
  - typings.microsoftGraph.microsoftGraphStrings.recipient
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EmailRole extends js.Object

object EmailRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def recipient: typings.microsoftGraph.microsoftGraphStrings.recipient = this.cast("recipient")
  @scala.inline
  def sender: typings.microsoftGraph.microsoftGraphStrings.sender = this.cast("sender")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

