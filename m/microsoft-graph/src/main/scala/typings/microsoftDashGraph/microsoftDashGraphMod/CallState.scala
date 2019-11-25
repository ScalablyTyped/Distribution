package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.incoming
  - typings.microsoftDashGraph.microsoftDashGraphStrings.establishing
  - typings.microsoftDashGraph.microsoftDashGraphStrings.established
  - typings.microsoftDashGraph.microsoftDashGraphStrings.hold
  - typings.microsoftDashGraph.microsoftDashGraphStrings.transferring
  - typings.microsoftDashGraph.microsoftDashGraphStrings.transferAccepted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.redirecting
  - typings.microsoftDashGraph.microsoftDashGraphStrings.terminating
  - typings.microsoftDashGraph.microsoftDashGraphStrings.terminated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait CallState extends js.Object

object CallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def established: typings.microsoftDashGraph.microsoftDashGraphStrings.established = this.cast("established")
  @scala.inline
  def establishing: typings.microsoftDashGraph.microsoftDashGraphStrings.establishing = this.cast("establishing")
  @scala.inline
  def hold: typings.microsoftDashGraph.microsoftDashGraphStrings.hold = this.cast("hold")
  @scala.inline
  def incoming: typings.microsoftDashGraph.microsoftDashGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def redirecting: typings.microsoftDashGraph.microsoftDashGraphStrings.redirecting = this.cast("redirecting")
  @scala.inline
  def terminated: typings.microsoftDashGraph.microsoftDashGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def terminating: typings.microsoftDashGraph.microsoftDashGraphStrings.terminating = this.cast("terminating")
  @scala.inline
  def transferAccepted: typings.microsoftDashGraph.microsoftDashGraphStrings.transferAccepted = this.cast("transferAccepted")
  @scala.inline
  def transferring: typings.microsoftDashGraph.microsoftDashGraphStrings.transferring = this.cast("transferring")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

