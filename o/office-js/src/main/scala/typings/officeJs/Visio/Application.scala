package typings.officeJs.Visio

import typings.officeJs.AnonExpand
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Visio.Interfaces.ApplicationData
import typings.officeJs.Visio.Interfaces.ApplicationLoadOptions
import typings.officeJs.Visio.Interfaces.ApplicationUpdateData
import typings.officeJs.officeJsStrings.CommandBar
import typings.officeJs.officeJsStrings.PageNavigationBar
import typings.officeJs.officeJsStrings.StatusBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Application.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Application")
@js.native
class Application () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: Boolean = js.native
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Application` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Application` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Application` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Application = js.native
  def load(option: String): Application = js.native
  def load(option: js.Array[String]): Application = js.native
  def load(option: AnonExpand): Application = js.native
  def load(option: ApplicationLoadOptions): Application = js.native
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
    * Sets the visibility of a specific toolbar in the application.
    *
    * [Api set:  1.1]
    *
    * @param id The type of the Toolbar
    * @param show Whether the toolbar is visibile or not.
    */
  @JSName("showToolbar")
  def showToolbar_CommandBar(id: CommandBar, show: Boolean): Unit = js.native
  @JSName("showToolbar")
  def showToolbar_PageNavigationBar(id: PageNavigationBar, show: Boolean): Unit = js.native
  @JSName("showToolbar")
  def showToolbar_StatusBar(id: StatusBar, show: Boolean): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ApplicationData = js.native
}

