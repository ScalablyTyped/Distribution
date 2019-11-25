package typings.nodeDashFetch.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashFetch.nodeDashFetchStrings.error
  - typings.nodeDashFetch.nodeDashFetchStrings.follow
  - typings.nodeDashFetch.nodeDashFetchStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.nodeDashFetch.nodeDashFetchStrings.error = this.cast("error")
  @scala.inline
  def follow: typings.nodeDashFetch.nodeDashFetchStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typings.nodeDashFetch.nodeDashFetchStrings.manual = this.cast("manual")
}

