package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StringDictionary
import typings.microsoftAjax.Sys.UI.DomElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Sys.UI Namespace
/**
  * Contains types related to the user interface (UI), such as controls, events, and UI properties in the Microsoft Ajax Library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397431(v=vs.100).aspx}
  */
@JSGlobal("Sys.UI")
@js.native
object UI extends js.Object {
  
  var DomElement: typings.microsoftAjax.Sys.UI.DomElement = js.native
  
  /**
    * Provides a base class for all ASP.NET AJAX client behaviors.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb311020(v=vs.100).aspx}
    */
  @js.native
  class Behavior ()
    extends typings.microsoftAjax.Sys.UI.Behavior
  /* static members */
  @js.native
  object Behavior extends js.Object {
    
    //#region Methods
    /**
      * Gets a Sys.UI.Behavior instance with the specified name property from the specified HTML Document Object Model (DOM) element. This member a static member and can be invoked without creating an instance of the class.
      * @return The specified Behavior object, if found; otherwise, null.
      */
    def getBehaviorByName(element: HTMLElement, name: String): typings.microsoftAjax.Sys.UI.Behavior = js.native
    
    /**
      * Gets the Sys.UI.Behavior objects that are associated with the specified HTML Document Object Model (DOM) element. This member is static and can be invoked without creating an instance of the class.
      * @param element
      *           The HTMLElement object to search.
      * @return An array of references to Behavior objects, or null if no references exist.
      */
    def getBehaviors(element: DomElement): js.Array[typings.microsoftAjax.Sys.UI.Behavior] = js.native
    
    /**
      * Gets an array of Sys.UI.Behavior objects that are of the specified type from the specified HTML Document Object Model (DOM) element. This method is static and can be invoked without creating an instance of the class.
      * @return An array of all Behavior objects of the specified type that are associated with the specified DOM element, if found; otherwise, an empty array.
      */
    def getBehaviorsByType(element: HTMLElement, `type`: typings.microsoftAjax.Sys.UI.Behavior): js.Array[typings.microsoftAjax.Sys.UI.Behavior] = js.native
  }
  
  /**
    * Creates an object that contains a set of integer coordinates representing position, width, and height.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397698(v=vs.100).aspx}
    */
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.UI.Bounds class.
    */
  class Bounds ()
    extends typings.microsoftAjax.Sys.UI.Bounds
  
  /**
    * Provides the base class for all all ASP.NET AJAX client controls.
    */
  @js.native
  class Control protected ()
    extends typings.microsoftAjax.Sys.UI.Control {
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
  }
  
