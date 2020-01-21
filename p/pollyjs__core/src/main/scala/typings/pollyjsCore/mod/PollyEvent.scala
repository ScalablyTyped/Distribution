package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pollyjsCore.pollyjsCoreStrings.create
  - typings.pollyjsCore.pollyjsCoreStrings.stop
  - typings.pollyjsCore.pollyjsCoreStrings.register
*/
trait PollyEvent extends js.Object

object PollyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.pollyjsCore.pollyjsCoreStrings.create = this.cast("create")
  @scala.inline
  def register: typings.pollyjsCore.pollyjsCoreStrings.register = this.cast("register")
  @scala.inline
  def stop: typings.pollyjsCore.pollyjsCoreStrings.stop = this.cast("stop")
}

