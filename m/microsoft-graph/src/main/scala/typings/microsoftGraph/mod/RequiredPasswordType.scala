package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typings.microsoftGraph.microsoftGraphStrings.alphanumeric
  - typings.microsoftGraph.microsoftGraphStrings.numeric
*/
trait RequiredPasswordType extends js.Object

object RequiredPasswordType {
  @scala.inline
  def alphanumeric: typings.microsoftGraph.microsoftGraphStrings.alphanumeric = this.cast("alphanumeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def numeric: typings.microsoftGraph.microsoftGraphStrings.numeric = this.cast("numeric")
}

