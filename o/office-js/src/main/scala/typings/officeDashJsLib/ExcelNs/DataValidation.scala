package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the data validation applied to the current range.
     *
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.DataValidation")
@js.native
class DataValidation ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Error alert when user enters invalid data.
           *
           * [Api set: ExcelApi 1.8]
           */
  var errorAlert: DataValidationErrorAlert = js.native
  /**
           *
           * Ignore blanks: no data validation will be performed on blank cells, it defaults to true.
           *
           * [Api set: ExcelApi 1.8]
           */
  var ignoreBlanks: scala.Boolean = js.native
  /**
           *
           * Prompt when users select a cell.
           *
           * [Api set: ExcelApi 1.8]
           */
  var prompt: DataValidationPrompt = js.native
  /**
           *
           * Data Validation rule that contains different type of data validation criteria.
           *
           * [Api set: ExcelApi 1.8]
           */
  var rule: DataValidationRule = js.native
  /**
           *
           * Type of the data validation, see Excel.DataValidationType for details.
           *
           * [Api set: ExcelApi 1.8]
           */
  val `type`: DataValidationType | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.WholeNumber | officeDashJsLib.officeDashJsLibStrings.Decimal | officeDashJsLib.officeDashJsLibStrings.List | officeDashJsLib.officeDashJsLibStrings.Date | officeDashJsLib.officeDashJsLibStrings.Time | officeDashJsLib.officeDashJsLibStrings.TextLength | officeDashJsLib.officeDashJsLibStrings.Custom | officeDashJsLib.officeDashJsLibStrings.Inconsistent | officeDashJsLib.officeDashJsLibStrings.MixedCriteria = js.native
  /**
           *
           * Represents if all cell values are valid according to the data validation rules.
              Returns true if all cell values are valid, or false if all cell values are invalid.
              Returns null if there are both valid and invalid cell values within the range.
           *
           * [Api set: ExcelApi 1.8]
           */
  val valid: scala.Boolean = js.native
  /**
           *
           * Clears the data validation from the current range.
           *
           * [Api set: ExcelApi 1.8]
           */
  def clear(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.DataValidation` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.DataValidation` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.DataValidation` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): DataValidation = js.native
  def load(option: java.lang.String): DataValidation = js.native
  def load(option: js.Array[java.lang.String]): DataValidation = js.native
  def load(option: officeDashJsLib.Anon_Select): DataValidation = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.DataValidation` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.DataValidation` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.DataValidation` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.DataValidationLoadOptions): DataValidation = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DataValidation): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.DataValidation): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.DataValidationUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.DataValidation): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.DataValidationUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.DataValidationData = js.native
}

