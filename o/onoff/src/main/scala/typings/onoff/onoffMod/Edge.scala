package typings.onoff.onoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.onoff.onoffStrings.none
  - typings.onoff.onoffStrings.rising
  - typings.onoff.onoffStrings.falling
  - typings.onoff.onoffStrings.both
*/
trait Edge extends js.Object

object Edge {
  @scala.inline
  def both: typings.onoff.onoffStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def falling: typings.onoff.onoffStrings.falling = this.cast("falling")
  @scala.inline
  def none: typings.onoff.onoffStrings.none = this.cast("none")
  @scala.inline
  def rising: typings.onoff.onoffStrings.rising = this.cast("rising")
}

