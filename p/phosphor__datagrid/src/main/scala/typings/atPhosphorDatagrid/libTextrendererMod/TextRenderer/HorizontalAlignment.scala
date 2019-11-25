package typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported horizontal alignment modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.left
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.center
  - typings.atPhosphorDatagrid.atPhosphorDatagridStrings.right
*/
trait HorizontalAlignment extends js.Object

object HorizontalAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.atPhosphorDatagrid.atPhosphorDatagridStrings.center = this.cast("center")
  @scala.inline
  def left: typings.atPhosphorDatagrid.atPhosphorDatagridStrings.left = this.cast("left")
  @scala.inline
  def right: typings.atPhosphorDatagrid.atPhosphorDatagridStrings.right = this.cast("right")
}

