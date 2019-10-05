package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartAreaFormatData
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartAreaFormatLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartAreaFormatUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette3
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ColorfulPalette4
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette1
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette10
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette11
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette12
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette13
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette2
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette3
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette4
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette5
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette6
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette7
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette8
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MonochromaticPalette9
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
class ChartAreaFormat () extends ClientObject {
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val border: ChartBorder = js.native
  /**
    *
    * Returns or sets color scheme of the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13 = js.native
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
    * Specifies whether or not chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAreaFormat = js.native
  def load(options: ChartAreaFormatLoadOptions): ChartAreaFormat = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartAreaFormat = js.native
  def load(propertyNames: String): ChartAreaFormat = js.native
  def load(propertyNames: js.Array[String]): ChartAreaFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAreaFormat): Unit = js.native
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
  def set(properties: ChartAreaFormatUpdateData): Unit = js.native
  def set(properties: ChartAreaFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAreaFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAreaFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartAreaFormatData = js.native
}

