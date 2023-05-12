package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Errors contain a required message (either a string or jQuery selection) that is used to
  * describe what went wrong in a {@link OO.ui.Process process}. The error's
  * {@link Error.ConfigOptions.recoverable recoverable} and {@link Error.ConfigOptions.warning warning}
  * configurations are used to customize the appearance and functionality of the error interface.
  *
  * The basic error interface contains a formatted error message as well as two buttons: 'Dismiss'
  * and 'Try again' (i.e., the error is 'recoverable' by default). If the error is not recoverable,
  * the 'Try again' button will not be rendered and the widget that initiated the failed process
  * will be disabled.
  *
  * If the error is a warning, the error interface will include a 'Dismiss' and a 'Continue' button,
  * which will try the process again.
  *
  * For an example of error interfaces, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Process_Dialogs#Processes_and_errors).
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Error
  */
trait Error extends StObject {
  
  /**
    * Get error message as DOM nodes.
    *
    * @return Error message in DOM nodes
    */
  def getMessage(): JQuery[HTMLElement]
  
  /**
    * Get the error message text.
    *
    * @return Error message
    */
  def getMessageText(): String
  
  /**
    * Check if the error is recoverable.
    *
    * If the error is recoverable, users are able to try the process again.
    *
    * @return Error is recoverable
    */
  def isRecoverable(): Boolean
  
  /**
    * Check if the error is a warning.
    *
    * If the error is a warning, the error interface will include a 'Dismiss' and a 'Continue'
    * button.
    *
    * @return Error is warning
    */
  def isWarning(): Boolean
}
object Error {
  
  inline def apply(
    getMessage: () => JQuery[HTMLElement],
    getMessageText: () => String,
    isRecoverable: () => Boolean,
    isWarning: () => Boolean
  ): Error = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage), getMessageText = js.Any.fromFunction0(getMessageText), isRecoverable = js.Any.fromFunction0(isRecoverable), isWarning = js.Any.fromFunction0(isWarning))
    __obj.asInstanceOf[Error]
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * Error is recoverable.
      * By default, errors are recoverable, and users can try the process again.
      */
    var recoverable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Error is a warning.
      * If the error is a warning, the error interface will include a
      * 'Dismiss' and a 'Continue' button. It is the responsibility of the developer to ensure
      * that the warning is not triggered a second time if the user chooses to continue.
      */
    var warning: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setRecoverable(value: Boolean): Self = StObject.set(x, "recoverable", value.asInstanceOf[js.Any])
      
      inline def setRecoverableUndefined: Self = StObject.set(x, "recoverable", js.undefined)
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param message Description of error
    * @param config Configuration options
    */
  Instantiable1[(/* message */ JQuery[HTMLElement]) | (/* message */ String), Error]
       with Instantiable2[
          (/* message */ JQuery[HTMLElement]) | (/* message */ String), 
          /* config */ ConfigOptions, 
          Error
        ]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setGetMessage(value: () => JQuery[HTMLElement]): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    inline def setGetMessageText(value: () => String): Self = StObject.set(x, "getMessageText", js.Any.fromFunction0(value))
    
    inline def setIsRecoverable(value: () => Boolean): Self = StObject.set(x, "isRecoverable", js.Any.fromFunction0(value))
    
    inline def setIsWarning(value: () => Boolean): Self = StObject.set(x, "isWarning", js.Any.fromFunction0(value))
  }
}
