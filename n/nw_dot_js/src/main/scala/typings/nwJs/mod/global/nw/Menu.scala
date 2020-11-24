package typings.nwJs.mod.global.nw

import typings.nwJs.mod.global.NWJSHelpers.CreateMacBuiltinOption
import typings.nwJs.mod.global.NWJSHelpers.MenuOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Menu: http://docs.nwjs.io/en/latest/References/Menu/ */
/**
  * `Menu` represents a menubar or a context menu.
  */
@JSGlobal("nw.Menu")
@js.native
/**
  * Create a Menu object.
  *
  * @param option {Object} (Optional) Option to customize returned menu object.
  */
class Menu () extends js.Object {
  def this(option: MenuOption) = this()
  
  /**
    * Append `item` to the tail of the menu.
    *
    * @param item {MenuItem} the item to be appended to the tail of the menu
    */
  def append(item: MenuItem): Unit = js.native
  
  /**
    * Creates the builtin menus (App, Edit and Window) within the menubar on Mac.
    *
    * @param appname {string} The application name
    * @param options {Object} (Optional) Options to modify default `edit` and `window` MenuItems in Mac
    */
  def createMacBuiltin(appname: String): Unit = js.native
  def createMacBuiltin(appname: String, options: CreateMacBuiltinOption): Unit = js.native
  
  /**
    * Insert the `item` at `i`th position of the menu. The index is started from 0.
    *
    * @param item {MenuItem} the item to be inserted into the menu
    * @param i {Integer} the index in the menu list to insert the the item
    */
  def insert(item: MenuItem, i: Double): Unit = js.native
  
  /**
    * Get an array that contains all items of a menu. Each item is an instance of MenuItem.
    */
  var items: js.Array[MenuItem] = js.native
  
  /**
    * Popup the context menu at the anchor in (`x`, `y`) in current window.
    *
    * @param x {Integer} the x position of the anchor
    * @param y {Integer} the y position of the anchor
    */
  def popup(x: Double, y: Double): Unit = js.native
  
  /**
    * Remove `item` from the menu.
    *
    * @param item {MenuItem} the item to be removed
    */
  def remove(item: MenuItem): Unit = js.native
  
  /**
    * Remove the `i`th item form the menu.
    *
    * @param i {Integer} the index of the item to be removed from the menu
    */
  def removeAt(i: Double): Unit = js.native
}
