package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ConditionalFormatData
import typings.officeJs.Excel.Interfaces.ConditionalFormatLoadOptions
import typings.officeJs.Excel.Interfaces.ConditionalFormatUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.ColorScale
import typings.officeJs.officeJsStrings.ContainsText
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.DataBar
import typings.officeJs.officeJsStrings.PresetCriteria
import typings.officeJs.officeJsStrings.TopBottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object encapsulating a conditional format's range, format, rule, and other properties.
  To learn more about the conditional formatting object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-conditional-formatting | Apply conditional formatting to Excel ranges}.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalFormat
  extends StObject
     with ClientObject {
  
  /**
    * Returns the cell value conditional format properties if the current conditional format is a `CellValue` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val cellValue: CellValueConditionalFormat = js.native
  
  /**
    * Returns the cell value conditional format properties if the current conditional format is a `CellValue` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val cellValueOrNullObject: CellValueConditionalFormat = js.native
  
  /**
    * Returns the color scale conditional format properties if the current conditional format is a `ColorScale` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val colorScale: ColorScaleConditionalFormat = js.native
  
  /**
    * Returns the color scale conditional format properties if the current conditional format is a `ColorScale` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val colorScaleOrNullObject: ColorScaleConditionalFormat = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ConditionalFormat: RequestContext = js.native
  
  /**
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val custom: CustomConditionalFormat = js.native
  
  /**
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val customOrNullObject: CustomConditionalFormat = js.native
  
  /**
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val dataBar: DataBarConditionalFormat = js.native
  
  /**
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val dataBarOrNullObject: DataBarConditionalFormat = js.native
  
  /**
    * Deletes this conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  def delete(): Unit = js.native
  
  /**
    * Returns the range the conditonal format is applied to. Throws an error if the conditional format is applied to multiple ranges.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the range to which the conditonal format is applied. If the conditional format is applied to multiple ranges, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  def getRangeOrNullObject(): Range = js.native
  
  /**
    * Returns the `RangeAreas`, comprising one or more rectangular ranges, to which the conditonal format is applied.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getRanges(): RangeAreas = js.native
  
  /**
    * Returns the icon set conditional format properties if the current conditional format is an `IconSet` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val iconSet: IconSetConditionalFormat = js.native
  
  /**
    * Returns the icon set conditional format properties if the current conditional format is an `IconSet` type.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val iconSetOrNullObject: IconSetConditionalFormat = js.native
  
  /**
    * The priority of the conditional format in the current `ConditionalFormatCollection`.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ConditionalFormat = js.native
  def load(options: ConditionalFormatLoadOptions): ConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): ConditionalFormat = js.native
  def load(propertyNames: String): ConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): ConditionalFormat = js.native
  
  /**
    * Returns the preset criteria conditional format. See `Excel.PresetCriteriaConditionalFormat` for more details.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val preset: PresetCriteriaConditionalFormat = js.native
  
  /**
    * Returns the preset criteria conditional format. See `Excel.PresetCriteriaConditionalFormat` for more details.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val presetOrNullObject: PresetCriteriaConditionalFormat = js.native
  
  /**
    * The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than the bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var priority: Double = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ConditionalFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ConditionalFormatUpdateData): Unit = js.native
  def set(properties: ConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * If the conditions of this conditional format are met, no lower-priority formats shall take effect on that cell.
    Value is `null` on data bars, icon sets, and color scales as there's no concept of `StopIfTrue` for these.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var stopIfTrue: Boolean = js.native
  
  /**
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example, to format cells matching the word "Text".
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val textComparison: TextConditionalFormat = js.native
  
  /**
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example, to format cells matching the word "Text".
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val textComparisonOrNullObject: TextConditionalFormat = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ConditionalFormatData = js.native
  
  /**
    * Returns the top/bottom conditional format properties if the current conditional format is a `TopBottom` type.
    For example, to format the top 10% or bottom 10 items.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val topBottom: TopBottomConditionalFormat = js.native
  
  /**
    * Returns the top/bottom conditional format properties if the current conditional format is a `TopBottom` type.
    For example, to format the top 10% or bottom 10 items.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val topBottomOrNullObject: TopBottomConditionalFormat = js.native
  
  /**
    * A type of conditional format. Only one can be set at a time.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  val `type`: ConditionalFormatType | Custom | DataBar | ColorScale | typings.officeJs.officeJsStrings.IconSet | TopBottom | PresetCriteria | ContainsText | typings.officeJs.officeJsStrings.CellValue = js.native
}
