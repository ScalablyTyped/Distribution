package typings.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nw.gui", "Menu")
@js.native
class Menu () extends js.Object {
  def this(config: MenuConfig) = this()
  
  def append(item: MenuItem): Unit = js.native
  
  // since v0.10.0-rc1
  def createMacBuiltin(appname: String): Unit = js.native
  def createMacBuiltin(appname: String, options: HideMenusOptions): Unit = js.native
  
  def insert(item: MenuItem, atPosition: Double): Unit = js.native
  
  var items: js.Array[MenuItem] = js.native
  
  def popup(x: Double, y: Double): Unit = js.native
  
  def remove(item: MenuItem): Unit = js.native
  
  def removeAt(index: Double): Unit = js.native
}
