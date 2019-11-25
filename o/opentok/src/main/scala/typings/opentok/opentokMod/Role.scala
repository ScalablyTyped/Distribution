package typings.opentok.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.opentok.opentokStrings.subscriber
  - typings.opentok.opentokStrings.publisher
  - typings.opentok.opentokStrings.moderator
*/
trait Role extends js.Object

object Role {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def moderator: typings.opentok.opentokStrings.moderator = this.cast("moderator")
  @scala.inline
  def publisher: typings.opentok.opentokStrings.publisher = this.cast("publisher")
  @scala.inline
  def subscriber: typings.opentok.opentokStrings.subscriber = this.cast("subscriber")
}

