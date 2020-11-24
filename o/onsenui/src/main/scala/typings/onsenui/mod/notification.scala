package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods to create different kinds of alert dialogs. There are three methods available: alert, confirm and prompt
  */
@JSImport("onsenui", "notification")
@js.native
object notification extends js.Object {
  
  /**
    * @param {Object} options Parameter object
    * @param {String} [options.message] Alert message
    * @param {String} [options.messageHTML] Alert message in HTML
    * @param {String} [options.buttonLabel] Label for confirmation button. Default is "OK"
    * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
    * @param {String} [options.title] Dialog title. Default is "Alert"
    * @param {String} [options.modifier] Modifier for the dialog
    * @param {String} [options.id] The `<ons-alert-dialog>` element's ID.
    * @param {Function} [options.callback] Function that executes after dialog has been closed
    * @description
    *   Display an alert dialog to show the user a message
    *   The content of the message can be either simple text or HTML
    *   Must specify either message or messageHTML
    */
  def alert(message: String): js.Promise[HTMLElement] = js.native
  def alert(message: String, options: AlertOptions): js.Promise[HTMLElement] = js.native
  def alert(message: AlertOptions): js.Promise[HTMLElement] = js.native
  def alert(message: AlertOptions, options: AlertOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @param {Object} options Parameter object
    * @param {String} [options.message] Confirmation question
    * @param {String} [options.messageHTML] Dialog content in HTML
    * @param {Array} [options.buttonLabels] Labels for the buttons. Default is ["Cancel", "OK"]
    * @param {Number} [options.primaryButtonIndex] Index of primary button. Default is 1
    * @param {Boolean} [options.cancelable] Whether the dialog is cancelable or not. Default is false
    * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
    * @param {String} [options.title] Dialog title. Default is "Confirm"
    * @param {String} [options.modifier] Modifier for the dialog
    * @param {String} [options.id] The `<ons-alert-dialog>` element's ID.
    * @param {Function} [options.callback]
    *   Function that executes after the dialog has been closed
    *   Argument for the function is the index of the button that was pressed or -1 if the dialog was canceled
    * @description
    *   Display a dialog to ask the user for confirmation
    *   The default button labels are "Cancel" and "OK" but they can be customized
    *   Must specify either message or messageHTML
    */
  def confirm(message: String): js.Promise[HTMLElement] = js.native
  def confirm(message: String, options: AlertOptions): js.Promise[HTMLElement] = js.native
  def confirm(message: AlertOptions): js.Promise[HTMLElement] = js.native
  def confirm(message: AlertOptions, options: AlertOptions): js.Promise[HTMLElement] = js.native
  
  /**
    * @param {Object} options Parameter object
    * @param {String} [options.message] Prompt question
    * @param {String} [options.messageHTML] Dialog content in HTML
    * @param {String} [options.buttonLabel] Label for confirmation button. Default is "OK"
    * @param {Number} [options.primaryButtonIndex] Index of primary button. Default is 1
    * @param {Boolean} [options.cancelable] Whether the dialog is cancelable or not. Default is false
    * @param {String} [options.animation] Animation name. Available animations are "none", "fade" and "slide"
    * @param {String} [options.title] Dialog title. Default is "Alert"
    * @param {String} [options.modifier] Modifier for the dialog
    * @param {String} [options.id] The `<ons-alert-dialog>` element's ID.
    * @param {Function} [options.callback]
    *   Function that executes after the dialog has been closed
    *   Argument for the function is the value of the input field or null if the dialog was canceled
    * @description
    *   Display a dialog with a prompt to ask the user a question
    *   Must specify either message or messageHTML
    */
  def prompt(message: String): js.Promise[HTMLElement] = js.native
  def prompt(message: String, options: AlertOptions): js.Promise[HTMLElement] = js.native
  def prompt(message: AlertOptions): js.Promise[HTMLElement] = js.native
  def prompt(message: AlertOptions, options: AlertOptions): js.Promise[HTMLElement] = js.native
  
  def toast(args: js.Any*): js.Any = js.native
}
