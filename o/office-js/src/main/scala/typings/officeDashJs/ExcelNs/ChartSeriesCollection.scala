package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.ChartSeriesCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.ChartSeriesCollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
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
class ChartSeriesCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartSeriesCollection: RequestContext = js.native
  /**
    *
    * Returns the number of series in the collection. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
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
  def add(name: String): ChartSeries = js.native
  def add(name: String, index: Double): ChartSeries = js.native
  /**
    *
    * Returns the number of series in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Retrieves a series based on its position in the collection.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): ChartSeries = js.native
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
  def load(option: ChartSeriesCollectionLoadOptions with CollectionLoadOptions): ChartSeriesCollection = js.native
  def load(option: String): ChartSeriesCollection = js.native
  def load(option: js.Array[String]): ChartSeriesCollection = js.native
  def load(option: LoadOption): ChartSeriesCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartSeriesCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartSeriesCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartSeriesCollectionData = js.native
}

