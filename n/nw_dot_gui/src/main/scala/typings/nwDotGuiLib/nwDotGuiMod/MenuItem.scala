package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "MenuItem")
@js.native
class MenuItem protected ()
  extends EventEmitter
     with MenuItemConfig {
  def this(config: MenuItemConfig) = this()
  @JSName("checked")
  var checked_MenuItem: scala.Boolean = js.native
  @JSName("click")
  var click_MenuItem: js.Function = js.native
  @JSName("enabled")
  var enabled_MenuItem: scala.Boolean = js.native
  @JSName("icon")
  var icon_MenuItem: java.lang.String = js.native
  @JSName("key")
  var key_MenuItem: java.lang.String = js.native
  @JSName("label")
  var label_MenuItem: java.lang.String = js.native
  @JSName("modifiers")
  var modifiers_MenuItem: java.lang.String = js.native
  @JSName("submenu")
  var submenu_MenuItem: Menu = js.native
  @JSName("tooltip")
  var tooltip_MenuItem: java.lang.String = js.native
  @JSName("type")
  var type_MenuItem: java.lang.String = js.native
}

