package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.Replace
  - typings.microsoftGraph.microsoftGraphStrings.Append
  - typings.microsoftGraph.microsoftGraphStrings.Delete
  - typings.microsoftGraph.microsoftGraphStrings.Insert
  - typings.microsoftGraph.microsoftGraphStrings.Prepend
*/
trait OnenotePatchActionType extends js.Object

object OnenotePatchActionType {
  @scala.inline
  def Append: typings.microsoftGraph.microsoftGraphStrings.Append = this.cast("Append")
  @scala.inline
  def Delete: typings.microsoftGraph.microsoftGraphStrings.Delete = this.cast("Delete")
  @scala.inline
  def Insert: typings.microsoftGraph.microsoftGraphStrings.Insert = this.cast("Insert")
  @scala.inline
  def Prepend: typings.microsoftGraph.microsoftGraphStrings.Prepend = this.cast("Prepend")
  @scala.inline
  def Replace: typings.microsoftGraph.microsoftGraphStrings.Replace = this.cast("Replace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

