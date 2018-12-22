package typings
package officeDashJsDashPreviewLib.ExcelNs

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
class ChartTrendlineCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
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
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  def add(`type`: ChartTrendlineType): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Exponential(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Exponential): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Linear(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Linear): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Logarithmic(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Logarithmic): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_MovingAverage(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MovingAverage): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Polynomial(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Polynomial): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Power(`type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Power): ChartTrendline = js.native
  /**
           *
           * Returns the number of trendlines in the collection.
           *
           * [Api set: ExcelApi 1.7]
           */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Get trendline object by index, which is the insertion order in items array.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param index Represents the insertion order in items array.
           */
  def getItem(index: scala.Double): ChartTrendline = js.native
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
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ChartTrendlineCollection = js.native
  def load(option: java.lang.String): ChartTrendlineCollection = js.native
  def load(option: js.Array[java.lang.String]): ChartTrendlineCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): ChartTrendlineCollection = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original `Excel.ChartTrendlineCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineCollectionData = js.native
}

