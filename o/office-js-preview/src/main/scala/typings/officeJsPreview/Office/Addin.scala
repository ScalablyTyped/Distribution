package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents add-in level functionality for operating or configuring various aspects of the add-in.
  */
@js.native
trait Addin extends js.Object {
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
    * @returns A promise that resolves when the listener is added.
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
  implicit class AddinOps[Self <: Addin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetStartupBehavior(value: () => js.Promise[StartupBehavior]): Self = this.set("getStartupBehavior", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => js.Promise[Unit]): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setOnVisibilityModeChanged(
      value: js.Function1[/* message */ VisibilityModeChangedMessage, Unit] => js.Promise[RemoveEventListener]
    ): Self = this.set("onVisibilityModeChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStartupBehavior(value: StartupBehavior => js.Promise[Unit]): Self = this.set("setStartupBehavior", js.Any.fromFunction1(value))
    @scala.inline
    def setShowAsTaskpane(value: () => js.Promise[Unit]): Self = this.set("showAsTaskpane", js.Any.fromFunction0(value))
  }
  
}

