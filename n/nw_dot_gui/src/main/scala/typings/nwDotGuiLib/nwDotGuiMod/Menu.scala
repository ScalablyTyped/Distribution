package typings
package nwDotGuiLib.nwDotGuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nw.gui", "Menu")
@js.native
class Menu () extends js.Object {
  def this(config: MenuConfig) = this()
  var items: js.Array[MenuItem] = js.native
  def append(item: MenuItem): scala.Unit = js.native
  // since v0.10.0-rc1
  def createMacBuiltin(appname: java.lang.String): scala.Unit = js.native
  def createMacBuiltin(appname: java.lang.String, options: HideMenusOptions): scala.Unit = js.native
  def insert(item: MenuItem, atPosition: scala.Double): scala.Unit = js.native
  def popup(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def remove(item: MenuItem): scala.Unit = js.native
  def removeAt(index: scala.Double): scala.Unit = js.native
}

