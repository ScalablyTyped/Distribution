package typings
package atPhosphorWidgetsLib.libTabpanelMod.TabPanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a tab panel.
  */
trait IOptions extends js.Object {
  /**
    * The renderer for the panel's tab bar.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[
    atPhosphorWidgetsLib.libTabbarMod.TabBarNs.IRenderer[atPhosphorWidgetsLib.libWidgetMod.Widget]
  ] = js.undefined
  /**
    * The placement of the tab bar relative to the content.
    *
    * The default is `'top'`.
    */
  var tabPlacement: js.UndefOr[TabPlacement] = js.undefined
  /**
    * Whether the tabs are movable by the user.
    *
    * The default is `false`.
    */
  var tabsMovable: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    renderer: atPhosphorWidgetsLib.libTabbarMod.TabBarNs.IRenderer[atPhosphorWidgetsLib.libWidgetMod.Widget] = null,
    tabPlacement: TabPlacement = null,
    tabsMovable: js.UndefOr[scala.Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (tabPlacement != null) __obj.updateDynamic("tabPlacement")(tabPlacement)
    if (!js.isUndefined(tabsMovable)) __obj.updateDynamic("tabsMovable")(tabsMovable)
    __obj.asInstanceOf[IOptions]
  }
}

