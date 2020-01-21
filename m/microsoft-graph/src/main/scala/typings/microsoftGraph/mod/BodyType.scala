package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.text
  - typings.microsoftGraph.microsoftGraphStrings.html
*/
trait BodyType extends js.Object

object BodyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typings.microsoftGraph.microsoftGraphStrings.html = this.cast("html")
  @scala.inline
  def text: typings.microsoftGraph.microsoftGraphStrings.text = this.cast("text")
}

