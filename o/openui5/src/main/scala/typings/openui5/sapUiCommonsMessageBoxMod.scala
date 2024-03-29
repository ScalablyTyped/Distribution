package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsMessageBoxMod extends Shortcut {
  
  @JSImport("sap/ui/commons/MessageBox", JSImport.Default)
  @js.native
  val default: MessageBox = js.native
  
  @js.native
  sealed trait Action extends StObject
  /**
    * @deprecated (since 1.38)
    *
    * Enumeration of supported actions in a MessageBox.
    *
    * Each action is represented as a button in the message box. The values of this enumeration are used for
    * both, specifying the set of allowed actions as well as reporting back the user choice.
    */
  @JSImport("sap/ui/commons/MessageBox", "Action")
  @js.native
  object Action extends StObject {
    
    /**
      * Adds an "Abort" button to the message box.
      */
    @js.native
    sealed trait ABORT
      extends StObject
         with Action
    
    /**
      * Adds a "Cancel" button to the message box.
      */
    @js.native
    sealed trait CANCEL
      extends StObject
         with Action
    
    /**
      * Adds a "Close" button to the message box.
      */
    @js.native
    sealed trait CLOSE
      extends StObject
         with Action
    
    /**
      * Adds an "Ignore" button to the message box.
      */
    @js.native
    sealed trait IGNORE
      extends StObject
         with Action
    
    /**
      * Adds a "No" button to the message box.
      */
    @js.native
    sealed trait NO
      extends StObject
         with Action
    
    /**
      * Adds an "Ok" button to the message box.
      */
    @js.native
    sealed trait OK
      extends StObject
         with Action
    
    /**
      * Adds a "Retry" button to the message box.
      */
    @js.native
    sealed trait RETRY
      extends StObject
         with Action
    
    /**
      * Adds a "Yes" button to the message box.
      */
    @js.native
    sealed trait YES
      extends StObject
         with Action
  }
  
  @js.native
  sealed trait Icon extends StObject
  /**
    * @deprecated (since 1.38)
    *
    * Enumeration of the pre-defined icons that can be used in a MessageBox.
    */
  @JSImport("sap/ui/commons/MessageBox", "Icon")
  @js.native
  object Icon extends StObject {
    
    /**
      * @deprecated (since 1.9.1) - The error icon is used instead
      *
      * Shows the critical error icon in the message box.
      */
    @js.native
    sealed trait CRITICAL
      extends StObject
         with Icon
    
    /**
      * Shows the error icon in the message box.
      */
    @js.native
    sealed trait ERROR
      extends StObject
         with Icon
    
    /**
      * Shows the information icon in the message box.
      */
    @js.native
    sealed trait INFORMATION
      extends StObject
         with Icon
    
    /**
      * Shows no icon in the message box.
      */
    @js.native
    sealed trait NONE
      extends StObject
         with Icon
    
    /**
      * Shows the question icon in the message box.
      */
    @js.native
    sealed trait QUESTION
      extends StObject
         with Icon
    
    /**
      * Shows the success icon in the message box.
      */
    @js.native
    sealed trait SUCCESS
      extends StObject
         with Icon
    
    /**
      * Shows the warning icon in the message box.
      */
    @js.native
    sealed trait WARNING
      extends StObject
         with Icon
  }
  
  /**
    * @since 0.8.8
    * @deprecated (since 1.38) - Instead, use the `sap.m.MessageBox` control.
    *
    * Provides methods to create standard alerts, confirmation dialogs, or arbitrary message boxes.
    *
    * As `MessageBox` is a static class, a `jQuery.sap.require("sap.ui.commons.MessageBox");` statement must
    * be explicitly executed before the class can be used. Example:
    * ```javascript
    *
    *   jQuery.sap.require("sap.ui.commons.MessageBox");
    *   sap.ui.commons.MessageBox.show(
    *       "This message should appear in the message box.",
    *       sap.ui.commons.MessageBox.Icon.INFORMATION,
    *       "My message box title",
    *       [sap.ui.commons.MessageBox.Action.YES, sap.ui.commons.MessageBox.Action.NO],
    *       function() { / * do something * / }
    *   );
    * ```
    */
  @js.native
  trait MessageBox extends StObject {
    
    /**
      * @deprecated (since 1.38)
      *
      * Enumeration of supported actions in a MessageBox.
      *
      * Each action is represented as a button in the message box. The values of this enumeration are used for
      * both, specifying the set of allowed actions as well as reporting back the user choice.
      */
    var Action: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action */ Any = js.native
    
    /**
      * @deprecated (since 1.38)
      *
      * Enumeration of the pre-defined icons that can be used in a MessageBox.
      */
    var Icon: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon */ Any = js.native
    
    /**
      * Displays an alert box with the given message and an OK button (no icons). If a callback is given, it
      * is called after the alert box has been closed by the user via the OK button or via the Close icon. The
      * callback is called with the following signature:
      *
      *
      * ```javascript
      *
      *   function ()
      * ```
      *
      *
      * The alert box opened by this method is modal and it is processed asynchronously. Applications have to
      * use the `fnCallback` to continue work after the user closed the alert box.
      */
    def alert(/**
      * Message to be displayed in the alert box
      */
    vMessage: String): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: String,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: String,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: String,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: String,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: Unit,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: String,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: Unit,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: String,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: Unit,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: String,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: Unit,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: Unit,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: js.Function,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: Unit,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: Unit,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: Unit,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: String,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert box
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * callback function to be called when the user closed the dialog
      */
    fnCallback: Unit,
      /**
      * Title to be displayed in the alert box
      */
    sTitle: Unit,
      /**
      * ID to be used for the alert box. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: String
    ): Unit = js.native
    
    /**
      * Displays a confirmation dialog box with the given message, a question icon, an OK button, and a Cancel
      * button. If a callback is given, it is called after the alert box has been closed by the user via one
      * of the buttons or via the close icon. The callback is called with the following signature
      *
      *
      * ```javascript
      *
      *   function(bConfirmed)
      * ```
      *
      *
      * where bConfirmed is set to true when the user has activated the OK button.
      *
      * The confirmation dialog box opened by this method is modal and it is processed asynchronously. Applications
      * have to use the `fnCallback` to continue work after the user closed the alert box.
      */
    def confirm(/**
      * Message to display
      */
    vMessage: String): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: String,
      /**
      * Callback to be called
      */
    fnCallback: js.Function
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: String,
      /**
      * Callback to be called
      */
    fnCallback: js.Function,
      /**
      * Title to display
      */
    sTitle: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: String,
      /**
      * Callback to be called
      */
    fnCallback: js.Function,
      /**
      * Title to display
      */
    sTitle: String,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: String,
      /**
      * Callback to be called
      */
    fnCallback: js.Function,
      /**
      * Title to display
      */
    sTitle: Unit,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: String,
      /**
      * Callback to be called
      */
    fnCallback: Unit,
      /**
      * Title to display
      */
    sTitle: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: String,
      /**
      * Callback to be called
      */
    fnCallback: Unit,
      /**
      * Title to display
      */
    sTitle: String,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: String,
      /**
      * Callback to be called
      */
    fnCallback: Unit,
      /**
      * Title to display
      */
    sTitle: Unit,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    def confirm(/**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Callback to be called
      */
    fnCallback: js.Function
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Callback to be called
      */
    fnCallback: js.Function,
      /**
      * Title to display
      */
    sTitle: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Callback to be called
      */
    fnCallback: js.Function,
      /**
      * Title to display
      */
    sTitle: String,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Callback to be called
      */
    fnCallback: js.Function,
      /**
      * Title to display
      */
    sTitle: Unit,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Callback to be called
      */
    fnCallback: Unit,
      /**
      * Title to display
      */
    sTitle: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Callback to be called
      */
    fnCallback: Unit,
      /**
      * Title to display
      */
    sTitle: String,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to display
      */
    vMessage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Callback to be called
      */
    fnCallback: Unit,
      /**
      * Title to display
      */
    sTitle: Unit,
      /**
      * ID to be used for the confirmation dialog. Intended for test scenarios, not recommended for productive
      * apps
      */
    sDialogId: String
    ): Unit = js.native
    
    /**
      * Creates and displays a simple message box with the given text and buttons, and optionally other parts.
      * After the user has selected a button or closed the message box using the close icon, the `callback` function
      * is invoked when given.
      *
      * The only mandatory parameter is `vMessage`. Either a string with the corresponding text or even a layout
      * control could be provided.
      *
      * The created dialog box is executed asynchronously. When it has been created and registered for rendering,
      * this function returns without waiting for a user reaction.
      *
      * When applications have to react on the users choice, they have to provide a callback function and postpone
      * any reaction on the user choice until that callback is triggered.
      *
      * The signature of the callback is
      *
      * function (oAction);
      *
      * where `oAction` is the button that the user has pressed. When the user has pressed the close button,
      * a MessageBox.Action.Close is returned.
      */
    def show(
      /**
      * The message to be displayed.
      */
    vMessage: String | typings.openui5.sapUiCoreControlMod.default,
      /**
      * The icon to be displayed.
      */
    oIcon: js.UndefOr[
          Icon | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Icon * / any */ String)
        ],
      /**
      * The title of the message box.
      */
    sTitle: js.UndefOr[String],
      /**
      * Either a single action, or an array of actions. If no action(s) are given, the single action MessageBox.Action.OK
      * is taken as a default for the parameter.
      */
    vActions: js.UndefOr[
          Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String) | (js.Array[
            Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String)
          ])
        ],
      /**
      * Function to be called when the user has pressed a button or has closed the message box.
      */
    fnCallback: js.UndefOr[js.Function],
      /**
      * Must be one of the actions provided in vActions.
      */
    oDefaultAction: js.UndefOr[
          Action | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Action * / any */ String)
        ],
      /**
      * ID to be used for the dialog. Intended for test scenarios, not recommended for productive apps
      */
    sDialogId: js.UndefOr[String]
    ): Unit = js.native
  }
  
  type _To = MessageBox
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCommonsMessageBoxMod.foo` */
  override def _to: MessageBox = default
}
