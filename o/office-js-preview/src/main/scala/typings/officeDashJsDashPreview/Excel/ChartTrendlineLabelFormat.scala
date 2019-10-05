package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartTrendlineLabelFormatData
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartTrendlineLabelFormatLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartTrendlineLabelFormatUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the format properties for the chart trendline label.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartTrendlineLabelFormat")
@js.native
class ChartTrendlineLabelFormat () extends ClientObject {
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  val border: ChartBorder = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendlineLabelFormat: RequestContext = js.native
  /**
    *
    * Represents the fill format of the current chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  val fill: ChartFill = js.native
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for a chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  val font: ChartFont = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendlineLabelFormat = js.native
  def load(options: ChartTrendlineLabelFormatLoadOptions): ChartTrendlineLabelFormat = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartTrendlineLabelFormat = js.native
  def load(propertyNames: String): ChartTrendlineLabelFormat = js.native
  def load(propertyNames: js.Array[String]): ChartTrendlineLabelFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTrendlineLabelFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTrendlineLabelFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartTrendlineLabelFormatUpdateData): Unit = js.native
  def set(properties: ChartTrendlineLabelFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTrendlineLabelFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineLabelFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTrendlineLabelFormatData = js.native
}

