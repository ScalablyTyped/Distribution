package typings.atPhosphorWidgets.libDocklayoutMod.DockLayout

import typings.atPhosphorWidgets.atPhosphorWidgetsStrings.`tab-area`
import typings.atPhosphorWidgets.libWidgetMod.Widget
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
  var currentIndex: Double
  /**
    * The discriminated type of the config object.
    */
  var `type`: `tab-area`
  /**
    * The widgets contained in the tab area.
    */
  var widgets: js.Array[Widget]
}

object ITabAreaConfig {
  @scala.inline
  def apply(currentIndex: Double, `type`: `tab-area`, widgets: js.Array[Widget]): ITabAreaConfig = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex, widgets = widgets)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ITabAreaConfig]
  }
}

