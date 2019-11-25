package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.text
  - typings.microsoftDashGraph.microsoftDashGraphStrings.html
*/
trait BodyType extends js.Object

object BodyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typings.microsoftDashGraph.microsoftDashGraphStrings.html = this.cast("html")
  @scala.inline
  def text: typings.microsoftDashGraph.microsoftDashGraphStrings.text = this.cast("text")
}

