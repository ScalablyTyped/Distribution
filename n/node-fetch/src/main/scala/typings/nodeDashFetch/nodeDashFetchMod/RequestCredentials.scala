package typings.nodeDashFetch.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashFetch.nodeDashFetchStrings.omit
  - typings.nodeDashFetch.nodeDashFetchStrings.include
  - typings.nodeDashFetch.nodeDashFetchStrings.`same-origin`
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typings.nodeDashFetch.nodeDashFetchStrings.include = this.cast("include")
  @scala.inline
  def omit: typings.nodeDashFetch.nodeDashFetchStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typings.nodeDashFetch.nodeDashFetchStrings.`same-origin` = this.cast("same-origin")
}

