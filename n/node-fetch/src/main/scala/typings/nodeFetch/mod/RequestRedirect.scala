package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeFetch.nodeFetchStrings.error
  - typings.nodeFetch.nodeFetchStrings.follow
  - typings.nodeFetch.nodeFetchStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.nodeFetch.nodeFetchStrings.error = this.cast("error")
  @scala.inline
  def follow: typings.nodeFetch.nodeFetchStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typings.nodeFetch.nodeFetchStrings.manual = this.cast("manual")
}

