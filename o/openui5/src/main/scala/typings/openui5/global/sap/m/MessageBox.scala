package typings.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageBox {
  
  @JSGlobal("sap.m.MessageBox")
  @js.native
  val ^ : js.Any = js.native
  
  object Action {
    
    @JSGlobal("sap.m.MessageBox.Action")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds an "Abort" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.ABORT")
    @js.native
    def ABORT: js.Any = js.native
    @scala.inline
    def ABORT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABORT")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a "Cancel" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.CANCEL")
    @js.native
    def CANCEL: js.Any = js.native
    @scala.inline
    def CANCEL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a "Close" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.CLOSE")
    @js.native
    def CLOSE: js.Any = js.native
    @scala.inline
    def CLOSE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a "Delete" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.DELETE")
    @js.native
    def DELETE: js.Any = js.native
    @scala.inline
    def DELETE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
    
    /**
      * Adds an "Ignore" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.IGNORE")
    @js.native
    def IGNORE: js.Any = js.native
    @scala.inline
    def IGNORE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IGNORE")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a "No" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.NO")
    @js.native
    def NO: js.Any = js.native
    @scala.inline
    def NO_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO")(x.asInstanceOf[js.Any])
    
    /**
      * Adds an "OK" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.OK")
    @js.native
    def OK: js.Any = js.native
    @scala.inline
    def OK_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a "Retry" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.RETRY")
    @js.native
    def RETRY: js.Any = js.native
    @scala.inline
    def RETRY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RETRY")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a "Yes" button to the message box.
      */
    @JSGlobal("sap.m.MessageBox.Action.YES")
    @js.native
    def YES: js.Any = js.native
    @scala.inline
    def YES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YES")(x.asInstanceOf[js.Any])
  }
  
  object Icon {
    
    @JSGlobal("sap.m.MessageBox.Icon")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Shows the error icon in the message box.
      */
    @JSGlobal("sap.m.MessageBox.Icon.ERROR")
    @js.native
    def ERROR: js.Any = js.native
    @scala.inline
    def ERROR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Shows the information icon in the message box.
      */
    @JSGlobal("sap.m.MessageBox.Icon.INFORMATION")
    @js.native
    def INFORMATION: js.Any = js.native
    @scala.inline
    def INFORMATION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFORMATION")(x.asInstanceOf[js.Any])
    
    /**
      * Shows no icon in the message box.
      */
    @JSGlobal("sap.m.MessageBox.Icon.NONE")
    @js.native
    def NONE: js.Any = js.native
    @scala.inline
    def NONE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    /**
      * Shows the question icon in the message box.
      */
    @JSGlobal("sap.m.MessageBox.Icon.QUESTION")
    @js.native
    def QUESTION: js.Any = js.native
    @scala.inline
    def QUESTION_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUESTION")(x.asInstanceOf[js.Any])
    
    /**
      * Shows the success icon in the message box.
      */
    @JSGlobal("sap.m.MessageBox.Icon.SUCCESS")
    @js.native
    def SUCCESS: js.Any = js.native
    @scala.inline
    def SUCCESS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    /**
      * Shows the warning icon in the message box.
      */
    @JSGlobal("sap.m.MessageBox.Icon.WARNING")
    @js.native
    def WARNING: js.Any = js.native
    @scala.inline
    def WARNING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
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
  @scala.inline
  def alert(vMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(vMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def alert(vMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(vMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def confirm(vMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(vMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def confirm(vMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(vMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def error(vMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(vMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def error(vMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(vMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def information(vMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("information")(vMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def information(vMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("information")(vMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def show(vMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(vMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def show(vMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(vMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def success(vMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(vMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def success(vMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(vMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def warning(vMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(vMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def warning(vMessage: String, mOptions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(vMessage.asInstanceOf[js.Any], mOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
