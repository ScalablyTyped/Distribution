package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * A collection of all the chart points within a series inside a chart.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartPointsCollection")
@js.native
class ChartPointsCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Returns the number of chart points in the series. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartPoint] = js.native
  /**
           *
           * Returns the number of chart points in the series.
           *
           * [Api set: ExcelApi 1.4]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Retrieve a point based on its position within the series.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param index Index value of the object to be retrieved. Zero-indexed.
           */
  def getItemAt(index: scala.Double): ChartPoint = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartPointsCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartPointsCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartPointsCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartPointsCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartPointsCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartPointsCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartPointsCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.ChartPointsCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ChartPointsCollection = js.native
  def load(option: java.lang.String): ChartPointsCollection = js.native
  def load(option: js.Array[java.lang.String]): ChartPointsCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ChartPointsCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartPointsCollectionData = js.native
}

