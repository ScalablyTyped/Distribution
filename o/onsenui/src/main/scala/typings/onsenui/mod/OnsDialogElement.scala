package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Dialog that is displayed on top of current screen
  */
@js.native
trait OnsDialogElement extends HTMLElement {
  /**
    * @description A boolean value that specifies whether the dialog is cancelable or not. When the dialog is cancelable it can be closed by tapping the background or by pressing the back button on Android devices.
    */
  var cancelable: Boolean = js.native
  /**
    * @description A boolean value that specifies whether the dialog is disabled or not.
    */
  var disabled: Boolean = js.native
  var visible: js.Any = js.native
  /**
    * @description Destroy the dialog and remove it from the DOM tree
    */
  def destroy(): Unit = js.native
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
    * @param {Function} [options.callback] This functions is called after the dialog has been hidden
    * @description Hide the dialog
    */
  def hide(): js.Promise[HTMLElement] = js.native
  def hide(options: DialogOptions): js.Promise[HTMLElement] = js.native
  /**
    * @return {Object} Device back button handler
    * @description Retrieve the back button handler for overriding the default behavior
    */
  def onDeviceBackButton(): js.Any = js.native
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
    * @param {Function} [options.callback] This function is called after the dialog has been revealed
    * @description Show the dialog
    */
  def show(): js.Promise[HTMLElement] = js.native
  def show(options: DialogOptions): js.Promise[HTMLElement] = js.native
}

