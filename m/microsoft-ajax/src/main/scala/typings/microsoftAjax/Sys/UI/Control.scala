package typings.microsoftAjax.Sys.UI

import typings.microsoftAjax.Sys.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base class for all all ASP.NET AJAX client controls.
  */
trait Control extends Component {
  //#endregion
  //#region Methods
  /**
    * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
    * @param className
    *          A string that contains the name of the CSS class to add.
    */
  def addCssClass(className: String): Unit
  //#endregion
  //#region Properties
  /**
    * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
    * @return The DOM element that the current Control object is associated with.
    */
  def get_element(): HTMLElement
  /**
    * Called when an event is raised by the raiseBubbleEvent method.
    *
    * The onBubbleEvent method returns false to make sure that unhandled events propagate (bubble) to the parent control.
    * In derived classes, you should override the onBubbleEvent method and return true when events are handled to prevent the events from bubbling further.
    * For an explanation of bubbling, see Sys.UI.Control raiseBubbleEvent Method.
    *
    * @param source
    *          The object that triggered the event.
    * @param args
    *          The event arguments.
    * @return
    *      false in all cases.
    */
  def onBubbleEvent(source: js.Any, args: js.Any): Boolean
  /**
    * Calls the onBubbleEvent method of the parent control.
    *
    * When the raiseBubbleEvent method is called, the source object and args values are sent to the onBubbleEvent handler of the current control.
    * If onBubbleEvent returns false, they are sent to the onBubbleEvent handler of the parent control.
    * This process continues until an onBubbleEvent event handler returns true, which indicates that the event has been handled.
    * Any event that bubbles to the Sys.Application instance without being handled is ignored.
    *
    * @param source
    *          The object that triggered the event.
    * @param args
    *          The event arguments.
    */
  def raiseBubbleEvent(source: js.Any, args: js.Any): Unit
  /**
    * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
    *
    * @param className
    *          A string that contains the name of the CSS class to remove.
    */
  def removeCssClass(className: String): Unit
  /**
    * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
    * @param className
    *          A string that contains the name of the CSS class to toggle.
    */
  def toggleCssClass(className: String): Unit
}

object Control {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    beginUpdate: () => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_element: () => HTMLElement,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    initialize: () => Unit,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raisePropertyChanged: String => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    set_id: String => Unit,
    toggleCssClass: String => Unit,
    updated: () => Unit
  ): Control = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), initialize = js.Any.fromFunction0(initialize), onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), set_id = js.Any.fromFunction1(set_id), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[Control]
  }
}

