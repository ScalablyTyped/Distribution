package typings.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.polyfillService.polyfillServiceStrings.gated
  - typings.polyfillService.polyfillServiceStrings.always
*/
trait PolyfillFlag extends js.Object

object PolyfillFlag {
  @scala.inline
  def always: typings.polyfillService.polyfillServiceStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gated: typings.polyfillService.polyfillServiceStrings.gated = this.cast("gated")
}

