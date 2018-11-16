package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a collection of chart series.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartSeriesCollection")
@js.native
class ChartSeriesCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Returns the number of series in the collection. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartSeries] = js.native
  /**
           *
           * Add a new series to the collection. The new added series is not visible until set values/x axis values/bubble sizes for it (depending on chart type).
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param name Optional. Name of the series.
           * @param index Optional. Index value of the series to be added. Zero-indexed.
           */
  def add(): ChartSeries = js.native
  /**
           *
           * Add a new series to the collection. The new added series is not visible until set values/x axis values/bubble sizes for it (depending on chart type).
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param name Optional. Name of the series.
           * @param index Optional. Index value of the series to be added. Zero-indexed.
           */
  def add(name: java.lang.String): ChartSeries = js.native
  /**
           *
           * Add a new series to the collection. The new added series is not visible until set values/x axis values/bubble sizes for it (depending on chart type).
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param name Optional. Name of the series.
           * @param index Optional. Index value of the series to be added. Zero-indexed.
           */
  def add(name: java.lang.String, index: scala.Double): ChartSeries = js.native
  /**
           *
           * Returns the number of series in the collection.
           *
           * [Api set: ExcelApi 1.4]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Retrieves a series based on its position in the collection.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the object to be retrieved. Zero-indexed.
           */
  def getItemAt(index: scala.Double): ChartSeries = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartSeriesCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartSeriesCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartSeriesCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartSeriesCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartSeriesCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartSeriesCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartSeriesCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.ChartSeriesCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ChartSeriesCollection = js.native
  def load(option: java.lang.String): ChartSeriesCollection = js.native
  def load(option: js.Array[java.lang.String]): ChartSeriesCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ChartSeriesCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartSeriesCollectionData = js.native
}

