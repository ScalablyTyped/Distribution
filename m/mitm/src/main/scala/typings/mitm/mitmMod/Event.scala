package typings.mitm.mitmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mitm.mitmStrings.connect
  - typings.mitm.mitmStrings.connection
  - typings.mitm.mitmStrings.request
*/
trait Event extends js.Object

object Event {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connect: typings.mitm.mitmStrings.connect = this.cast("connect")
  @scala.inline
  def connection: typings.mitm.mitmStrings.connection = this.cast("connection")
  @scala.inline
  def request: typings.mitm.mitmStrings.request = this.cast("request")
}

