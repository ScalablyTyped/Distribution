package typings.onoff.onoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.onoff.onoffStrings.in
  - typings.onoff.onoffStrings.out
  - typings.onoff.onoffStrings.high
  - typings.onoff.onoffStrings.low
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typings.onoff.onoffStrings.high = this.cast("high")
  @scala.inline
  def in: typings.onoff.onoffStrings.in = this.cast("in")
  @scala.inline
  def low: typings.onoff.onoffStrings.low = this.cast("low")
  @scala.inline
  def out: typings.onoff.onoffStrings.out = this.cast("out")
}

