package typings
package microsoftDashAjaxLib.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
        * Provides cross-browser access to DOM event properties and helper APIs that are used to attach handlers to DOM element events.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb310935(v=vs.100).aspx}
        */
@JSGlobal("Sys.UI.DomEvent")
@js.native
class DomEvent protected () extends js.Object {
  //#region Constructors
  /**
              * Initializes a new instance of the Sys.UI.DomEvent class and associates it with the specified HTMLElement object.
              * @param domElement
              *           The HTMLElement object to associate with the event.
              */
  def this(domElement: stdLib.HTMLElement) = this()
  //#endregion
  //#region Fields
  /**
               * Gets a Boolean value that indicates the state of the ALT key when the associated event occurred.
               * Use the altKey field to determine whether the ALT key is pressed when the event occurred.
               *
               * @return true if the ALT key was pressed when the event occurred; otherwise, false.
               */
  var altKey: scala.Boolean = js.native
  /**
               * Gets a Sys.UI.MouseButton enumeration value that indicates the button state of the mouse when the related event occurred.
               * Use the button field to determine which mouse button was pressed when the related event occurred.
               * @return A MouseButton value
               */
  var button: MouseButton = js.native
  /**
               * Gets the character code of the key that raised the associated keyPress event.
               * Use the charCode field to get the character code of a pressed key or key combination that raised a keyPress event.
               * The keyPress event provides a single character code that identifies key combinations.
               * The keyPress event is not raised for single modifier keys such as ALT, CTRL, and SHIFT.
               *
               * @return An integer value that represents the character code of the key or key combination that was pressed to raise the keyPress event.
               */
  var charCode: scala.Double = js.native
  /**
               * Gets the x-coordinate of the mouse pointer's position relative to the client area of the browser window, excluding window scroll bars.
               * @return An integer that represents the x-coordinate in pixels.
               */
  var clientX: scala.Double = js.native
  /**
               * Gets the y-coordinate of the mouse pointer's position relative to the client area of the browser window, excluding window scroll bars.
               * @return An integer that represents the y-coordinate in pixels.
               */
  var clientY: scala.Double = js.native
  /**
               * Gets a Boolean value that indicates the state of the CTRL key when the associated event occurred.
               * @return true if the CTRL key was pressed when the event occurred; otherwise, false.
               */
  var ctrlKey: scala.Boolean = js.native
  /**
               * Gets the key code of the key that raised the keyUp or keyDown event.
               * @return An integer value that represents the key code of the key that was pressed to raise the keyUp or keyDown event.
               */
  var keyCode: scala.Double = js.native
  /**
               * Gets the x-coordinate of the mouse pointer's position relative to the object that raised the event.
               * @return An integer that represents the x-coordinate in pixels.
               */
  var offsetX: scala.Double = js.native
  /**
               * Gets the y-coordinate of the mouse pointer's position relative to the object that raised the event.
               * @return An integer that represents the y-coordinate in pixels.
               */
  var offsetY: scala.Double = js.native
  /**
               * Gets the x-coordinate of the mouse pointer's position relative to the user's screen.
               * @return An integer that represents the x-coordinate in pixels.
               */
  var screenX: scala.Double = js.native
  /**
               * Gets the y-coordinate of the mouse pointer's position relative to the user's screen.
               * @return An integer that represents the y-coordinate in pixels.
               */
  var screenY: scala.Double = js.native
  /**
               * Gets a Boolean value that indicates the state of the SHIFT key when the associated event occurred.
               * @return true if the SHIFT key was pressed when the event occurred; otherwise, false.
               */
  var shiftKey: scala.Boolean = js.native
  /**
               * Gets the object that the event acted on.
               * @return An object that represents the target that the event acted on.
               */
  var target: js.Any = js.native
  /**
               * Gets the name of the event that was raised.
               * @return A string that represents the name of the event that was raised.
               */
  var `type`: java.lang.String = js.native
  /**
               * Prevents the default DOM event action from happening.
               * Use the preventDefault method to prevent the default event action for the browser from occurring.
               * For example, if you prevent the keydown event of an input element from occurring, the character typed by the user is not automatically appended to the input element's value.
               */
  def preventDefault(): scala.Unit = js.native
  /**
               * Prevents an event from being propagated (bubbled) to parent elements.
               * By default, event notification is bubbled from a child object to parent objects until it reaches the document object.
               * The event notification stops if the event is handled during the propagation process.
               * Use the stopPropagation method to prevent an event from being propagated to parent elements.
               */
  def stopPropagation(): scala.Unit = js.native
}

/**
        * Provides cross-browser access to DOM event properties and helper APIs that are used to attach handlers to DOM element events.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb310935(v=vs.100).aspx}
        */
