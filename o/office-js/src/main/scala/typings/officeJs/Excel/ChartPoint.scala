package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartPointData
import typings.officeJs.Excel.Interfaces.ChartPointLoadOptions
import typings.officeJs.Excel.Interfaces.ChartPointUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Circle
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.Diamond
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Picture
import typings.officeJs.officeJsStrings.Plus
import typings.officeJs.officeJsStrings.Square
import typings.officeJs.officeJsStrings.Star
import typings.officeJs.officeJsStrings.Triangle
import typings.officeJs.officeJsStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a point of a series in a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartPoint
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPoint: RequestContext = js.native
  
  /**
    * Returns the data label of a chart point.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val dataLabel: ChartDataLabel = js.native
  
  /**
    * Encapsulates the format properties chart point.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartPointFormat = js.native
  
  /**
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartPoint = js.native
  def load(options: ChartPointLoadOptions): ChartPoint = js.native
  def load(propertyNamesAndPaths: Expand): ChartPoint = js.native
  def load(propertyNames: String): ChartPoint = js.native
  def load(propertyNames: js.Array[String]): ChartPoint = js.native
  
  /**
    * HTML color code representation of the marker background color of a data point (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: String = js.native
  
  /**
    * HTML color code representation of the marker foreground color of a data point (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: String = js.native
  
  /**
    * Represents marker size of a data point.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: Double = js.native
  
  /**
    * Represents marker style of a chart data point. See `Excel.ChartMarkerStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartPoint): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartPointUpdateData): Unit = js.native
  def set(properties: ChartPointUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartPoint object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPointData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartPointData = js.native
  
  /**
    * Returns the value of a chart point.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val value: Any = js.native
}