  /**
    * Provides cross-browser access to DOM event properties and helper APIs that are used to attach handlers to DOM element events.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310935(v=vs.100).aspx}
    */
  @js.native
  class DomEvent protected ()
    extends typings.microsoftAjax.Sys.UI.DomEvent {
    //#region Constructors
    /**
      * Initializes a new instance of the Sys.UI.DomEvent class and associates it with the specified HTMLElement object.
      * @param domElement
      *           The HTMLElement object to associate with the event.
      */
    def this(domElement: HTMLElement) = this()
  }
  /* static members */
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
    def addHandler(element: HTMLElement, eventName: String, handler: js.Function1[/* e */ this.type, Unit]): Unit = js.native
    def addHandler(
      element: HTMLElement,
      eventName: String,
      handler: js.Function1[/* e */ this.type, Unit],
      autoRemove: Boolean
    ): Unit = js.native
    
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
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]]
    ): Unit = js.native
    def addHandlers(
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]],
      handlerOwner: js.UndefOr[scala.Nothing],
      autoRemove: Boolean
    ): Unit = js.native
    def addHandlers(
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]],
      handlerOwner: js.Any
    ): Unit = js.native
    def addHandlers(
      element: HTMLElement,
      events: StringDictionary[js.Function1[/* e */ typings.microsoftAjax.Sys.UI.DomEvent, Unit]],
      handlerOwner: js.Any,
      autoRemove: Boolean
    ): Unit = js.native
    
    /**
      * Removes all DOM event handlers from a DOM element that were added through the Sys.UI.DomEvent addHandler or the Sys.UI.DomEvent addHandlers methods.
      * This member is static and can be invoked without creating an instance of the class.
      * This method can be accessed through the $clearHandlers shortcut method.
      *
      * @param element
      *          The element that exposes the events.
      */
    def clearHandlers(element: HTMLElement): Unit = js.native
    
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
    def removeHandler(element: HTMLElement, eventName: String, handler: js.Function1[/* e */ this.type, Unit]): Unit = js.native
  }
  
  /**
    * Describes key codes.
    * The values correspond to values in the Document Object Model (DOM).
    */
  @js.native
  object Key extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftAjax.Sys.UI.Key with Double] = js.native
    
    /* 0 */ val backspace: typings.microsoftAjax.Sys.UI.Key.backspace with Double = js.native
    
    /* 13 */ val del: typings.microsoftAjax.Sys.UI.Key.del with Double = js.native
    
    /* 12 */ val down: typings.microsoftAjax.Sys.UI.Key.down with Double = js.native
    
    /* 7 */ val end: typings.microsoftAjax.Sys.UI.Key.end with Double = js.native
    
    /* 2 */ val enter: typings.microsoftAjax.Sys.UI.Key.enter with Double = js.native
    
    /* 3 */ val esc: typings.microsoftAjax.Sys.UI.Key.esc with Double = js.native
    
    /* 8 */ val home: typings.microsoftAjax.Sys.UI.Key.home with Double = js.native
    
    /* 9 */ val left: typings.microsoftAjax.Sys.UI.Key.left with Double = js.native
    
    /* 6 */ val pageDown: typings.microsoftAjax.Sys.UI.Key.pageDown with Double = js.native
    
    /* 5 */ val pageUp: typings.microsoftAjax.Sys.UI.Key.pageUp with Double = js.native
    
    /* 11 */ val right: typings.microsoftAjax.Sys.UI.Key.right with Double = js.native
    
    /* 4 */ val space: typings.microsoftAjax.Sys.UI.Key.space with Double = js.native
    
    /* 1 */ val tab: typings.microsoftAjax.Sys.UI.Key.tab with Double = js.native
    
    /* 10 */ val up: typings.microsoftAjax.Sys.UI.Key.up with Double = js.native
  }
  
  /**
    * Describes mouse button locations.
    */
  @js.native
  object MouseButton extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftAjax.Sys.UI.MouseButton with Double] = js.native
    
    /* 0 */ val leftButton: typings.microsoftAjax.Sys.UI.MouseButton.leftButton with Double = js.native
    
    /* 1 */ val middleButton: typings.microsoftAjax.Sys.UI.MouseButton.middleButton with Double = js.native
    
    /* 2 */ val rightButton: typings.microsoftAjax.Sys.UI.MouseButton.rightButton with Double = js.native
  }
  
  /**
    * Creates an object that contains a set of integer coordinates that represent a position. The getLocation method of the HTMLElement class returns a Point object.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb383992(v=vs.100).aspx}        *
    */
  @js.native
  class Point protected ()
    extends typings.microsoftAjax.Sys.UI.Point {
    //#region Constructors
    /**
      * Creates an object that contains a set of integer coordinates that represent a position.
      * @param x The number of pixels between the location and the left edge of the parent frame.
      * @param y The number of pixels between the location and the top edge of the parent frame.
      */
    def this(x: Double, y: Double) = this()
  }
  
  /**
    * Describes the layout of a DOM element in the page when the element's visible property is set to false.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb397498(v=vs.100).aspx}
    */
  @js.native
  object VisibilityMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftAjax.Sys.UI.VisibilityMode with Double] = js.native
    
    /* 1 */ val collapse: typings.microsoftAjax.Sys.UI.VisibilityMode.collapse with Double = js.native
    
    /* 0 */ val hide: typings.microsoftAjax.Sys.UI.VisibilityMode.hide with Double = js.native
  }
}
