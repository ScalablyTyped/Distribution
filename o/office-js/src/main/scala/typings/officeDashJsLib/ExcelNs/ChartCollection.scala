package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * A collection of all the chart objects on a worksheet.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartCollection")
@js.native
class ChartCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Returns the number of charts in the worksheet. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Chart] = js.native
  /**
           *
           * Occurs when a chart is activated.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @eventproperty
           */
  val onActivated: officeDashJsLib.OfficeExtensionNs.EventHandlers[ChartActivatedEventArgs] = js.native
  /**
           *
           * Occurs when a new chart is added to the worksheet.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @eventproperty
           */
  val onAdded: officeDashJsLib.OfficeExtensionNs.EventHandlers[ChartAddedEventArgs] = js.native
  /**
           *
           * Occurs when a chart is deactivated.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @eventproperty
           */
  val onDeactivated: officeDashJsLib.OfficeExtensionNs.EventHandlers[ChartDeactivatedEventArgs] = js.native
  /**
           *
           * Occurs when a chart is deleted.
           *
           * [Api set: ExcelApi 1.8]
           *
           * @eventproperty
           */
  val onDeleted: officeDashJsLib.OfficeExtensionNs.EventHandlers[ChartDeletedEventArgs] = js.native
  /**
           *
           * Creates a new chart.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param type Represents the type of a chart. See Excel.ChartType for details.
           * @param sourceData The Range object corresponding to the source data.
           * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
           */
  def add(`type`: /* LimitUnionLength: was union type with length 82 */java.lang.String, sourceData: Range): Chart = js.native
  /**
           *
           * Creates a new chart.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param type Represents the type of a chart. See Excel.ChartType for details.
           * @param sourceData The Range object corresponding to the source data.
           * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
           */
  def add(
    `type`: /* LimitUnionLength: was union type with length 82 */java.lang.String,
    sourceData: Range,
    seriesBy: officeDashJsLib.officeDashJsLibStrings.Auto
  ): Chart = js.native
  /**
           *
           * Creates a new chart.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param type Represents the type of a chart. See Excel.ChartType for details.
           * @param sourceData The Range object corresponding to the source data.
           * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
           */
  def add(
    `type`: /* LimitUnionLength: was union type with length 82 */java.lang.String,
    sourceData: Range,
    seriesBy: officeDashJsLib.officeDashJsLibStrings.Columns
  ): Chart = js.native
  /**
           *
           * Creates a new chart.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param type Represents the type of a chart. See Excel.ChartType for details.
           * @param sourceData The Range object corresponding to the source data.
           * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
           */
  def add(
    `type`: /* LimitUnionLength: was union type with length 82 */java.lang.String,
    sourceData: Range,
    seriesBy: officeDashJsLib.officeDashJsLibStrings.Rows
  ): Chart = js.native
  /**
           *
           * Creates a new chart.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param type Represents the type of a chart. See Excel.ChartType for details.
           * @param sourceData The Range object corresponding to the source data.
           * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
           */
  def add(`type`: ChartType, sourceData: Range): Chart = js.native
  /**
           *
           * Creates a new chart.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param type Represents the type of a chart. See Excel.ChartType for details.
           * @param sourceData The Range object corresponding to the source data.
           * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
           */
  def add(`type`: ChartType, sourceData: Range, seriesBy: ChartSeriesBy): Chart = js.native
  /**
           *
           * Returns the number of charts in the worksheet.
           *
           * [Api set: ExcelApi 1.4]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param name Name of the chart to be retrieved.
           */
  def getItem(name: java.lang.String): Chart = js.native
  /**
           *
           * Gets a chart based on its position in the collection.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the object to be retrieved. Zero-indexed.
           */
  def getItemAt(index: scala.Double): Chart = js.native
  /**
           *
           * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned.
              If the chart does not exist, will return a null object.
           *
           * [Api set: ExcelApi 1.4]
           *
           * @param name Name of the chart to be retrieved.
           */
  def getItemOrNullObject(name: java.lang.String): Chart = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.ChartCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ChartCollection = js.native
  def load(option: java.lang.String): ChartCollection = js.native
  def load(option: js.Array[java.lang.String]): ChartCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ChartCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartCollectionData = js.native
}

