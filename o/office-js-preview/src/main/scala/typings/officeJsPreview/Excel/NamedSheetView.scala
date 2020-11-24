package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.NamedSheetViewData
import typings.officeJsPreview.Excel.Interfaces.NamedSheetViewLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a named sheet view of a worksheet. A sheet view stores the sort and filter rules for a particular worksheet.
  Every sheet view (even a temporary sheet view) has a unique, worksheet-scoped name that is used to access the view.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait NamedSheetView extends ClientObject {
  
  /**
    * Activates this sheet view. This is equivalent to using "Switch To" in the Excel UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def activate(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NamedSheetView: RequestContext = js.native
  
  /**
    * Removes the sheet view from the worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def delete(): Unit = js.native
  
  /**
    * Creates a copy of this sheet view.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name The name of the duplicated sheet view. If no name is provided, one will be generated.
    * @returns The new, duplicated sheet view.
    */
  def duplicate(): NamedSheetView = js.native
  def duplicate(name: String): NamedSheetView = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedSheetView = js.native
  def load(options: NamedSheetViewLoadOptions): NamedSheetView = js.native
  def load(propertyNamesAndPaths: Expand): NamedSheetView = js.native
  def load(propertyNames: String): NamedSheetView = js.native
  def load(propertyNames: js.Array[String]): NamedSheetView = js.native
  
  /**
    *
    * Gets or sets the name of the sheet view.
    The temporary sheet view name is the empty string ("").  Naming the view by using the name property causes the sheet view to be saved.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.NamedSheetView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NamedSheetViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NamedSheetViewData = js.native
}
