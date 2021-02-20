package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents add-in level functionality for operating or configuring various aspects of the add-in.
  */
@js.native
trait Addin extends StObject {
  
  /**
    * Gets the current startup behavior for the add-in.
    */
  def getStartupBehavior(): js.Promise[StartupBehavior] = js.native
  
  /**
    * Hides the task pane.
    * @returns A promise that is resolved when the UI is hidden.
    */
  def hide(): js.Promise[Unit] = js.native
  
  /**
    * Adds a listener for the `onVisbilityModeChanged` event.
    * @param listener - The listener function that is called when the event is emitted. This function takes in a message for the receiving component.
    * @returns A promise that resolves to a function when the listener is added. The `RemoveEventListener` type is defined with `type RemoveEventListener = () => Promise<void>`. Calling it removes the listener.
    */
  def onVisibilityModeChanged(listener: js.Function1[/* message */ VisibilityModeChangedMessage, Unit]): js.Promise[RemoveEventListener] = js.native
  
  /**
    * Sets the startup behavior for the add-in for when the document is opened next time.
    * @param behavior - Specifies startup behavior of the add-in.
    */
  def setStartupBehavior(behavior: StartupBehavior): js.Promise[Unit] = js.native
  
  /**
    * Shows the task pane associated with the add-in.
    * @returns A promise that is resolved when the UI is shown.
    */
  def showAsTaskpane(): js.Promise[Unit] = js.native
}
object Addin {
  
  @scala.inline
  def apply(
    getStartupBehavior: () => js.Promise[StartupBehavior],
    hide: () => js.Promise[Unit],
    onVisibilityModeChanged: js.Function1[/* message */ VisibilityModeChangedMessage, Unit] => js.Promise[RemoveEventListener],
    setStartupBehavior: StartupBehavior => js.Promise[Unit],
    showAsTaskpane: () => js.Promise[Unit]
  ): Addin = {
    val __obj = js.Dynamic.literal(getStartupBehavior = js.Any.fromFunction0(getStartupBehavior), hide = js.Any.fromFunction0(hide), onVisibilityModeChanged = js.Any.fromFunction1(onVisibilityModeChanged), setStartupBehavior = js.Any.fromFunction1(setStartupBehavior), showAsTaskpane = js.Any.fromFunction0(showAsTaskpane))
    __obj.asInstanceOf[Addin]
  }
  
  @scala.inline
  implicit class AddinMutableBuilder[Self <: Addin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStartupBehavior(value: () => js.Promise[StartupBehavior]): Self = StObject.set(x, "getStartupBehavior", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => js.Promise[Unit]): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVisibilityModeChanged(
      value: js.Function1[/* message */ VisibilityModeChangedMessage, Unit] => js.Promise[RemoveEventListener]
    ): Self = StObject.set(x, "onVisibilityModeChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStartupBehavior(value: StartupBehavior => js.Promise[Unit]): Self = StObject.set(x, "setStartupBehavior", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowAsTaskpane(value: () => js.Promise[Unit]): Self = StObject.set(x, "showAsTaskpane", js.Any.fromFunction0(value))
  }
}
