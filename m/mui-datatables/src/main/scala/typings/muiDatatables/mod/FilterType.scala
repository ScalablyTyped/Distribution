package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.muiDatatables.muiDatatablesStrings.dropdown
  - typings.muiDatatables.muiDatatablesStrings.checkbox
  - typings.muiDatatables.muiDatatablesStrings.multiselect
  - typings.muiDatatables.muiDatatablesStrings.textField
  - typings.muiDatatables.muiDatatablesStrings.custom
*/
trait FilterType extends js.Object

object FilterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.muiDatatables.muiDatatablesStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def custom: typings.muiDatatables.muiDatatablesStrings.custom = this.cast("custom")
  @scala.inline
  def dropdown: typings.muiDatatables.muiDatatablesStrings.dropdown = this.cast("dropdown")
  @scala.inline
  def multiselect: typings.muiDatatables.muiDatatablesStrings.multiselect = this.cast("multiselect")
  @scala.inline
  def textField: typings.muiDatatables.muiDatatablesStrings.textField = this.cast("textField")
}

