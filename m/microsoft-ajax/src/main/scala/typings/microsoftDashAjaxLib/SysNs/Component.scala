package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base class for the Control and Behavior classes, and for any other object whose lifetime should be managed by the ASP.NET AJAX client library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397516(v=vs.100).aspx}
  */
@JSGlobal("Sys.Component")
@js.native
//#region Constructors
/**
  * When overridden in a derived class, initializes an instance of that class and registers it with the application as a disposable object.
  */
class Component () extends js.Object {
  //#endregion
  //#region Events
  /**
    * Raised when the dispose method is called for a component.
    */
  def add_disposing(handler: js.Function): scala.Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  def add_propertyChanged(handler: js.Function): scala.Unit = js.native
  //#endregion
  //#region Methods
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has begun.
    */
  def beginUpdate(): scala.Unit = js.native
  /**
    * Raises the disposing event of the current Component and removes the component from the application.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has finished.
    * This method is called by the create method ($create).
    * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
    */
  def endUpdate(): scala.Unit = js.native
  //#endregion
  //#region Properties
  /**
    * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
    * This member supports the client-script infrastructure and is not intended to be used directly from your code.
    * @return
    *      An EventHandlerList object that contains references to all the events and handlers for this component.
    */
  def get_events(): js.Any = js.native
  /**
    * Gets the ID of the current Component object.
    * @return
    *       The id
    */
  def get_id(): java.lang.String = js.native
  /**
    * Gets a value indicating whether the current Component object is initialized.
    * @return
    *      true if the current Component is initialized; otherwise, false.
    */
  def get_isInitialized(): scala.Boolean = js.native
  /**
    * Gets a value indicating whether the current Component object is updating.
    * @return
    *      true if the current Component object is updating; otherwise, false.
    */
  def get_isUpdating(): scala.Boolean = js.native
  /**
    * Initializes the current Component object.
    * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
    */
  def initialize(): scala.Unit = js.native
  /**
    * Raises the propertyChanged event for the specified property.
    * @param propertyName
    *               The name of the property that changed.
    */
  def raisePropertyChanged(propertyName: java.lang.String): scala.Unit = js.native
  /**
    * Raised when the dispose method is called for a component.
    */
  def remove_disposing(handler: js.Function): scala.Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  def remove_propertyChanged(handler: js.Function): scala.Unit = js.native
  /**
    * Sets the ID of the current Component object.
    * @param value A string that contains the ID of the component.
    */
  def set_id(value: java.lang.String): scala.Unit = js.native
  /**
    * Called by the endUpdate method as a placeholder for additional logic in derived classes.
    * Override the updated method in a derived class to add custom post-update logic.
    */
  def updated(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Sys.Component")
@js.native
object Component extends js.Object {
  /**
    * Creates and initializes a component of the specified type. This method is static and can be called without creating an instance of the class.
    * @param type
    *           The type of the component to create.
    * @param properties
    *           (Optional) A JSON object that describes the properties and their values.
    * @param events
    *           (Optional) A JSON object that describes the events and their handlers.
    * @param references
    *           (Optional) A JSON object that describes the properties that are references to other components.
    * @param element
    *           (Optional) The DOM element that the component should be attached to.
    *
    * @returns A new instance of a component that uses the specified parameters.
    */
  def create(`type`: microsoftDashAjaxLib.Type): microsoftDashAjaxLib.SysNs.Component = js.native
  def create(`type`: microsoftDashAjaxLib.Type, properties: js.Any): microsoftDashAjaxLib.SysNs.Component = js.native
  def create(`type`: microsoftDashAjaxLib.Type, properties: js.Any, events: js.Any): microsoftDashAjaxLib.SysNs.Component = js.native
  def create(`type`: microsoftDashAjaxLib.Type, properties: js.Any, events: js.Any, references: js.Any): microsoftDashAjaxLib.SysNs.Component = js.native
  def create(
    `type`: microsoftDashAjaxLib.Type,
    properties: js.Any,
    events: js.Any,
    references: js.Any,
    element: stdLib.HTMLElement
  ): microsoftDashAjaxLib.SysNs.Component = js.native
}

