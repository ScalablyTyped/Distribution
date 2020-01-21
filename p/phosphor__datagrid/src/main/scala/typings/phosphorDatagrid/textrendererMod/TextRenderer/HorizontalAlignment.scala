package typings.phosphorDatagrid.textrendererMod.TextRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported horizontal alignment modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.phosphorDatagrid.phosphorDatagridStrings.left
  - typings.phosphorDatagrid.phosphorDatagridStrings.center
  - typings.phosphorDatagrid.phosphorDatagridStrings.right
*/
trait HorizontalAlignment extends js.Object

object HorizontalAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.phosphorDatagrid.phosphorDatagridStrings.center = this.cast("center")
  @scala.inline
  def left: typings.phosphorDatagrid.phosphorDatagridStrings.left = this.cast("left")
  @scala.inline
  def right: typings.phosphorDatagrid.phosphorDatagridStrings.right = this.cast("right")
}

