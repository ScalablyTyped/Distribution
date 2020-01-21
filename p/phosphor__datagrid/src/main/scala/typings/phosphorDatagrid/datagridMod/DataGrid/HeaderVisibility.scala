package typings.phosphorDatagrid.datagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported header visibility modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorDatagrid.phosphorDatagridStrings.all
  - typings.phosphorDatagrid.phosphorDatagridStrings.row
  - typings.phosphorDatagrid.phosphorDatagridStrings.column
  - typings.phosphorDatagrid.phosphorDatagridStrings.none
*/
trait HeaderVisibility extends js.Object

object HeaderVisibility {
  @scala.inline
  def all: typings.phosphorDatagrid.phosphorDatagridStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typings.phosphorDatagrid.phosphorDatagridStrings.column = this.cast("column")
  @scala.inline
  def none: typings.phosphorDatagrid.phosphorDatagridStrings.none = this.cast("none")
  @scala.inline
  def row: typings.phosphorDatagrid.phosphorDatagridStrings.row = this.cast("row")
}

