package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.focused
  - typings.microsoftGraph.microsoftGraphStrings.other
*/
trait InferenceClassificationType extends js.Object

object InferenceClassificationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def focused: typings.microsoftGraph.microsoftGraphStrings.focused = this.cast("focused")
  @scala.inline
  def other: typings.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
}

