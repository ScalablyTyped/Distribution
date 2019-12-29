package typings.nwDotJs.nwDotJsMod._Global_.nw

import typings.node.eventsMod.EventEmitter
import typings.nwDotJs.nwDotJsMod._Global_.NWJS_Helpers.TrayOption
import typings.nwDotJs.nwDotJsStrings.`click `
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nw.Tray")
@js.native
class Tray protected () extends EventEmitter {
  /**
    * Create a new Tray.
    * @param option {Object} Contains initial settings for the Tray.
    */
  def this(option: TrayOption) = this()
  /**
    * Get or set the alternate (active) tray icon. (Mac)
    */
  var alticon: String = js.native
  /**
    * Get or set the icon of the tray.
    */
  var icon: String = js.native
  /**
    * Get or set whether icon and alticon images are treated as "templates" (true by default). (Mac)
    */
  var iconsAreTemplates: Boolean = js.native
  /**
    * Get or set the menu of the tray.
    */
  var menu: Menu = js.native
  /**
    * Get or set the title of the tray.
    */
  var title: String = js.native
  /**
    * Get or set the tooltip of the tray.
    */
  var tooltip: String = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  /**
    * Emitted when user clicks the menu item with left mouse button.
    *
    * @param event {string} Event name
    * @param listener {Function} The callback that handles the `click` event.
    */
  @JSName("on")
  def on_click(event: `click `, listener: js.Function0[_]): this.type = js.native
  /**
    * Remove the tray.
    */
  def remove(): Unit = js.native
}

