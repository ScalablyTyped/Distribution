package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeFetch.nodeFetchStrings.default
  - typings.nodeFetch.nodeFetchStrings.`force-cache`
  - typings.nodeFetch.nodeFetchStrings.`no-cache`
  - typings.nodeFetch.nodeFetchStrings.`no-store`
  - typings.nodeFetch.nodeFetchStrings.`only-if-cached`
  - typings.nodeFetch.nodeFetchStrings.reload
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.nodeFetch.nodeFetchStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typings.nodeFetch.nodeFetchStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typings.nodeFetch.nodeFetchStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typings.nodeFetch.nodeFetchStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typings.nodeFetch.nodeFetchStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typings.nodeFetch.nodeFetchStrings.reload = this.cast("reload")
}

