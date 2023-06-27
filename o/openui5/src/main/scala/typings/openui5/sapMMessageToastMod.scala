package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.AnimationDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMessageToastMod extends Shortcut {
  
  @JSImport("sap/m/MessageToast", JSImport.Default)
  @js.native
  val default: MessageToast = js.native
  
  /**
    * @since 1.9.2
    *
    * A small, non-disruptive popup for messages. Overview: A message toast is a small, non-disruptive popup
    * for success or information messages that disappears automatically after a few seconds. Toasts automatically
    * disappear after a timeout unless the user moves the mouse over the toast or taps on it. Notes::
    *
    * 	 - If the configured message contains HTML code or script tags, those will be escaped.
    * 	 - Line breaks (\r\n, \n\r, \r, \n) will be visualized.
    * 	 - Only one message toast can be shown at a time in the same place.  Example:: Here is an example
    *     of a MessageToast with all default options:
    * ```javascript
    *
    * sap.m.MessageToast.show("This message should appear in the message toast", {
    *     duration: 3000,                  // default
    *     width: "15em",                   // default
    *     my: "center bottom",             // default
    *     at: "center bottom",             // default
    *     of: window,                      // default
    *     offset: "0 0",                   // default
    *     collision: "fit fit",            // default
    *     onClose: null,                   // default
    *     autoClose: true,                 // default
    *     animationTimingFunction: "ease", // default
    *     animationDuration: 1000,         // default
    *     closeOnBrowserNavigation: true   // default
    * });
    * ```
    *  Usage: When to use::
    * 	 - You want to display a short success of information message.
    * 	 - You do not want to interrupt users while they are performing an action.
    * 	 - You want to confirm a successful action.  When not to use::
    * 	 - You want to display an error or warning message.
    * 	 - You want to interrupt users while they are performing an action.
    * 	 - You want to make sure that users read the message before they leave the page.
    * 	 - You want users to be able to copy some part of the message text. (In this case, show a success {@link sap.m.Dialog Message Dialog}.)
    *      Responsive Behavior: The message toast has the same behavior on all devices. However, you can adjust
    *     the width of the control, for example, for use on a desktop device.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/message-toast/ Message Toast}
    */
  @js.native
  trait MessageToast extends StObject {
    
    /**
      * Creates and displays a simple message toast notification message with the given text, and optionally
      * other options.
      *
      * The only mandatory parameter is `sMessage`.
      */
    def show(/**
      * The message to be displayed.
      */
    sMessage: String): Unit = js.native
    def show(
      /**
      * The message to be displayed.
      */
    sMessage: String,
      /**
      * Object which can contain all other options. Not all entries in this object are required. This property
      * is optional.
      */
    mOptions: AnimationDuration
    ): Unit = js.native
  }
  
  type _To = MessageToast
  
  /* This means you don't have to write `default`, but can instead just say `sapMMessageToastMod.foo` */
  override def _to: MessageToast = default
}
