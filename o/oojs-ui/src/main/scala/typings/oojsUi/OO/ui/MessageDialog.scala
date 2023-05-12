package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Dialog.Props
import typings.oojsUi.OO.ui.MessageDialog.Prototype
import typings.oojsUi.OO.ui.Window.Size
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MessageDialogs display a confirmation or alert message. By default, the rendered dialog box
  * consists of a header that contains the dialog title, a body with the message, and a footer that
  * contains any {@link OO.ui.ActionWidget action widgets}. The MessageDialog class is the only type
  * of {@link OO.ui.Dialog dialog} that is usually instantiated directly.
  *
  * There are two basic types of message dialogs, confirmation and alert:
  *
  * - **confirmation**: the dialog title describes what a progressive action will do and the message
  *   provides more details about the consequences.
  * - **alert**: the dialog title describes which event occurred and the message provides more
  *   information about why the event occurred.
  *
  * The MessageDialog class specifies two actions: ‘accept’, the primary
  * action (e.g., ‘ok’) and ‘reject,’ the safe action (e.g., ‘cancel’). Both will close the window,
  * passing along the selected action.
  *
  * For more information and examples, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Message_Dialogs).
  *
  *     // Example: Creating and opening a message dialog window.
  *     var messageDialog = new OO.ui.MessageDialog();
  *
  *     // Create and append a window manager.
  *     var windowManager = new OO.ui.WindowManager();
  *     $( document.body ).append( windowManager.$element );
  *     windowManager.addWindows( [ messageDialog ] );
  *     // Open the window.
  *     windowManager.openWindow( messageDialog, {
  *         title: 'Basic message dialog',
  *         message: 'This is the message'
  *     } );
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.MessageDialog
  */
@js.native
trait MessageDialog
  extends StObject
     with Props
     with Prototype
object MessageDialog {
  
  type ConfigOptions = typings.oojsUi.OO.ui.Dialog.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[MessageDialog]
       with Instantiable1[/* config */ ConfigOptions, MessageDialog] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Dialog.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Dialog.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.Dialog.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Dialog.Prototype
  
  trait SetupDataMap
    extends StObject
       with typings.oojsUi.OO.ui.Dialog.SetupDataMap {
    
    /** Description of the action's consequence */
    var message: js.UndefOr[JQuery[HTMLElement] | Deferrable[String] | Null] = js.undefined
    
    /** Symbolic name of the dialog size, see {@link OO.ui.Window} */
    var size: js.UndefOr[Size] = js.undefined
  }
  object SetupDataMap {
    
    inline def apply(): SetupDataMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetupDataMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetupDataMap] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: JQuery[HTMLElement] | Deferrable[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction0(value: () => String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Dialog.Static {
    
    /**
      * The message displayed in the dialog body.
      *
      * A confirmation message describes the consequences of a progressive action. An alert
      * message describes why an event occurred.
      */
    var message: JQuery[HTMLElement] | Deferrable[String] | Null = js.native
  }
}
