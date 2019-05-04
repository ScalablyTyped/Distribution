package typings
package atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents the geometry of a tab area.
  */
trait ITabAreaGeometry extends js.Object {
  /**
    * The local coordinate of the bottom edge of the tab area.
    *
    * #### Notes
    * This is the distance from the bottom edge of the layout parent
    * widget, to the bottom edge of the tab area.
    */
  var bottom: scala.Double
  /**
    * The height of the tab area.
    *
    * #### Notes
    * This is total height allocated for the tab area.
    */
  var height: scala.Double
  /**
    * The local coordinate of the left edge of the tab area.
    *
    * #### Notes
    * This is the distance from the left edge of the layout parent
    * widget, to the left edge of the tab area.
    */
  var left: scala.Double
  /**
    * The local coordinate of the right edge of the tab area.
    *
    * #### Notes
    * This is the distance from the right edge of the layout parent
    * widget, to the right edge of the tab area.
    */
  var right: scala.Double
  /**
    * The tab bar for the tab area.
    */
  var tabBar: atPhosphorWidgetsLib.libTabbarMod.TabBar[atPhosphorWidgetsLib.libWidgetMod.Widget]
  /**
    * The local coordinate of the top edge of the tab area.
    *
    * #### Notes
    * This is the distance from the top edge of the layout parent
    * widget, to the top edge of the tab area.
    */
  var top: scala.Double
  /**
    * The width of the tab area.
    *
    * #### Notes
    * This is total width allocated for the tab area.
    */
  var width: scala.Double
  /**
    * The local X position of the hit test in the dock area.
    *
    * #### Notes
    * This is the distance from the left edge of the layout parent
    * widget, to the local X coordinate of the hit test query.
    */
  var x: scala.Double
  /**
    * The local Y position of the hit test in the dock area.
    *
    * #### Notes
    * This is the distance from the top edge of the layout parent
    * widget, to the local Y coordinate of the hit test query.
    */
  var y: scala.Double
}

object ITabAreaGeometry {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    tabBar: atPhosphorWidgetsLib.libTabbarMod.TabBar[atPhosphorWidgetsLib.libWidgetMod.Widget],
    top: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): ITabAreaGeometry = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, tabBar = tabBar, top = top, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ITabAreaGeometry]
  }
}

