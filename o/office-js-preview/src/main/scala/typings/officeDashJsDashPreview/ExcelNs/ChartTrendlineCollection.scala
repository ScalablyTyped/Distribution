package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartTrendlineCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartTrendlineCollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Exponential
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Linear
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Logarithmic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MovingAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Polynomial
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Power
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of Chart Trendlines.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTrendlineCollection")
@js.native
class ChartTrendlineCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendlineCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ChartTrendline] = js.native
  /**
    *
    * Adds a new trendline to trendline collection.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
    */
  def add(): ChartTrendline = js.native
  def add(`type`: ChartTrendlineType): ChartTrendline = js.native
  @JSName("add")
  def add_Exponential(`type`: Exponential): ChartTrendline = js.native
  @JSName("add")
  def add_Linear(`type`: Linear): ChartTrendline = js.native
  @JSName("add")
  def add_Logarithmic(`type`: Logarithmic): ChartTrendline = js.native
  @JSName("add")
  def add_MovingAverage(`type`: MovingAverage): ChartTrendline = js.native
  @JSName("add")
  def add_Polynomial(`type`: Polynomial): ChartTrendline = js.native
  @JSName("add")
  def add_Power(`type`: Power): ChartTrendline = js.native
  /**
    *
    * Returns the number of trendlines in the collection.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Get trendline object by index, which is the insertion order in items array.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param index Represents the insertion order in items array.
    */
  def getItem(index: Double): ChartTrendline = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartTrendlineCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartTrendlineCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartTrendlineCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendlineCollection = js.native
  def load(option: ChartTrendlineCollectionLoadOptions with CollectionLoadOptions): ChartTrendlineCollection = js.native
  def load(option: String): ChartTrendlineCollection = js.native
  def load(option: js.Array[String]): ChartTrendlineCollection = js.native
  def load(option: LoadOption): ChartTrendlineCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartTrendlineCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ChartTrendlineCollectionData = js.native
}

