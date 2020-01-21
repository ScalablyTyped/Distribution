package typings.pizzip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pizzip.pizzipStrings.STORE
  - typings.pizzip.pizzipStrings.DEFLATE
*/
trait Compression extends js.Object

object Compression {
  @scala.inline
  def DEFLATE: typings.pizzip.pizzipStrings.DEFLATE = this.cast("DEFLATE")
  @scala.inline
  def STORE: typings.pizzip.pizzipStrings.STORE = this.cast("STORE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

