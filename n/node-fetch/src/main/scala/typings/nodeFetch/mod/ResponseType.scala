package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeFetch.nodeFetchStrings.basic
  - typings.nodeFetch.nodeFetchStrings.cors
  - typings.nodeFetch.nodeFetchStrings.default
  - typings.nodeFetch.nodeFetchStrings.error
  - typings.nodeFetch.nodeFetchStrings.opaque
  - typings.nodeFetch.nodeFetchStrings.opaqueredirect
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def basic: typings.nodeFetch.nodeFetchStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.nodeFetch.nodeFetchStrings.cors = this.cast("cors")
  @scala.inline
  def default: typings.nodeFetch.nodeFetchStrings.default = this.cast("default")
  @scala.inline
  def error: typings.nodeFetch.nodeFetchStrings.error = this.cast("error")
  @scala.inline
  def opaque: typings.nodeFetch.nodeFetchStrings.opaque = this.cast("opaque")
  @scala.inline
  def opaqueredirect: typings.nodeFetch.nodeFetchStrings.opaqueredirect = this.cast("opaqueredirect")
}

