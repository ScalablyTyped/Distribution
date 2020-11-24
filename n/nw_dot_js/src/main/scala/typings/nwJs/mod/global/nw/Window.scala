package typings.nwJs.mod.global.nw

import org.scalablytyped.runtime.TopLevel
import typings.node.eventsMod.EventEmitter
import typings.nwJs.mod.global.NWJSHelpers.WindowOpenOption
import typings.nwJs.mod.global.NWJSHelpers.win
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Window: http://docs.nwjs.io/en/latest/References/Window/ */
/**
  * Window is a wrapper of the DOM's window object. It has extended operations and can receive various window events.
  */
@js.native
trait Window extends EventEmitter {
  
  /**
    * Get the native Window Object.
    *
    * @param event {DOM Window} (Optional) Is the DOM window
    */
  def get(): win = js.native
  def get(window_object: js.Object): win = js.native
  
  /**
    * Get all windows.
    *
    * @param callback {(windows: NWJS_Helpers.win[]) => void} A callback function whose parameter is an array of nw.Window objects
    */
  def getAll(callback: js.Function1[/* windows */ js.Array[win], Unit]): Unit = js.native
  
  /**
    * Open a new window and load url in it.
    *
    * @param url {string} URL to be loaded in the opened window
    * @param option {object} (Optional) New window open options like window subfields in manifest format plus some more options
    * @param callback {string} (Optional) Callback when with the opened native Window object
    * - (Optional) new_win {object} New opened window object.
    */
  def open(url: String): Unit = js.native
  def open(
    url: String,
    option: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* new_win */ js.UndefOr[win], Unit]
  ): Unit = js.native
  def open(url: String, option: WindowOpenOption): Unit = js.native
  def open(url: String, option: WindowOpenOption, callback: js.Function1[/* new_win */ js.UndefOr[win], Unit]): Unit = js.native
}
@JSGlobal("nw.Window")
@js.native
object Window extends TopLevel[Window]
