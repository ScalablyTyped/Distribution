package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base class for the Control and Behavior classes, and for any other object whose lifetime should be managed by the ASP.NET AJAX client library.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397516(v=vs.100).aspx}
  */
@js.native
trait Component extends js.Object {
  //#endregion
  //#region Events
  /**
    * Raised when the dispose method is called for a component.
    */
  def add_disposing(handler: js.Function): Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  def add_propertyChanged(handler: js.Function): Unit = js.native
  //#endregion
  //#region Methods
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has begun.
    */
  def beginUpdate(): Unit = js.native
  /**
    * Raises the disposing event of the current Component and removes the component from the application.
    */
  def dispose(): Unit = js.native
  /**
    * Called by the create method to indicate that the process of setting properties of a component instance has finished.
    * This method is called by the create method ($create).
    * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
    */
  def endUpdate(): Unit = js.native
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
  def get_id(): String = js.native
  /**
    * Gets a value indicating whether the current Component object is initialized.
    * @return
    *      true if the current Component is initialized; otherwise, false.
    */
  def get_isInitialized(): Boolean = js.native
  /**
    * Gets a value indicating whether the current Component object is updating.
    * @return
    *      true if the current Component object is updating; otherwise, false.
    */
  def get_isUpdating(): Boolean = js.native
  /**
    * Initializes the current Component object.
    * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
    */
  def initialize(): Unit = js.native
  /**
    * Raises the propertyChanged event for the specified property.
    * @param propertyName
    *               The name of the property that changed.
    */
  def raisePropertyChanged(propertyName: String): Unit = js.native
  /**
    * Raised when the dispose method is called for a component.
    */
  def remove_disposing(handler: js.Function): Unit = js.native
  /**
    * Raised when the raisePropertyChanged method of the current Component object is called.
    */
  def remove_propertyChanged(handler: js.Function): Unit = js.native
  /**
    * Sets the ID of the current Component object.
    * @param value A string that contains the ID of the component.
    */
  def set_id(value: String): Unit = js.native
  /**
    * Called by the endUpdate method as a placeholder for additional logic in derived classes.
    * Override the updated method in a derived class to add custom post-update logic.
    */
  def updated(): Unit = js.native
}

object Component {
  @scala.inline
  def apply(
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    beginUpdate: () => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    initialize: () => Unit,
    raisePropertyChanged: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    set_id: String => Unit,
    updated: () => Unit
  ): Component = {
    val __obj = js.Dynamic.literal(add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), initialize = js.Any.fromFunction0(initialize), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), set_id = js.Any.fromFunction1(set_id), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[Component]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
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
    def setAdd_disposing(value: js.Function => Unit): Self = this.set("add_disposing", js.Any.fromFunction1(value))
    @scala.inline
    def setAdd_propertyChanged(value: js.Function => Unit): Self = this.set("add_propertyChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setBeginUpdate(value: () => Unit): Self = this.set("beginUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setEndUpdate(value: () => Unit): Self = this.set("endUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_events(value: () => js.Any): Self = this.set("get_events", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_id(value: () => String): Self = this.set("get_id", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_isInitialized(value: () => Boolean): Self = this.set("get_isInitialized", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_isUpdating(value: () => Boolean): Self = this.set("get_isUpdating", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    @scala.inline
    def setRaisePropertyChanged(value: String => Unit): Self = this.set("raisePropertyChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove_disposing(value: js.Function => Unit): Self = this.set("remove_disposing", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove_propertyChanged(value: js.Function => Unit): Self = this.set("remove_propertyChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_id(value: String => Unit): Self = this.set("set_id", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdated(value: () => Unit): Self = this.set("updated", js.Any.fromFunction0(value))
  }
  
}

