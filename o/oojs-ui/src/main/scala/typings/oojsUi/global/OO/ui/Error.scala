package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Error.ConfigOptions
import typings.oojsUi.OO.ui.Error.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Error extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.Error")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.oojsUi.OO.ui.Error {
    /**
      * @param message Description of error
      * @param config Configuration options
      */
    def this(message: String) = this()
    def this(message: JQuery[HTMLElement]) = this()
    def this(message: String, config: ConfigOptions) = this()
    def this(message: JQuery[HTMLElement], config: ConfigOptions) = this()
    
    /**
      * Get error message as DOM nodes.
      *
      * @return Error message in DOM nodes
      */
    /* CompleteClass */
    override def getMessage(): JQuery[HTMLElement] = js.native
    
    /**
      * Get the error message text.
      *
      * @return Error message
      */
    /* CompleteClass */
    override def getMessageText(): String = js.native
    
    /**
      * Check if the error is recoverable.
      *
      * If the error is recoverable, users are able to try the process again.
      *
      * @return Error is recoverable
      */
    /* CompleteClass */
    override def isRecoverable(): Boolean = js.native
    
    /**
      * Check if the error is a warning.
      *
      * If the error is a warning, the error interface will include a 'Dismiss' and a 'Continue'
      * button.
      *
      * @return Error is warning
      */
    /* CompleteClass */
    override def isWarning(): Boolean = js.native
  }
  
  @JSGlobal("OO.ui.Error")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `Error.foo` */
  override def _to: js.Object & Constructor = ^
}
