package typings.atPhosphorWidgets.libDocklayoutMod.DockLayout

import typings.atPhosphorWidgets.libTabbarMod.TabBar
import typings.atPhosphorWidgets.libWidgetMod.Widget
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
  var bottom: Double
  /**
    * The height of the tab area.
    *
    * #### Notes
    * This is total height allocated for the tab area.
    */
  var height: Double
  /**
    * The local coordinate of the left edge of the tab area.
    *
    * #### Notes
    * This is the distance from the left edge of the layout parent
    * widget, to the left edge of the tab area.
    */
  var left: Double
  /**
    * The local coordinate of the right edge of the tab area.
    *
    * #### Notes
    * This is the distance from the right edge of the layout parent
    * widget, to the right edge of the tab area.
    */
  var right: Double
  /**
    * The tab bar for the tab area.
    */
  var tabBar: TabBar[Widget]
  /**
    * The local coordinate of the top edge of the tab area.
    *
    * #### Notes
    * This is the distance from the top edge of the layout parent
    * widget, to the top edge of the tab area.
    */
  var top: Double
  /**
    * The width of the tab area.
    *
    * #### Notes
    * This is total width allocated for the tab area.
    */
  var width: Double
  /**
    * The local X position of the hit test in the dock area.
    *
    * #### Notes
    * This is the distance from the left edge of the layout parent
    * widget, to the local X coordinate of the hit test query.
    */
  var x: Double
  /**
    * The local Y position of the hit test in the dock area.
    *
    * #### Notes
    * This is the distance from the top edge of the layout parent
    * widget, to the local Y coordinate of the hit test query.
    */
  var y: Double
}

object ITabAreaGeometry {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    tabBar: TabBar[Widget],
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): ITabAreaGeometry = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, tabBar = tabBar, top = top, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ITabAreaGeometry]
  }
}

