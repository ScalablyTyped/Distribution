package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @modifier android Display an Android style alert dialog
  * @description Alert dialog that is displayed on top of the current screen
  */
@js.native
trait OnsAlertDialogElement extends HTMLElement {
  /**
    * @description A boolean value that specifies whether the dialog is cancelable or not. When the dialog is cancelable it can be closed by tapping the background or by pressing the back button on Android devices.
    */
  var cancelable: Boolean = js.native
  /**
    * @description A boolean value that specifies whether the dialog is disabled or not.
    */
  var disabled: Boolean = js.native
  var onDeviceBackButton: js.Any = js.native
  var visible: js.Any = js.native
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade", "slide" and "none"
    * @param {Function} [options.callback] Function to execute after the dialog has been hidden
    * @description Hide the alert dialog
    */
  def hide(): js.Promise[HTMLElement] = js.native
  def hide(options: DialogOptions): js.Promise[HTMLElement] = js.native
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade", "slide" and "none"
    * @param {Function} [options.callback] Function to execute after the dialog has been revealed
    * @description Show the alert dialog
    */
  def show(): js.Promise[HTMLElement] = js.native
  def show(options: DialogOptions): js.Promise[HTMLElement] = js.native
}

