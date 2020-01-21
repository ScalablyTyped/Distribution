package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.default
  - typings.microsoftGraph.microsoftGraphStrings.bing
*/
trait EdgeSearchEngineType extends js.Object

object EdgeSearchEngineType {
  @scala.inline
  def bing: typings.microsoftGraph.microsoftGraphStrings.bing = this.cast("bing")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.microsoftGraph.microsoftGraphStrings.default = this.cast("default")
}

