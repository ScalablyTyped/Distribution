package typings.microsoftAjax.global.Sys

import typings.microsoftAjax.Type
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class Component ()
  extends StObject
     with typings.microsoftAjax.Sys.Component {
  
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
  
  /**
    * Called by the endUpdate method as a placeholder for additional logic in derived classes.
    * Override the updated method in a derived class to add custom post-update logic.
    */
  /* CompleteClass */
  override def updated(): Unit = js.native
}
object Component {
  
  @JSGlobal("Sys.Component")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def create(`type`: Type): typings.microsoftAjax.Sys.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any, events: Any): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any, events: Any, references: Any): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any, events: Any, references: Any, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any, events: Any, references: Unit, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any, events: Unit, references: Any): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any, events: Unit, references: Any, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Any, events: Unit, references: Unit, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Unit, events: Any): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Unit, events: Any, references: Any): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Unit, events: Any, references: Any, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Unit, events: Any, references: Unit, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Unit, events: Unit, references: Any): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Unit, events: Unit, references: Any, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
  inline def create(`type`: Type, properties: Unit, events: Unit, references: Unit, element: HTMLElement): typings.microsoftAjax.Sys.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], events.asInstanceOf[js.Any], references.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[typings.microsoftAjax.Sys.Component]
}
