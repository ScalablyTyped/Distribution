package typings.officeJs.Visio

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Visio.Interfaces.ApplicationData
import typings.officeJs.Visio.Interfaces.ApplicationLoadOptions
import typings.officeJs.Visio.Interfaces.ApplicationUpdateData
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.CommandBar
import typings.officeJs.officeJsStrings.PageNavigationBar
import typings.officeJs.officeJsStrings.StatusBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Application.
  *
  * [Api set:  1.1]
  */
@js.native
trait Application
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Application = js.native
  def load(options: ApplicationLoadOptions): Application = js.native
  def load(propertyNamesAndPaths: Expand): Application = js.native
  def load(propertyNames: String): Application = js.native
  def load(propertyNames: js.Array[String]): Application = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Application): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.Application): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ApplicationUpdateData): Unit = js.native
  def set(properties: ApplicationUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: ApplicationData): Unit = js.native
  
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: Boolean = js.native
  
  /**
    *
    * Sets the visibility of a specific toolbar in the application.
    *
    * [Api set:  1.1]
    *
    * @param id The type of the Toolbar
    * @param show Whether the toolbar is visibile or not.
    */
  def showToolbar(id: CommandBar | PageNavigationBar | StatusBar, show: Boolean): Unit = js.native
  /**
    *
    * Sets the visibility of a specific toolbar in the application.
    *
    * [Api set:  1.1]
    *
    * @param id The type of the Toolbar
    * @param show Whether the toolbar is visibile or not.
    */
  def showToolbar(id: ToolBarType, show: Boolean): Unit = js.native
  
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ApplicationData = js.native
}