@JSGlobal("Sys.UI.DomEvent")
@js.native
object DomEvent extends js.Object {
  //#endregion
  //#region Methods
  /**
               * Provides a method to add a DOM event handler to the DOM element that exposes the event. This member is static and can be invoked without creating an instance of the class.
               * Use the addHandler method to add a DOM event handler to the element that exposes the event. The eventName parameter should not include the "on" prefix. For example, specify "click" instead of "onclick".
               * This method can be accessed through the $addHandler shortcut method.
               *
               * @param element
               *          The element that exposes the event.
               * @param eventName
               *          The name of the event.
               * @param handler
               *          The client function that is called when the event occurs.
               * @param autoRemove
               *          (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
               */
  def addHandler(
    element: stdLib.HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ this.type, scala.Unit]
  ): scala.Unit = js.native
  //#endregion
  //#region Methods
  /**
               * Provides a method to add a DOM event handler to the DOM element that exposes the event. This member is static and can be invoked without creating an instance of the class.
               * Use the addHandler method to add a DOM event handler to the element that exposes the event. The eventName parameter should not include the "on" prefix. For example, specify "click" instead of "onclick".
               * This method can be accessed through the $addHandler shortcut method.
               *
               * @param element
               *          The element that exposes the event.
               * @param eventName
               *          The name of the event.
               * @param handler
               *          The client function that is called when the event occurs.
               * @param autoRemove
               *          (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
               */
  def addHandler(
    element: stdLib.HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ this.type, scala.Unit],
    autoRemove: scala.Boolean
  ): scala.Unit = js.native
  /**
               * Adds a list of DOM event handlers to the DOM element that exposes the events. This member is static and can be invoked without creating an instance of the class.
               * Use the addHandlers method to add a list of DOM event handlers to the element that exposes the event.
               * The events parameter takes a comma-separated list of name/value pairs in the format name:value, where name is the name of the DOM event and value is the name of the handler function.
               * If there is more than one name/value pair, the list must be enclosed in braces ({}) to identify it as a single parameter. Multiple name/value pairs are separated with commas.
               * Event names should not include the "on" prefix. For example, specify "click" instead of "onclick".
               * If handlerOwner is specified, delegates are created for each handler. These delegates are attached to the specified object instance, and the this pointer from the delegate handler will refer to the handlerOwner object.
               * This method can be accessed through the $addHandlers shortcut method.
               *
               * @param element
               *          The DOM element that exposes the events.
               * @param events
               *          A dictionary of event handlers.
               * @param handlerOwner
               *          (Optional) The object instance that is the context for the delegates that should be created from the handlers.
               * @param autoRemove
               *          (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
               *
               * @throws Error.invalidOperation - (Debug) One of the handlers specified in events is not a function.
               *
               */
  def addHandlers(
    element: stdLib.HTMLElement,
    events: ScalablyTyped.runtime.StringDictionary[js.Function1[/* e */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit]]
  ): scala.Unit = js.native
  /**
               * Adds a list of DOM event handlers to the DOM element that exposes the events. This member is static and can be invoked without creating an instance of the class.
               * Use the addHandlers method to add a list of DOM event handlers to the element that exposes the event.
               * The events parameter takes a comma-separated list of name/value pairs in the format name:value, where name is the name of the DOM event and value is the name of the handler function.
               * If there is more than one name/value pair, the list must be enclosed in braces ({}) to identify it as a single parameter. Multiple name/value pairs are separated with commas.
               * Event names should not include the "on" prefix. For example, specify "click" instead of "onclick".
               * If handlerOwner is specified, delegates are created for each handler. These delegates are attached to the specified object instance, and the this pointer from the delegate handler will refer to the handlerOwner object.
               * This method can be accessed through the $addHandlers shortcut method.
               *
               * @param element
               *          The DOM element that exposes the events.
               * @param events
               *          A dictionary of event handlers.
               * @param handlerOwner
               *          (Optional) The object instance that is the context for the delegates that should be created from the handlers.
               * @param autoRemove
               *          (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
               *
               * @throws Error.invalidOperation - (Debug) One of the handlers specified in events is not a function.
               *
               */
  def addHandlers(
    element: stdLib.HTMLElement,
    events: ScalablyTyped.runtime.StringDictionary[js.Function1[/* e */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit]],
    handlerOwner: js.Any
  ): scala.Unit = js.native
  /**
               * Adds a list of DOM event handlers to the DOM element that exposes the events. This member is static and can be invoked without creating an instance of the class.
               * Use the addHandlers method to add a list of DOM event handlers to the element that exposes the event.
               * The events parameter takes a comma-separated list of name/value pairs in the format name:value, where name is the name of the DOM event and value is the name of the handler function.
               * If there is more than one name/value pair, the list must be enclosed in braces ({}) to identify it as a single parameter. Multiple name/value pairs are separated with commas.
               * Event names should not include the "on" prefix. For example, specify "click" instead of "onclick".
               * If handlerOwner is specified, delegates are created for each handler. These delegates are attached to the specified object instance, and the this pointer from the delegate handler will refer to the handlerOwner object.
               * This method can be accessed through the $addHandlers shortcut method.
               *
               * @param element
               *          The DOM element that exposes the events.
               * @param events
               *          A dictionary of event handlers.
               * @param handlerOwner
               *          (Optional) The object instance that is the context for the delegates that should be created from the handlers.
               * @param autoRemove
               *          (Optional) A boolean value that determines whether the handler should be removed automatically when the element is disposed.
               *
               * @throws Error.invalidOperation - (Debug) One of the handlers specified in events is not a function.
               *
               */
  def addHandlers(
    element: stdLib.HTMLElement,
    events: ScalablyTyped.runtime.StringDictionary[js.Function1[/* e */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit]],
    handlerOwner: js.Any,
    autoRemove: scala.Boolean
  ): scala.Unit = js.native
  /**
               * Removes all DOM event handlers from a DOM element that were added through the Sys.UI.DomEvent addHandler or the Sys.UI.DomEvent addHandlers methods.
               * This member is static and can be invoked without creating an instance of the class.
               * This method can be accessed through the $clearHandlers shortcut method.
               *
               * @param element
               *          The element that exposes the events.
               */
  def clearHandlers(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
               * Removes a DOM event handler from the DOM element that exposes the event. This member is static and can be invoked without creating an instance of the class.
               *
               * @param element
               *          The element that exposes the event.
               * @param eventName
               *          The name of the event.
               * @param handler
               *          The event handler to remove.
               */
  def removeHandler(
    element: stdLib.HTMLElement,
    eventName: java.lang.String,
    handler: js.Function1[/* e */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

