package typings
package microsoftDashAjaxLib.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base class for all all ASP.NET AJAX client controls.
  */
@JSGlobal("Sys.UI.Control")
@js.native
class Control protected ()
  extends microsoftDashAjaxLib.SysNs.Component {
  //#region Constructors
  /**
    * When called from a derived class, initializes a new instance of that class.
    * The Control constructor is a complete constructor function. However, because the Control class is an abstract base class, the constructor should be called only from derived classes.
    * @param element
    *           The HTMLElement object that the control will be associated with.
    *
    * @throws Error.invalidOperation Function
    */
  def this(element: stdLib.HTMLElement) = this()
  //#endregion
  //#region Methods
  /**
    * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
    * @param className
    *          A string that contains the name of the CSS class to add.
    */
  def addCssClass(className: java.lang.String): scala.Unit = js.native
  //#endregion
  //#region Properties
  /**
    * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
    * @return The DOM element that the current Control object is associated with.
    */
  def get_element(): stdLib.HTMLElement = js.native
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
  def onBubbleEvent(source: js.Any, args: js.Any): scala.Boolean = js.native
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
  def raiseBubbleEvent(source: js.Any, args: js.Any): scala.Unit = js.native
  /**
    * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
    * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
    *
    * @param className
    *          A string that contains the name of the CSS class to remove.
    */
  def removeCssClass(className: java.lang.String): scala.Unit = js.native
  /**
    * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
    * @param className
    *          A string that contains the name of the CSS class to toggle.
    */
  def toggleCssClass(className: java.lang.String): scala.Unit = js.native
}

