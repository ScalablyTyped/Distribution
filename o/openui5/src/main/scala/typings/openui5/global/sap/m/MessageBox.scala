package typings.openui5.global.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.m.MessageBox")
@js.native
object MessageBox extends js.Object {
  
  /**
    * Displays an alert dialog with the given message and an OK button (no
    * icons).<pre>sap.m.MessageBox.alert("This message should appear in the alert", {    title: "Alert",  
    *                                    // default    onClose: null,                                     
    *  // default    styleClass: ""                                       // default    initialFocus: null
    *                                   // default    textDirection: sap.ui.core.TextDirection.Inherit    
    * // default});</pre>If a callback is given, it is called after the alert dialog has been closedby the
    * user via the OK button. The callback is called with the following signature:<pre>  function
    * (oAction)</pre>where <code>oAction</code> can be either sap.m.MessageBox.Action.OK when the alert
    * dialog is closed by tapping on the OK button   or null when the alert dialog is closed by calling
    * <code>sap.m.InstanceManager.closeAllDialogs()</code>.The alert dialog opened by this method is
    * processed asynchronously.Applications have to use <code>fnCallback</code> to continue work after
    * theuser closed the alert dialog.
    * @param vMessage Message to be displayed in the alert dialog. The usage of sap.core.Control as
    * vMassage is deprecated since version 1.30.4.
    * @param mOptions Other options (optional)
    */
  def alert(vMessage: String): Unit = js.native
  def alert(vMessage: String, mOptions: js.Any): Unit = js.native
  
  /**
    * Displays a confirmation dialog with the given message, a QUESTION icon, an OK buttonand a Cancel
    * button. If a callback is given, it is called after the confirmation boxhas been closed by the user
    * with one of the buttons.<pre>sap.m.MessageBox.confirm("This message should appear in the
    * confirmation", {    title: "Confirm",                                    // default    onClose: null
    *                                        // default    styleClass: ""                                 
    *      // default    initialFocus: null                                   // default    textDirection:
    * sap.ui.core.TextDirection.Inherit     // default    });</pre>The callback is called with the
    * following signature<pre>  function(oAction)</pre>where oAction is set by one of the following three
    * values:1. sap.m.MessageBox.Action.OK: OK (confirmed) button is tapped.2.
    * sap.m.MessageBox.Action.Cancel: Cancel (unconfirmed) button is tapped.3. null: Confirm dialog is
    * closed by calling <code>sap.m.InstanceManager.closeAllDialogs()</code>The confirmation dialog opened
    * by this method is processed asynchronously.Applications have to use <code>fnCallback</code> to
    * continue work after theuser closed the confirmation dialog
    * @param vMessage Message to be displayed in the alert dialog. The usage of sap.core.Control as
    * vMassage is deprecated since version 1.30.4.
    * @param mOptions Other options (optional)
    */
  def confirm(vMessage: String): Unit = js.native
  def confirm(vMessage: String, mOptions: js.Any): Unit = js.native
  
  /**
    * Displays an error dialog with the given message, an ERROR icon, a CLOSE button..If a callback is
    * given, it is called after the error boxhas been closed by the user with one of the
    * buttons.<pre>sap.m.MessageBox.error("This message should appear in the error message box", {   
    * title: "Error",                                      // default    onClose: null                    
    *                    // default    styleClass: ""                                       // default   
    * initialFocus: null                                   // default    textDirection:
    * sap.ui.core.TextDirection.Inherit     // default    });</pre>The callback is called with the
    * following signature<pre>  function (oAction)</pre>The error dialog opened by this method is
    * processed asynchronously.Applications have to use <code>fnCallback</code> to continue work after
    * theuser closed the error dialog.
    * @since 1.30
    * @param vMessage Message to be displayed in the alert dialog. The usage of sap.core.Control as
    * vMassage is deprecated since version 1.30.4.
    * @param mOptions Other options (optional)
    */
  def error(vMessage: String): Unit = js.native
  def error(vMessage: String, mOptions: js.Any): Unit = js.native
  
  /**
    * Displays an information dialog with the given message, an INFO icon, an OK button.If a callback is
    * given, it is called after the info boxhas been closed by the user with one of the
    * buttons.<pre>sap.m.MessageBox.information("This message should appear in the information message
    * box", {    title: "Information",                                // default    onClose: null         
    *                               // default    styleClass: ""                                       //
    * default    initialFocus: null                                   // default    textDirection:
    * sap.ui.core.TextDirection.Inherit     // default    });</pre>The callback is called with the
    * following signature                 *<pre>  function (oAction)</pre>The information dialog opened by this method
    * is processed asynchronously.Applications have to use <code>fnCallback</code> to continue work after
    * theuser closed the information dialog
    * @since 1.30
    * @param vMessage Message to be displayed in the alert dialog. The usage of sap.core.Control as
    * vMassage is deprecated since version 1.30.4.
    * @param mOptions Other options (optional)
    */
  def information(vMessage: String): Unit = js.native
  def information(vMessage: String, mOptions: js.Any): Unit = js.native
  
