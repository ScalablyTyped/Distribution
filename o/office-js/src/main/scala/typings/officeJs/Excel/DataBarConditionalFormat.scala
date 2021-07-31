package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.DataBarConditionalFormatData
import typings.officeJs.Excel.Interfaces.DataBarConditionalFormatLoadOptions
import typings.officeJs.Excel.Interfaces.DataBarConditionalFormatUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.CellMidPoint
import typings.officeJs.officeJsStrings.Context
import typings.officeJs.officeJsStrings.LeftToRight
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.RightToLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an Excel Conditional Data Bar Type.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait DataBarConditionalFormat
  extends StObject
     with ClientObject {
  
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: String = js.native
  
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint = js.native
  
  /**
    *
    * Specifies the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: ConditionalDataBarDirection | Context | LeftToRight | RightToLeft = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataBarConditionalFormat: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DataBarConditionalFormat = js.native
  def load(options: DataBarConditionalFormatLoadOptions): DataBarConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): DataBarConditionalFormat = js.native
  def load(propertyNames: String): DataBarConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): DataBarConditionalFormat = js.native
  
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: ConditionalDataBarRule = js.native
  
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  val negativeFormat: ConditionalDataBarNegativeFormat = js.native
  
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  val positiveFormat: ConditionalDataBarPositiveFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DataBarConditionalFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.DataBarConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DataBarConditionalFormatUpdateData): Unit = js.native
  def set(properties: DataBarConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataBarConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataBarConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DataBarConditionalFormatData = js.native
  
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: ConditionalDataBarRule = js.native
}
