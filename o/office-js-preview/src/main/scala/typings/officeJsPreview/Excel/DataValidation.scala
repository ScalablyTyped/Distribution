package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.DataValidationData
import typings.officeJsPreview.Excel.Interfaces.DataValidationLoadOptions
import typings.officeJsPreview.Excel.Interfaces.DataValidationUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import typings.officeJsPreview.officeJsPreviewStrings.Date
import typings.officeJsPreview.officeJsPreviewStrings.Decimal
import typings.officeJsPreview.officeJsPreviewStrings.Inconsistent
import typings.officeJsPreview.officeJsPreviewStrings.List
import typings.officeJsPreview.officeJsPreviewStrings.MixedCriteria
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.TextLength
import typings.officeJsPreview.officeJsPreviewStrings.Time
import typings.officeJsPreview.officeJsPreviewStrings.WholeNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data validation applied to the current range.
  To learn more about the data validation object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-data-validation | Add data validation to Excel ranges}.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataValidation
  extends StObject
     with ClientObject {
  
  /**
    * Clears the data validation from the current range.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataValidation: RequestContext = js.native
  
  /**
    * Error alert when user enters invalid data.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: DataValidationErrorAlert = js.native
  
  /**
    * Returns a `RangeAreas` object, comprising one or more rectangular ranges, with invalid cell values. If all cell values are valid, this function will throw an `ItemNotFound` error.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getInvalidCells(): RangeAreas = js.native
  
  /**
    * Returns a `RangeAreas` object, comprising one or more rectangular ranges, with invalid cell values. If all cell values are valid, this function will return `null`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getInvalidCellsOrNullObject(): RangeAreas = js.native
  
  /**
    * Specifies if data validation will be performed on blank cells. Default is `true`.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DataValidation = js.native
  def load(options: DataValidationLoadOptions): DataValidation = js.native
  def load(propertyNamesAndPaths: Expand): DataValidation = js.native
  def load(propertyNames: String): DataValidation = js.native
  def load(propertyNames: js.Array[String]): DataValidation = js.native
  
  /**
    * Prompt when users select a cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var prompt: DataValidationPrompt = js.native
  
  /**
    * Data validation rule that contains different type of data validation criteria.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var rule: DataValidationRule = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DataValidation): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DataValidationUpdateData): Unit = js.native
  def set(properties: DataValidationUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataValidation object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataValidationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DataValidationData = js.native
  
  /**
    * Type of the data validation, see `Excel.DataValidationType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val `type`: DataValidationType | None | WholeNumber | Decimal | List | Date | Time | TextLength | Custom | Inconsistent | MixedCriteria = js.native
  
  /**
    * Represents if all cell values are valid according to the data validation rules.
    Returns `true` if all cell values are valid, or `false` if all cell values are invalid.
    Returns `null` if there are both valid and invalid cell values within the range.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val valid: Boolean = js.native
}
