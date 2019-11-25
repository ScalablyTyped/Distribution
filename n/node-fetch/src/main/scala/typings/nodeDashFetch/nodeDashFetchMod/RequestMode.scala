package typings.nodeDashFetch.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashFetch.nodeDashFetchStrings.cors
  - typings.nodeDashFetch.nodeDashFetchStrings.`no-cors`
  - typings.nodeDashFetch.nodeDashFetchStrings.`same-origin`
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.nodeDashFetch.nodeDashFetchStrings.cors = this.cast("cors")
  @scala.inline
  def `no-cors`: typings.nodeDashFetch.nodeDashFetchStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typings.nodeDashFetch.nodeDashFetchStrings.`same-origin` = this.cast("same-origin")
}

