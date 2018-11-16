package typings
package nwDotJsLib.nwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* MenuItem: http://docs.nwjs.io/en/latest/References/MenuItem/ */
/**
     * `MenuItem` represents an item in a menu.
     */
@JSGlobal("nw.MenuItem")
@js.native
class MenuItem protected ()
  extends nwDotJsLib.NWJSUnderscoreHelpersNs.EventEmitter {
  /**
           * Create a new MenuItem.
           *
           * @param option {Object} Customize how MenuItem render and behave.
           */
  def this(option: nwDotJsLib.NWJSUnderscoreHelpersNs.MenuItemOption) = this()
  /**
           * Get or set whether the `MenuItem` is `checked`
           */
  var checked: scala.Boolean = js.native
  /**
           * Get or set the click `callback` of a `MenuItem`
           */
  var click: js.Function = js.native
  /**
           * Get or set whether the `MenuItem` is `enabled`
           */
  var enabled: java.lang.String = js.native
  /**
           * Get or set the `icon` of a `MenuItem`
           */
  var icon: java.lang.String = js.native
  /**
           * Get or set whether `icon` image is treated as "template" (`true` by default).
           */
  var iconIsTemplate: scala.Boolean = js.native
  /**
           * A single character string to specify the shortcut key for the menu item.
           */
  var key: java.lang.String = js.native
  /**
           * Get or set the `label` of a `MenuItem`
           */
  var lable: java.lang.String = js.native
  /**
           * A string to specify the modifier keys for the shortcut of the menu item.
           */
  var modifiers: java.lang.String = js.native
  /**
           * Get or set the `submenu` of a `MenuItem`, the `submenu` must be a `Menu` object.
           */
  var submenu: Menu = js.native
  /**
           * Get or set the `tooltip` of a `MenuItem`
           */
  var tooltip: scala.Boolean = js.native
  /**
           * Get the `type` of a `MenuItem`
           */
  var `type`: java.lang.String = js.native
  /**
           * Emitted when user activates the menu item.
           *
           * @param event {string} Event name
           * @param listener {Function} The callback that handles the `click` event.
           */
  @JSName("on")
  def on_click(event: nwDotJsLib.nwDotJsLibStrings.click, listener: js.Function0[_]): this.type = js.native
}

