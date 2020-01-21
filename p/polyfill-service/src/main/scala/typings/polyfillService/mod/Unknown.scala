package typings.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.polyfillService.polyfillServiceStrings.polyfill
  - typings.polyfillService.polyfillServiceStrings.ignore
*/
trait Unknown extends js.Object

object Unknown {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ignore: typings.polyfillService.polyfillServiceStrings.ignore = this.cast("ignore")
  @scala.inline
  def polyfill: typings.polyfillService.polyfillServiceStrings.polyfill = this.cast("polyfill")
}

