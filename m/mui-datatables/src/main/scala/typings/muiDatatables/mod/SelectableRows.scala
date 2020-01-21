package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.muiDatatables.muiDatatablesStrings.multiple
  - typings.muiDatatables.muiDatatablesStrings.single
  - typings.muiDatatables.muiDatatablesStrings.none
*/
trait SelectableRows extends js.Object

object SelectableRows {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def multiple: typings.muiDatatables.muiDatatablesStrings.multiple = this.cast("multiple")
  @scala.inline
  def none: typings.muiDatatables.muiDatatablesStrings.none = this.cast("none")
  @scala.inline
  def single: typings.muiDatatables.muiDatatablesStrings.single = this.cast("single")
}

