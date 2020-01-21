package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.incoming
  - typings.microsoftGraph.microsoftGraphStrings.establishing
  - typings.microsoftGraph.microsoftGraphStrings.established
  - typings.microsoftGraph.microsoftGraphStrings.hold
  - typings.microsoftGraph.microsoftGraphStrings.transferring
  - typings.microsoftGraph.microsoftGraphStrings.transferAccepted
  - typings.microsoftGraph.microsoftGraphStrings.redirecting
  - typings.microsoftGraph.microsoftGraphStrings.terminating
  - typings.microsoftGraph.microsoftGraphStrings.terminated
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait CallState extends js.Object

object CallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def established: typings.microsoftGraph.microsoftGraphStrings.established = this.cast("established")
  @scala.inline
  def establishing: typings.microsoftGraph.microsoftGraphStrings.establishing = this.cast("establishing")
  @scala.inline
  def hold: typings.microsoftGraph.microsoftGraphStrings.hold = this.cast("hold")
  @scala.inline
  def incoming: typings.microsoftGraph.microsoftGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def redirecting: typings.microsoftGraph.microsoftGraphStrings.redirecting = this.cast("redirecting")
  @scala.inline
  def terminated: typings.microsoftGraph.microsoftGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def terminating: typings.microsoftGraph.microsoftGraphStrings.terminating = this.cast("terminating")
  @scala.inline
  def transferAccepted: typings.microsoftGraph.microsoftGraphStrings.transferAccepted = this.cast("transferAccepted")
  @scala.inline
  def transferring: typings.microsoftGraph.microsoftGraphStrings.transferring = this.cast("transferring")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

