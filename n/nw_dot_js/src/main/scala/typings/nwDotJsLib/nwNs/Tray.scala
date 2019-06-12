package typings
package nwDotJsLib.nwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nw.Tray")
@js.native
class Tray protected ()
  extends nwDotJsLib.NWJSUnderscoreHelpersNs.EventEmitter {
  /**
    * Create a new Tray.
    * @param option {Object} Contains initial settings for the Tray.
    */
  def this(option: nwDotJsLib.NWJSUnderscoreHelpersNs.TrayOption) = this()
  /**
    * Get or set the alternate (active) tray icon. (Mac)
    */
  var alticon: java.lang.String = js.native
  /**
    * Get or set the icon of the tray.
    */
  var icon: java.lang.String = js.native
  /**
    * Get or set whether icon and alticon images are treated as "templates" (true by default). (Mac)
    */
  var iconsAreTemplates: scala.Boolean = js.native
  /**
    * Get or set the menu of the tray.
    */
  var menu: Menu = js.native
  /**
    * Get or set the title of the tray.
    */
  var title: java.lang.String = js.native
  /**
    * Get or set the tooltip of the tray.
    */
  var tooltip: java.lang.String = js.native
  /**
    * Emitted when user clicks the menu item with left mouse button.
    *
    * @param event {string} Event name
    * @param listener {Function} The callback that handles the `click` event.
    */
  @JSName("on")
  def on_click(event: nwDotJsLib.nwDotJsLibStrings.`click `, listener: js.Function0[_]): this.type = js.native
  /**
    * Remove the tray.
    */
  def remove(): scala.Unit = js.native
}

