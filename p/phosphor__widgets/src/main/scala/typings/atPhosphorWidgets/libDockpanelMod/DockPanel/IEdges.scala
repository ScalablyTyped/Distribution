package typings.atPhosphorWidgets.libDockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sizes of the edge drop zones, in pixels.
  */
trait IEdges extends js.Object {
  /**
    * The size of the bottom edge drop zone.
    */
  var bottom: Double
  /**
    * The size of the left edge drop zone.
    */
  var left: Double
  /**
    * The size of the right edge drop zone.
    */
  var right: Double
  /**
    * The size of the top edge drop zone.
    */
  var top: Double
}

object IEdges {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): IEdges = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[IEdges]
  }
}

