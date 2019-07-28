package typings.nwDotJs.nwNs

import typings.nwDotJs.NWJSUnderscoreHelpersNs.EventEmitter
import typings.nwDotJs.NWJSUnderscoreHelpersNs.ShortcutOption
import typings.nwDotJs.nwDotJsStrings.active
import typings.nwDotJs.nwDotJsStrings.failed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nw.Shortcut")
@js.native
class Shortcut protected () extends EventEmitter {
  /**
    * Create new Shortcut.
    *
    * @param option {Object} Shortcut option is an object contains initial settings for the Shortcut.
    */
  def this(option: ShortcutOption) = this()
  /**
    * Get or set the active callback of a Shortcut. It will be called when user presses the shortcut.
    */
  var active: js.Function = js.native
  /**
    * Get the key of a Shortcut.
    */
  var key: String = js.native
  /**
    * Get or set the failed callback of a Shortcut. It will be called when application passes an invalid key , or failed to register the key.
    *
    * @param msg {string} Failure message
    */
  def failed(): js.Any = js.native
  def failed(msg: String): js.Any = js.native
  /**
    * Get or set the active callback of a Shortcut. It will be called when user presses the shortcut.
    *
    * @param event {string} Event name
    * @param listener {Function} The callback that handles the `active` event.
    */
  @JSName("on")
  def on_active(event: active, listener: js.Function0[_]): this.type = js.native
  /**
    * Get or set the failed callback of a Shortcut. It will be called when application passes an invalid key, or failed to register the key.
    *
    * @param event {string} Event name
    * @param listener {Function(msg?)} The callback that handles the `failed` event.
    * - (optional) msg {string} Failure message
    */
  @JSName("on")
  def on_failed(event: failed, listener: js.Function1[/* msg */ js.UndefOr[String], _]): this.type = js.native
}