  /**
    * Creates and displays a sap.m.Dialog with type sap.m.DialogType.Message with the given text and
    * buttons, and optionally other parts.After the user has tapped a button, the <code>onClose</code>
    * function is invoked when given.The only mandatory parameter is <code>vMessage</code>. Either a
    * string with the corresponding text or evena layout control could be
    * provided.<pre>sap.m.MessageBox.show("This message should appear in the message box", {    icon:
    * sap.m.MessageBox.Icon.NONE,                    // default    title: "",                             
    *              // default    actions: sap.m.MessageBox.Action.OK                  // default   
    * onClose: null                                        // default    styleClass: ""                   
    *                    // default    initialFocus: null                                   // default   
    * textDirection: sap.ui.core.TextDirection.Inherit     // default});</pre>The created dialog is
    * executed asynchronously. When it has been created and registered for rendering,this function returns
    * without waiting for a user reaction.When applications have to react on the users choice, they have
    * to provide a callback function andpostpone any reaction on the user choice until that callback is
    * triggered.The signature of the callback is  function (oAction);where <code>oAction</code> is the
    * button that the user has tapped. For example, when the user has pressed the close button,a
    * sap.m.MessageBox.Action.Close is returned.
    * @param vMessage Message to be displayed in the alert dialog. The usage of sap.core.Control as
    * vMassage is deprecated since version 1.30.4.
    * @param mOptions Other options (optional)
    */
  def show(vMessage: String): Unit = js.native
  def show(vMessage: String, mOptions: js.Any): Unit = js.native
  
  /**
    * Displays a success dialog with the given message, a SUCCESS icon, an OK button.If a callback is
    * given, it is called after the success boxhas been closed by the user with one of the
    * buttons.<pre>sap.m.MessageBox.success("This message should appear in the success message box", {   
    * title: "Success",                                    // default    onClose: null                    
    *                    // default    styleClass: ""                                       // default   
    * initialFocus: null                                   // default    textDirection:
    * sap.ui.core.TextDirection.Inherit     // default    });</pre>The callback is called with the
    * following signature<pre>  function(oAction)</pre>The success dialog opened by this method is
    * processed asynchronously.Applications have to use <code>fnCallback</code> to continue work after
    * theuser closed the success dialog
    * @since 1.30
    * @param vMessage Message to be displayed in the alert dialog. The usage of sap.core.Control as
    * vMassage is deprecated since version 1.30.4.
    * @param mOptions Other options (optional)
    */
  def success(vMessage: String): Unit = js.native
  def success(vMessage: String, mOptions: js.Any): Unit = js.native
  
  /**
    * Displays a warning dialog with the given message, a WARNING icon, an OK button.If a callback is
    * given, it is called after the warning boxhas been closed by the user with one of the
    * buttons.<pre>sap.m.MessageBox.warning("This message should appear in the warning message box", {   
    * title: "Warning",                                    // default    onClose: null                    
    *                    // default    styleClass: ""                                       // default   
    * initialFocus: null                                   // default    textDirection:
    * sap.ui.core.TextDirection.Inherit     // default    });</pre>The callback is called with the
    * following signature                 *<pre>  function (oAction)</pre>The warning dialog opened by this method is
    * processed asynchronously.Applications have to use <code>fnCallback</code> to continue work after
    * theuser closed the warning dialog
    * @since 1.30
    * @param vMessage Message to be displayed in the alert dialog. The usage of sap.core.Control as
    * vMassage is deprecated since version 1.30.4.
    * @param mOptions Other options (optional)
    */
  def warning(vMessage: String): Unit = js.native
  def warning(vMessage: String, mOptions: js.Any): Unit = js.native
  
  @js.native
  object Action extends js.Object {
    
    /**
      * Adds an "Abort" button to the message box.
      */
    var ABORT: js.Any = js.native
    
    /**
      * Adds a "Cancel" button to the message box.
      */
    var CANCEL: js.Any = js.native
    
    /**
      * Adds a "Close" button to the message box.
      */
    var CLOSE: js.Any = js.native
    
    /**
      * Adds a "Delete" button to the message box.
      */
    var DELETE: js.Any = js.native
    
    /**
      * Adds an "Ignore" button to the message box.
      */
    var IGNORE: js.Any = js.native
    
    /**
      * Adds a "No" button to the message box.
      */
    var NO: js.Any = js.native
    
    /**
      * Adds an "OK" button to the message box.
      */
    var OK: js.Any = js.native
    
    /**
      * Adds a "Retry" button to the message box.
      */
    var RETRY: js.Any = js.native
    
    /**
      * Adds a "Yes" button to the message box.
      */
    var YES: js.Any = js.native
  }
  
  @js.native
  object Icon extends js.Object {
    
    /**
      * Shows the error icon in the message box.
      */
    var ERROR: js.Any = js.native
    
    /**
      * Shows the information icon in the message box.
      */
    var INFORMATION: js.Any = js.native
    
    /**
      * Shows no icon in the message box.
      */
    var NONE: js.Any = js.native
    
    /**
      * Shows the question icon in the message box.
      */
    var QUESTION: js.Any = js.native
    
    /**
      * Shows the success icon in the message box.
      */
    var SUCCESS: js.Any = js.native
    
    /**
      * Shows the warning icon in the message box.
      */
    var WARNING: js.Any = js.native
  }
}
