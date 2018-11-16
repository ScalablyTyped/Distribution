package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "Tray")
@js.native
class Tray protected ()
  extends EventEmitter
     with TrayOption {
  def this(option: TrayOption) = this()
  @JSName("alticon")
  var alticon_Tray: java.lang.String = js.native
  @JSName("icon")
  var icon_Tray: java.lang.String = js.native
  @JSName("menu")
  var menu_Tray: Menu = js.native
  @JSName("title")
  var title_Tray: java.lang.String = js.native
  @JSName("tooltip")
  var tooltip_Tray: java.lang.String = js.native
  def remove(): scala.Unit = js.native
}

