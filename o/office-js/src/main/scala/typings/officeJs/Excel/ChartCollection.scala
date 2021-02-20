package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartCollectionData
import typings.officeJs.Excel.Interfaces.ChartCollectionLoadOptions
import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.EventHandlers
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.officeJsStrings.Auto
import typings.officeJs.officeJsStrings.Columns
import typings.officeJs.officeJsStrings.Rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A collection of all the chart objects on a worksheet.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartCollection extends ClientObject {
  
  /**
    * Creates a new chart.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param type Represents the type of a chart. See Excel.ChartType for details.
    * @param sourceData The Range object corresponding to the source data.
    * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
    */
  def add(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range
  ): Chart = js.native
  def add(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range,
    seriesBy: Auto
  ): Chart = js.native
  def add(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range,
    seriesBy: Columns
  ): Chart = js.native
  def add(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range,
    seriesBy: Rows
  ): Chart = js.native
  /**
    * Creates a new chart.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param type Represents the type of a chart. See Excel.ChartType for details.
    * @param sourceData The Range object corresponding to the source data.
    * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
    */
  def add(`type`: ChartType, sourceData: Range): Chart = js.native
  def add(`type`: ChartType, sourceData: Range, seriesBy: ChartSeriesBy): Chart = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartCollection: RequestContext = js.native
  
  /**
    *
    * Returns the number of charts in the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Returns the number of charts in the worksheet.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param name Name of the chart to be retrieved.
    */
  def getItem(name: String): Chart = js.native
  
  /**
    * Gets a chart based on its position in the collection.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Chart = js.native
  
  /**
    * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned.
    If the chart does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name Name of the chart to be retrieved.
    */
  def getItemOrNullObject(name: String): Chart = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Chart] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartCollection = js.native
  def load(options: ChartCollectionLoadOptions with CollectionLoadOptions): ChartCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ChartCollection = js.native
  def load(propertyNames: String): ChartCollection = js.native
  def load(propertyNames: js.Array[String]): ChartCollection = js.native
  
  /**
    *
    * Occurs when a chart is activated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onActivated: EventHandlers[ChartActivatedEventArgs] = js.native
  
  /**
    *
    * Occurs when a new chart is added to the worksheet.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onAdded: EventHandlers[ChartAddedEventArgs] = js.native
  
  /**
    *
    * Occurs when a chart is deactivated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeactivated: EventHandlers[ChartDeactivatedEventArgs] = js.native
  
  /**
    *
    * Occurs when a chart is deleted.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeleted: EventHandlers[ChartDeletedEventArgs] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartCollectionData = js.native
}
