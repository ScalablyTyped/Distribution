package typings.phosphorDatagrid.datamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data model column regions.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorDatagrid.phosphorDatagridStrings.body
  - typings.phosphorDatagrid.phosphorDatagridStrings.`row-header`
*/
trait ColumnRegion extends js.Object

object ColumnRegion {
  @scala.inline
  def body: typings.phosphorDatagrid.phosphorDatagridStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `row-header`: typings.phosphorDatagrid.phosphorDatagridStrings.`row-header` = this.cast("row-header")
}

