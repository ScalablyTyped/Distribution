package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeFetch.nodeFetchStrings.omit
  - typings.nodeFetch.nodeFetchStrings.include
  - typings.nodeFetch.nodeFetchStrings.`same-origin`
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typings.nodeFetch.nodeFetchStrings.include = this.cast("include")
  @scala.inline
  def omit: typings.nodeFetch.nodeFetchStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typings.nodeFetch.nodeFetchStrings.`same-origin` = this.cast("same-origin")
}

