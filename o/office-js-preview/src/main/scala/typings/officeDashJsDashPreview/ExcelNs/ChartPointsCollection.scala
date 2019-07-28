package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartPointsCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartPointsCollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
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
class ChartPointsCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPointsCollection: RequestContext = js.native
  /**
    *
    * Returns the number of chart points in the series. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartPoint] = js.native
  /**
    *
    * Returns the number of chart points in the series.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Retrieve a point based on its position within the series.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): ChartPoint = js.native
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
  def load(option: ChartPointsCollectionLoadOptions with CollectionLoadOptions): ChartPointsCollection = js.native
  def load(option: String): ChartPointsCollection = js.native
  def load(option: js.Array[String]): ChartPointsCollection = js.native
  def load(option: LoadOption): ChartPointsCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartPointsCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPointsCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartPointsCollectionData = js.native
}

