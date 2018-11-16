package typings
package officeDashJsLib.ExcelNs

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
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
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
  def add_Exponential(`type`: officeDashJsLib.officeDashJsLibStrings.Exponential): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Linear(`type`: officeDashJsLib.officeDashJsLibStrings.Linear): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Logarithmic(`type`: officeDashJsLib.officeDashJsLibStrings.Logarithmic): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_MovingAverage(`type`: officeDashJsLib.officeDashJsLibStrings.MovingAverage): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Polynomial(`type`: officeDashJsLib.officeDashJsLibStrings.Polynomial): ChartTrendline = js.native
  /**
           *
           * Adds a new trendline to trendline collection.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param type Specifies the trendline type. The default value is "Linear". See Excel.ChartTrendline for details.
           */
  @JSName("add")
  def add_Power(`type`: officeDashJsLib.officeDashJsLibStrings.Power): ChartTrendline = js.native
  /**
           *
           * Returns the number of trendlines in the collection.
           *
           * [Api set: ExcelApi 1.7]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
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
    option: officeDashJsLib.ExcelNs.InterfacesNs.ChartTrendlineCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ChartTrendlineCollection = js.native
  def load(option: java.lang.String): ChartTrendlineCollection = js.native
  def load(option: js.Array[java.lang.String]): ChartTrendlineCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ChartTrendlineCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartTrendlineCollectionData = js.native
}

