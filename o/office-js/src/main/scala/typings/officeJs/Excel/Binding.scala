package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.BindingData
import typings.officeJs.Excel.Interfaces.BindingLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.EventHandlers
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an Office.js binding that is defined in the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait Binding extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Binding: RequestContext = js.native
  
  /**
    * Deletes the binding.
    *
    * [Api set: ExcelApi 1.3]
    */
  def delete(): Unit = js.native
  
  /**
    * Returns the range represented by the binding. Will throw an error if binding is not of the correct type.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the table represented by the binding. Will throw an error if binding is not of the correct type.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getTable(): Table = js.native
  
  /**
    * Returns the text represented by the binding. Will throw an error if binding is not of the correct type.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getText(): ClientResult[String] = js.native
  
  /**
    *
    * Represents binding identifier.
    *
    * [Api set: ExcelApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Binding = js.native
  def load(options: BindingLoadOptions): Binding = js.native
  def load(propertyNamesAndPaths: Expand): Binding = js.native
  def load(propertyNames: String): Binding = js.native
  def load(propertyNames: js.Array[String]): Binding = js.native
  
  /**
    *
    * Occurs when data or formatting within the binding is changed.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @eventproperty
    */
  val onDataChanged: EventHandlers[BindingDataChangedEventArgs] = js.native
  
  /**
    *
    * Occurs when the selected content in the binding is changed.
    
    **Note**: If multiple, discontiguous cells are selected, `Binding.onSelectionChanged` only reports row and column information for one selection. Use `Worksheet.onSelectionChanged` for multiple selected ranges.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[BindingSelectionChangedEventArgs] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Binding object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.BindingData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): BindingData = js.native
  
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  val `type`: BindingType | typings.officeJs.officeJsStrings.Range | typings.officeJs.officeJsStrings.Table | Text = js.native
}
