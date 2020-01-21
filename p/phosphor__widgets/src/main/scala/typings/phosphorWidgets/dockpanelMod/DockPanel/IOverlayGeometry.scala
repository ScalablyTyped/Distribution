package typings.phosphorWidgets.dockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the geometry for overlay positioning.
  */
trait IOverlayGeometry extends js.Object {
  /**
    * The distance between the overlay and parent bottom edges.
    */
  var bottom: Double
  /**
    * The distance between the overlay and parent left edges.
    */
  var left: Double
  /**
    * The distance between the overlay and parent right edges.
    */
  var right: Double
  /**
    * The distance between the overlay and parent top edges.
    */
  var top: Double
}

object IOverlayGeometry {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): IOverlayGeometry = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOverlayGeometry]
  }
}

