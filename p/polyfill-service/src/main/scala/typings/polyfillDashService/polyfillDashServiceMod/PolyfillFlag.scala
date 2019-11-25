package typings.polyfillDashService.polyfillDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.polyfillDashService.polyfillDashServiceStrings.gated
  - typings.polyfillDashService.polyfillDashServiceStrings.always
*/
trait PolyfillFlag extends js.Object

object PolyfillFlag {
  @scala.inline
  def always: typings.polyfillDashService.polyfillDashServiceStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gated: typings.polyfillDashService.polyfillDashServiceStrings.gated = this.cast("gated")
}

