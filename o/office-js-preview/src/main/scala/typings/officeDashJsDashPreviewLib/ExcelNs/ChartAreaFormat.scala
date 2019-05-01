package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the format properties for the overall chart area.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartAreaFormat")
@js.native
class ChartAreaFormat ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val border: ChartBorder = js.native
  /**
    *
    * Returns or sets an integer that represents the color scheme for the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: ChartColorScheme | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ColorfulPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette3 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette4 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette5 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette6 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette7 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette9 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette10 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette11 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette12 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MonochromaticPalette13 = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAreaFormat: RequestContext = js.native
  /**
    *
    * Represents the fill format of an object, which includes background formatting information. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val fill: ChartFill = js.native
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val font: ChartFont = js.native
  /**
    *
    * True if the chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: scala.Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartAreaFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartAreaFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartAreaFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAreaFormat = js.native
  def load(option: java.lang.String): ChartAreaFormat = js.native
  def load(option: js.Array[java.lang.String]): ChartAreaFormat = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): ChartAreaFormat = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAreaFormatLoadOptions): ChartAreaFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAreaFormat): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartAreaFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAreaFormatUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAreaFormatUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAreaFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAreaFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAreaFormatData = js.native
}

