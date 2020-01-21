package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeFetch.nodeFetchStrings.cors
  - typings.nodeFetch.nodeFetchStrings.`no-cors`
  - typings.nodeFetch.nodeFetchStrings.`same-origin`
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.nodeFetch.nodeFetchStrings.cors = this.cast("cors")
  @scala.inline
  def `no-cors`: typings.nodeFetch.nodeFetchStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typings.nodeFetch.nodeFetchStrings.`same-origin` = this.cast("same-origin")
}

