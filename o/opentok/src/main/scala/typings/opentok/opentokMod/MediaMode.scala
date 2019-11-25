package typings.opentok.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.opentok.opentokStrings.relayed
  - typings.opentok.opentokStrings.routed
*/
trait MediaMode extends js.Object

object MediaMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def relayed: typings.opentok.opentokStrings.relayed = this.cast("relayed")
  @scala.inline
  def routed: typings.opentok.opentokStrings.routed = this.cast("routed")
}

