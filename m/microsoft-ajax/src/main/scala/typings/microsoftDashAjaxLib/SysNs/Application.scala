package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Classes
/**
  * Provides a run-time object that exposes client events and manages client components that are registered with the application.
  * The members of this object are available globally after the client application has been initialized.
  * The members can be invoked without creating an instance of the class.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384161(v=vs.100).aspx}
  */
@js.native
//#region Constructors
trait Application
  extends Component
     with IContainer {
  //#endregion
  //#region Methods
  /**
    * Registers a component with the application and initializes it if the component is not already initialized.
    */
  def addComponent(component: js.Any): scala.Unit = js.native
  /**
    * Creates a history point and adds it to the browser's history stack.
    */
  def addHistoryPoint(state: js.Object): scala.Unit = js.native
  def addHistoryPoint(state: js.Object, title: java.lang.String): scala.Unit = js.native
  //#endregion
  //#region Events
  /**
    * Raised after all scripts have been loaded but before objects are created.
    */
  def add_init(handler: js.Function2[/* sender */ this.type, /* eventArgs */ EventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised after all scripts have been loaded and after the objects in the application have been created and initialized.
    */
  def add_load(
    handler: js.Function2[/* sender */ this.type, /* eventArgs */ ApplicationLoadEventArgs, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Occurs when the user clicks the browser's Back or Forward button.
    */
  def add_navigate(handler: js.Function2[/* sender */ this.type, /* eventArgs */ HistoryEventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised before all objects in the client application are disposed, typically when the DOM window.unload event is raised.
    */
  def add_unload(handler: js.Function): scala.Unit = js.native
  /**
    * Instructs the application to start creating components.
    */
  def beginCreateComponents(): scala.Unit = js.native
  /**
    * Releases resources and dependencies associated with an element and its child nodes.
    * @param element
    *           The element to dispose.
    * @param childNodesOnly
    *           A boolean value used to determine whether to dispose of the element and its child nodes or to dispose only its child nodes.
    */
  def disposeElement(element: stdLib.Element, childNodesOnly: scala.Boolean): scala.Unit = js.native
  /**
    * Instructs the application to finalize component creation.
    */
  def endCreateComponents(): scala.Unit = js.native
  def findComponent(id: java.lang.String, parent: Component): Component = js.native
  def findComponent(id: java.lang.String, parent: stdLib.HTMLElement): Component = js.native
  //#endregion
  //#region Properties
  /**
    * Gets or sets a value that indicates whether the Web application supports history point management.
    */
  def get_enableHistory(): scala.Boolean = js.native
  /**
    * Gets a value that indicates whether the application is in the process of creating components. This member is static and can be invoked without creating an instance of the class.
    */
  def get_isCreatingComponents(): scala.Boolean = js.native
  /**
    * Gets a value that indicates whether the application is in the process of disposing its resources. This member is static and can be invoked without creating an instance of the class.
    */
  def get_isDisposing(): scala.Boolean = js.native
  /**
    * Called by a referenced script to indicate that it has been loaded. This API is obsolete. You no longer need to call this method in order to notify the Microsoft Ajax Library that the JavaScript file has been loaded.
    */
  def notifyScriptLoaded(): scala.Unit = js.native
  /**
    * Raises the load event. This member is static and can be invoked without creating an instance of the class.
    */
  def raiseLoad(): scala.Unit = js.native
  /**
    * Registers with the application an object that will require disposing. This member is static and can be invoked without creating an instance of the class.
    */
  def registerDisposableObject(`object`: js.Any): scala.Unit = js.native
  /**
    * Raised after all scripts have been loaded but before objects are created.
    */
  def remove_init(handler: js.Function2[/* sender */ this.type, /* eventArgs */ EventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised after all scripts have been loaded and after the objects in the application have been created and initialized.
    */
  def remove_load(
    handler: js.Function2[/* sender */ this.type, /* eventArgs */ ApplicationLoadEventArgs, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Occurs when the user clicks the browser's Back or Forward button.
    */
  def remove_navigate(handler: js.Function2[/* sender */ this.type, /* eventArgs */ HistoryEventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised before all objects in the client application are disposed, typically when the DOM window.unload event is raised.
    */
  def remove_unload(handler: js.Function): scala.Unit = js.native
  /**
    * Gets or sets a value that indicates whether the Web application supports history point management.
    * @param value
    *           true to allow the Web application to support history points, or false to not allow history points.
    */
  def set_enableHistory(value: scala.Boolean): scala.Unit = js.native
  /**
    * Unregisters a disposable object from the application. This member is static and can be invoked without creating an instance of the class.
    */
  def unregisterDisposableObject(`object`: js.Any): scala.Unit = js.native
}

