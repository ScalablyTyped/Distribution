package typings.opentok.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.opentok.opentokStrings.composed
  - typings.opentok.opentokStrings.individual
*/
trait OutputMode extends js.Object

object OutputMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def composed: typings.opentok.opentokStrings.composed = this.cast("composed")
  @scala.inline
  def individual: typings.opentok.opentokStrings.individual = this.cast("individual")
}

