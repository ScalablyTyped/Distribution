package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StringDictionary
import typings.microsoftAjax.Sys.UI.DomElement
import typings.microsoftAjax.Sys.UI.MouseButton
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Sys.UI Namespace
/**
  * Contains types related to the user interface (UI), such as controls, events, and UI properties in the Microsoft Ajax Library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397431(v=vs.100).aspx}
  */
object UI {
  
  @JSGlobal("Sys.UI")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides a base class for all ASP.NET AJAX client behaviors.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb311020(v=vs.100).aspx}
    */
  @JSGlobal("Sys.UI.Behavior")
  @js.native
  open class Behavior ()
    extends StObject
       with typings.microsoftAjax.Sys.UI.Behavior {
    
    //#endregion
    //#region Events
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def add_disposing(handler: js.Function): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def add_propertyChanged(handler: js.Function): Unit = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /**
      * Raises the disposing event of the current Component and removes the component from the application.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has finished.
      * This method is called by the create method ($create).
      * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
      */
    /* CompleteClass */
    override def endUpdate(): Unit = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Behavior object is associated with.
      * @return The DOM element that the current Behavior object is associated with.
      */
    /* CompleteClass */
    override def get_element(): HTMLElement = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
      * This member supports the client-script infrastructure and is not intended to be used directly from your code.
      * @return
      *      An EventHandlerList object that contains references to all the events and handlers for this component.
      */
    /* CompleteClass */
    override def get_events(): Any = js.native
    
    /**
      * Gets the ID of the current Component object.
      * @return
      *       The id
      */
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /**
      * Gets a value indicating whether the current Component object is initialized.
      * @return
      *      true if the current Component is initialized; otherwise, false.
      */
    /* CompleteClass */
    override def get_isInitialized(): Boolean = js.native
    
    /**
      * Gets a value indicating whether the current Component object is updating.
      * @return
      *      true if the current Component object is updating; otherwise, false.
      */
    /* CompleteClass */
    override def get_isUpdating(): Boolean = js.native
    
    /**
      * Gets or sets the name of the Sys.UI.Behavior object.
      */
    /* CompleteClass */
    override def get_name(): String = js.native
    
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def remove_disposing(handler: js.Function): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def remove_propertyChanged(handler: js.Function): Unit = js.native
    
    /**
      * Sets the ID of the current Component object.
      * @param value A string that contains the ID of the component.
      */
    /* CompleteClass */
    override def set_id(value: String): Unit = js.native
    
    /*
      * Gets or sets the name of the Sys.UI.Behavior object.
      * If you do not explicitly set the name property, getting the property value sets it to its default value, which is equal to the type of the Behavior object. The name property remains null until it is accessed.
      * @param value
      *           A string value to use as the name.
      */
    /* CompleteClass */
    override def set_name(value: String): Unit = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  object Behavior {
    
    @JSGlobal("Sys.UI.Behavior")
    @js.native
    val ^ : js.Any = js.native
    
    //#region Methods
    /**
      * Gets a Sys.UI.Behavior instance with the specified name property from the specified HTML Document Object Model (DOM) element. This member a static member and can be invoked without creating an instance of the class.
      * @return The specified Behavior object, if found; otherwise, null.
      */
    /* static member */
    inline def getBehaviorByName(element: HTMLElement, name: String): typings.microsoftAjax.Sys.UI.Behavior = (^.asInstanceOf[js.Dynamic].applyDynamic("getBehaviorByName")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.UI.Behavior]
    
    /**
      * Gets the Sys.UI.Behavior objects that are associated with the specified HTML Document Object Model (DOM) element. This member is static and can be invoked without creating an instance of the class.
      * @param element
      *           The HTMLElement object to search.
      * @return An array of references to Behavior objects, or null if no references exist.
      */
    /* static member */
    inline def getBehaviors(element: DomElement): js.Array[typings.microsoftAjax.Sys.UI.Behavior] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBehaviors")(element.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.microsoftAjax.Sys.UI.Behavior]]
    
    /**
      * Gets an array of Sys.UI.Behavior objects that are of the specified type from the specified HTML Document Object Model (DOM) element. This method is static and can be invoked without creating an instance of the class.
      * @return An array of all Behavior objects of the specified type that are associated with the specified DOM element, if found; otherwise, an empty array.
      */
    /* static member */
    inline def getBehaviorsByType(element: HTMLElement, `type`: typings.microsoftAjax.Sys.UI.Behavior): js.Array[typings.microsoftAjax.Sys.UI.Behavior] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBehaviorsByType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.microsoftAjax.Sys.UI.Behavior]]
  }
  
  /**
    * Creates an object that contains a set of integer coordinates representing position, width, and height.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397698(v=vs.100).aspx}
    */
  @JSGlobal("Sys.UI.Bounds")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.UI.Bounds class.
    */
  open class Bounds ()
    extends StObject
       with typings.microsoftAjax.Sys.UI.Bounds {
    
    //#endregion
    //#region Fields
    /**
      * Gets the height of an object in pixels. This property is read-only.
      * @return A number that represents the height of an object in pixels.
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Gets the width of an object in pixels. This property is read-only.
      * @return A number that represents the width of an object in pixels.
      */
    /* CompleteClass */
    var width: Double = js.native
    
    /**
      * Gets the x-coordinate of an object in pixels.
      * @return A number that represents the x-coordinate of an object in pixels.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Gets the y-coordinate of anobject in pixels.
      * @return A number that represents the y-coordinate of an object in pixels.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * Provides the base class for all all ASP.NET AJAX client controls.
    */
  @JSGlobal("Sys.UI.Control")
  @js.native
  open class Control protected ()
    extends StObject
       with typings.microsoftAjax.Sys.UI.Control {
    //#region Constructors
    /**
      * When called from a derived class, initializes a new instance of that class.
      * The Control constructor is a complete constructor function. However, because the Control class is an abstract base class, the constructor should be called only from derived classes.
      * @param element
      *           The HTMLElement object that the control will be associated with.
      *
      * @throws Error.invalidOperation Function
      */
    def this(element: HTMLElement) = this()
    
    //#endregion
    //#region Methods
    /**
      * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
      * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
      * @param className
      *          A string that contains the name of the CSS class to add.
      */
    /* CompleteClass */
    override def addCssClass(className: String): Unit = js.native
    
    //#endregion
    //#region Events
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def add_disposing(handler: js.Function): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def add_propertyChanged(handler: js.Function): Unit = js.native
    
    //#endregion
    //#region Methods
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has begun.
      */
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /**
      * Raises the disposing event of the current Component and removes the component from the application.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Called by the create method to indicate that the process of setting properties of a component instance has finished.
      * This method is called by the create method ($create).
      * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
      */
    /* CompleteClass */
    override def endUpdate(): Unit = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
      * @return The DOM element that the current Control object is associated with.
      */
    /* CompleteClass */
    override def get_element(): HTMLElement = js.native
    
    //#endregion
    //#region Properties
    /**
      * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
      * This member supports the client-script infrastructure and is not intended to be used directly from your code.
      * @return
      *      An EventHandlerList object that contains references to all the events and handlers for this component.
      */
    /* CompleteClass */
    override def get_events(): Any = js.native
    
    /**
      * Gets the ID of the current Component object.
      * @return
      *       The id
      */
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /**
      * Gets a value indicating whether the current Component object is initialized.
      * @return
      *      true if the current Component is initialized; otherwise, false.
      */
    /* CompleteClass */
    override def get_isInitialized(): Boolean = js.native
    
    /**
      * Gets a value indicating whether the current Component object is updating.
      * @return
      *      true if the current Component object is updating; otherwise, false.
      */
    /* CompleteClass */
    override def get_isUpdating(): Boolean = js.native
    
    /**
      * Initializes the current Component object.
      * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
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
    /* CompleteClass */
    override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
    
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
    /* CompleteClass */
    override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
    
    /**
      * Raises the propertyChanged event for the specified property.
      * @param propertyName
      *               The name of the property that changed.
      */
    /* CompleteClass */
    override def raisePropertyChanged(propertyName: String): Unit = js.native
    
    /**
      * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
      * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
      *
      * @param className
      *          A string that contains the name of the CSS class to remove.
      */
    /* CompleteClass */
    override def removeCssClass(className: String): Unit = js.native
    
    /**
      * Raised when the dispose method is called for a component.
      */
    /* CompleteClass */
    override def remove_disposing(handler: js.Function): Unit = js.native
    
    /**
      * Raised when the raisePropertyChanged method of the current Component object is called.
      */
    /* CompleteClass */
    override def remove_propertyChanged(handler: js.Function): Unit = js.native
    
    /**
      * Sets the ID of the current Component object.
      * @param value A string that contains the ID of the component.
      */
    /* CompleteClass */
    override def set_id(value: String): Unit = js.native
    
    /**
      * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
      * @param className
      *          A string that contains the name of the CSS class to toggle.
      */
    /* CompleteClass */
    override def toggleCssClass(className: String): Unit = js.native
    
    /**
      * Called by the endUpdate method as a placeholder for additional logic in derived classes.
      * Override the updated method in a derived class to add custom post-update logic.
      */
    /* CompleteClass */
    override def updated(): Unit = js.native
  }
  
  @JSGlobal("Sys.UI.DomElement")
  @js.native
  def DomElement: typings.microsoftAjax.Sys.UI.DomElement = js.native
  inline def DomElement_=(x: DomElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DomElement")(x.asInstanceOf[js.Any])
  
  /**
    * Provides cross-browser access to DOM event properties and helper APIs that are used to attach handlers to DOM element events.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310935(v=vs.100).aspx}
    */
  @JSGlobal("Sys.UI.DomEvent")
  @js.native
  open class DomEvent protected ()
    extends StObject
       with typings.microsoftAjax.Sys.UI.DomEvent {
    //#region Constructors
    /**
      * Initializes a new instance of the Sys.UI.DomEvent class and associates it with the specified HTMLElement object.
      * @param domElement
      *           The HTMLElement object to associate with the event.
      */
    def this(domElement: HTMLElement) = this()
    
    //#endregion
    //#region Fields
    /**
      * Gets a Boolean value that indicates the state of the ALT key when the associated event occurred.
      * Use the altKey field to determine whether the ALT key is pressed when the event occurred.
      *
      * @return true if the ALT key was pressed when the event occurred; otherwise, false.
      */
    /* CompleteClass */
    var altKey: Boolean = js.native
    
    /**
      * Gets a Sys.UI.MouseButton enumeration value that indicates the button state of the mouse when the related event occurred.
      * Use the button field to determine which mouse button was pressed when the related event occurred.
      * @return A MouseButton value
      */
    /* CompleteClass */
    var button: MouseButton = js.native
    
    /**
      * Gets the character code of the key that raised the associated keyPress event.
      * Use the charCode field to get the character code of a pressed key or key combination that raised a keyPress event.
      * The keyPress event provides a single character code that identifies key combinations.
      * The keyPress event is not raised for single modifier keys such as ALT, CTRL, and SHIFT.
      *
      * @return An integer value that represents the character code of the key or key combination that was pressed to raise the keyPress event.
      */
    /* CompleteClass */
    var charCode: Double = js.native
    
    /**
      * Gets the x-coordinate of the mouse pointer's position relative to the client area of the browser window, excluding window scroll bars.
      * @return An integer that represents the x-coordinate in pixels.
      */
    /* CompleteClass */
    var clientX: Double = js.native
    
    /**
      * Gets the y-coordinate of the mouse pointer's position relative to the client area of the browser window, excluding window scroll bars.
      * @return An integer that represents the y-coordinate in pixels.
      */
    /* CompleteClass */
    var clientY: Double = js.native
    
    /**
      * Gets a Boolean value that indicates the state of the CTRL key when the associated event occurred.
      * @return true if the CTRL key was pressed when the event occurred; otherwise, false.
      */
    /* CompleteClass */
    var ctrlKey: Boolean = js.native
    
    /**
      * Gets the key code of the key that raised the keyUp or keyDown event.
      * @return An integer value that represents the key code of the key that was pressed to raise the keyUp or keyDown event.
      */
    /* CompleteClass */
    var keyCode: Double = js.native
    
    /**
      * Gets the x-coordinate of the mouse pointer's position relative to the object that raised the event.
      * @return An integer that represents the x-coordinate in pixels.
      */
    /* CompleteClass */
    var offsetX: Double = js.native
    
    /**
      * Gets the y-coordinate of the mouse pointer's position relative to the object that raised the event.
      * @return An integer that represents the y-coordinate in pixels.
      */
    /* CompleteClass */
    var offsetY: Double = js.native
    
    /**
      * Prevents the default DOM event action from happening.
      * Use the preventDefault method to prevent the default event action for the browser from occurring.
      * For example, if you prevent the keydown event of an input element from occurring, the character typed by the user is not automatically appended to the input element's value.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Gets the x-coordinate of the mouse pointer's position relative to the user's screen.
      * @return An integer that represents the x-coordinate in pixels.
      */
    /* CompleteClass */
    var screenX: Double = js.native
    
    /**
      * Gets the y-coordinate of the mouse pointer's position relative to the user's screen.
      * @return An integer that represents the y-coordinate in pixels.
      */
    /* CompleteClass */
    var screenY: Double = js.native
    
    /**
      * Gets a Boolean value that indicates the state of the SHIFT key when the associated event occurred.
      * @return true if the SHIFT key was pressed when the event occurred; otherwise, false.
      */
    /* CompleteClass */
    var shiftKey: Boolean = js.native
    
    /**
      * Prevents an event from being propagated (bubbled) to parent elements.
      * By default, event notification is bubbled from a child object to parent objects until it reaches the document object.
      * The event notification stops if the event is handled during the propagation process.
      * Use the stopPropagation method to prevent an event from being propagated to parent elements.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /**
      * Gets the object that the event acted on.
      * @return An object that represents the target that the event acted on.
      */
    /* CompleteClass */
    var target: Any = js.native
    
    /**
      * Gets the name of the event that was raised.
      * @return A string that represents the name of the event that was raised.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  object DomEvent {
    
    @JSGlobal("Sys.UI.DomEvent")
    @js.native
    val ^ : js.Any = js.native
    
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
    /* static member */
    inline def addHandler(
      element: HTMLElement,
      eventName: String,
      handler: js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addHandler(
      element: HTMLElement,
      eventName: String,
      handler: js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit],
      autoRemove: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], autoRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    /* static member */
    inline def addHandlers(
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addHandlers(
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]],
      handlerOwner: Any
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any], handlerOwner.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addHandlers(
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]],
      handlerOwner: Any,
      autoRemove: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any], handlerOwner.asInstanceOf[js.Any], autoRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addHandlers(
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]],
      handlerOwner: Unit,
      autoRemove: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandlers")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any], handlerOwner.asInstanceOf[js.Any], autoRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes all DOM event handlers from a DOM element that were added through the Sys.UI.DomEvent addHandler or the Sys.UI.DomEvent addHandlers methods.
      * This member is static and can be invoked without creating an instance of the class.
      * This method can be accessed through the $clearHandlers shortcut method.
      *
      * @param element
      *          The element that exposes the events.
      */
    /* static member */
    inline def clearHandlers(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHandlers")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    /* static member */
    inline def removeHandler(
      element: HTMLElement,
      eventName: String,
      handler: js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHandler")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Describes key codes.
    * The values correspond to values in the Document Object Model (DOM).
    */
  @JSGlobal("Sys.UI.Key")
  @js.native
  object Key extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftAjax.Sys.UI.Key & Double] = js.native
    
    /* 0 */ val backspace: typings.microsoftAjax.Sys.UI.Key.backspace & Double = js.native
    
    /* 13 */ val del: typings.microsoftAjax.Sys.UI.Key.del & Double = js.native
    
    /* 12 */ val down: typings.microsoftAjax.Sys.UI.Key.down & Double = js.native
    
    /* 7 */ val end: typings.microsoftAjax.Sys.UI.Key.end & Double = js.native
    
    /* 2 */ val enter: typings.microsoftAjax.Sys.UI.Key.enter & Double = js.native
    
    /* 3 */ val esc: typings.microsoftAjax.Sys.UI.Key.esc & Double = js.native
    
    /* 8 */ val home: typings.microsoftAjax.Sys.UI.Key.home & Double = js.native
    
    /* 9 */ val left: typings.microsoftAjax.Sys.UI.Key.left & Double = js.native
    
    /* 6 */ val pageDown: typings.microsoftAjax.Sys.UI.Key.pageDown & Double = js.native
    
    /* 5 */ val pageUp: typings.microsoftAjax.Sys.UI.Key.pageUp & Double = js.native
    
    /* 11 */ val right: typings.microsoftAjax.Sys.UI.Key.right & Double = js.native
    
    /* 4 */ val space: typings.microsoftAjax.Sys.UI.Key.space & Double = js.native
    
    /* 1 */ val tab: typings.microsoftAjax.Sys.UI.Key.tab & Double = js.native
    
    /* 10 */ val up: typings.microsoftAjax.Sys.UI.Key.up & Double = js.native
  }
  
  /**
    * Describes mouse button locations.
    */
  @JSGlobal("Sys.UI.MouseButton")
  @js.native
  object MouseButton extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftAjax.Sys.UI.MouseButton & Double] = js.native
    
    /* 0 */ val leftButton: typings.microsoftAjax.Sys.UI.MouseButton.leftButton & Double = js.native
    
    /* 1 */ val middleButton: typings.microsoftAjax.Sys.UI.MouseButton.middleButton & Double = js.native
    
    /* 2 */ val rightButton: typings.microsoftAjax.Sys.UI.MouseButton.rightButton & Double = js.native
  }
  
  /**
    * Creates an object that contains a set of integer coordinates that represent a position. The getLocation method of the HTMLElement class returns a Point object.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb383992(v=vs.100).aspx}        *
    */
  @JSGlobal("Sys.UI.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typings.microsoftAjax.Sys.UI.Point {
    //#region Constructors
    /**
      * Creates an object that contains a set of integer coordinates that represent a position.
      * @param x The number of pixels between the location and the left edge of the parent frame.
      * @param y The number of pixels between the location and the top edge of the parent frame.
      */
    def this(x: Double, y: Double) = this()
    
    //#endregion
    //#region Fields
    /**
      * Gets the x-coordinate of a Sys.UI.Point object in pixels. This property is read-only.
      * @return A number that represents the x-coordinate of the Point object in pixels.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Gets the y-coordinate of a Sys.UI.Point object in pixels. This property is read-only.
      * @return A number that represents the y-coordinate of the Point object in pixels.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * Describes the layout of a DOM element in the page when the element's visible property is set to false.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397498(v=vs.100).aspx}
    */
  @JSGlobal("Sys.UI.VisibilityMode")
  @js.native
  object VisibilityMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftAjax.Sys.UI.VisibilityMode & Double] = js.native
    
    /* 1 */ val collapse: typings.microsoftAjax.Sys.UI.VisibilityMode.collapse & Double = js.native
    
    /* 0 */ val hide: typings.microsoftAjax.Sys.UI.VisibilityMode.hide & Double = js.native
  }
}
