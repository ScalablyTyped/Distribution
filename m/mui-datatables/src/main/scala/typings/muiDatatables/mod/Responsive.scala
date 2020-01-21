package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.muiDatatables.muiDatatablesStrings.stacked
  - typings.muiDatatables.muiDatatablesStrings.scrollMaxHeight
  - typings.muiDatatables.muiDatatablesStrings.scrollFullHeight
*/
trait Responsive extends js.Object

object Responsive {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scrollFullHeight: typings.muiDatatables.muiDatatablesStrings.scrollFullHeight = this.cast("scrollFullHeight")
  @scala.inline
  def scrollMaxHeight: typings.muiDatatables.muiDatatablesStrings.scrollMaxHeight = this.cast("scrollMaxHeight")
  @scala.inline
  def stacked: typings.muiDatatables.muiDatatablesStrings.stacked = this.cast("stacked")
}

