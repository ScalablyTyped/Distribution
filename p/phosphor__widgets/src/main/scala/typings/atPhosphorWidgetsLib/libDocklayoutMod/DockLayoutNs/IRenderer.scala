package typings
package atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a dock layout.
  */
trait IRenderer extends js.Object {
  /**
    * Create a new handle node for use with a dock layout.
    *
    * @returns A new handle node for a dock layout.
    */
  def createHandle(): stdLib.HTMLDivElement
  /**
    * Create a new tab bar for use with a dock layout.
    *
    * @returns A new tab bar for a dock layout.
    */
  def createTabBar(): atPhosphorWidgetsLib.libTabbarMod.TabBar[atPhosphorWidgetsLib.libWidgetMod.Widget]
}

object IRenderer {
  @scala.inline
  def apply(
    createHandle: () => stdLib.HTMLDivElement,
    createTabBar: () => atPhosphorWidgetsLib.libTabbarMod.TabBar[atPhosphorWidgetsLib.libWidgetMod.Widget]
  ): IRenderer = {
    val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle), createTabBar = js.Any.fromFunction0(createTabBar))
  
    __obj.asInstanceOf[IRenderer]
  }
}

