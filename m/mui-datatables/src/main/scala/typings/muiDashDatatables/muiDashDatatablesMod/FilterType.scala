package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.muiDashDatatables.muiDashDatatablesStrings.dropdown
  - typings.muiDashDatatables.muiDashDatatablesStrings.checkbox
  - typings.muiDashDatatables.muiDashDatatablesStrings.multiselect
  - typings.muiDashDatatables.muiDashDatatablesStrings.textField
  - typings.muiDashDatatables.muiDashDatatablesStrings.custom
*/
trait FilterType extends js.Object

object FilterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.muiDashDatatables.muiDashDatatablesStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def custom: typings.muiDashDatatables.muiDashDatatablesStrings.custom = this.cast("custom")
  @scala.inline
  def dropdown: typings.muiDashDatatables.muiDashDatatablesStrings.dropdown = this.cast("dropdown")
  @scala.inline
  def multiselect: typings.muiDashDatatables.muiDashDatatablesStrings.multiselect = this.cast("multiselect")
  @scala.inline
  def textField: typings.muiDashDatatables.muiDashDatatablesStrings.textField = this.cast("textField")
}

