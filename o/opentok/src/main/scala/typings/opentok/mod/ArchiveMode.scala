package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.opentok.opentokStrings.manual
  - typings.opentok.opentokStrings.always
*/
trait ArchiveMode extends js.Object

object ArchiveMode {
  @scala.inline
  def always: typings.opentok.opentokStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typings.opentok.opentokStrings.manual = this.cast("manual")
}

