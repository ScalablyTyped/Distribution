package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents add-in level functionality for operating or configuring various aspects of the add-in.
  */
trait Addin_ extends js.Object {
  /**
    * Gets the current startup behavior for the add-in.
    */
  def getStartupBehavior(): js.Promise[StartupBehavior]
  /**
    * Hides the task pane.
    * @returns A promise that is resolved when the UI is hidden.
    */
  def hide(): js.Promise[Unit]
  /**
    * Adds a listener for the `onVisbilityModeChanged` event.
    * @param listener - The listener function that is called when the event is emitted. This function takes in a message for the receiving component.
    * @returns A promise that resolves when the listener is added.
    */
  def onVisibilityModeChanged(listener: js.Function1[/* message */ VisibilityModeChangedMessage, Unit]): js.Promise[RemoveEventListener]
  /**
    * Sets the startup behavior for the add-in for when the document is opened next time.
    * @param behavior - Specifies startup behavior of the add-in.
    */
  def setStartupBehavior(behavior: StartupBehavior): js.Promise[Unit]
  /**
    * Shows the task pane associated with the add-in.
    * @returns A promise that is resolved when the UI is shown.
    */
  def showAsTaskpane(): js.Promise[Unit]
}

object Addin_ {
  @scala.inline
  def apply(
    getStartupBehavior: () => js.Promise[StartupBehavior],
    hide: () => js.Promise[Unit],
    onVisibilityModeChanged: js.Function1[/* message */ VisibilityModeChangedMessage, Unit] => js.Promise[RemoveEventListener],
    setStartupBehavior: StartupBehavior => js.Promise[Unit],
    showAsTaskpane: () => js.Promise[Unit]
  ): Addin_ = {
    val __obj = js.Dynamic.literal(getStartupBehavior = js.Any.fromFunction0(getStartupBehavior), hide = js.Any.fromFunction0(hide), onVisibilityModeChanged = js.Any.fromFunction1(onVisibilityModeChanged), setStartupBehavior = js.Any.fromFunction1(setStartupBehavior), showAsTaskpane = js.Any.fromFunction0(showAsTaskpane))
    __obj.asInstanceOf[Addin_]
  }
}

