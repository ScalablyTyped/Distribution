package typings
package atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout config object for a tab area.
  */
trait ITabAreaConfig extends AreaConfig {
  /**
    * The index of the selected tab.
    */
  var currentIndex: scala.Double
  /**
    * The discriminated type of the config object.
    */
  var `type`: atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`tab-area`
  /**
    * The widgets contained in the tab area.
    */
  var widgets: js.Array[atPhosphorWidgetsLib.libWidgetMod.Widget]
}

object ITabAreaConfig {
  @scala.inline
  def apply(
    currentIndex: scala.Double,
    `type`: atPhosphorWidgetsLib.atPhosphorWidgetsLibStrings.`tab-area`,
    widgets: js.Array[atPhosphorWidgetsLib.libWidgetMod.Widget]
  ): ITabAreaConfig = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex, widgets = widgets)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITabAreaConfig]
  }
}

