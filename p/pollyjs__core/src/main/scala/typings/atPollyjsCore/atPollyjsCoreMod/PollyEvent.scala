package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPollyjsCore.atPollyjsCoreStrings.create
  - typings.atPollyjsCore.atPollyjsCoreStrings.stop
  - typings.atPollyjsCore.atPollyjsCoreStrings.register
*/
trait PollyEvent extends js.Object

object PollyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.atPollyjsCore.atPollyjsCoreStrings.create = this.cast("create")
  @scala.inline
  def register: typings.atPollyjsCore.atPollyjsCoreStrings.register = this.cast("register")
  @scala.inline
  def stop: typings.atPollyjsCore.atPollyjsCoreStrings.stop = this.cast("stop")
}

