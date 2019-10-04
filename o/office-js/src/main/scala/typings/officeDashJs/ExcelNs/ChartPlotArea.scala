package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.ChartPlotAreaData
import typings.officeDashJs.ExcelNs.InterfacesNs.ChartPlotAreaLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.ChartPlotAreaUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Automatic
import typings.officeDashJs.officeDashJsStrings.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart plotArea object.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartPlotArea")
@js.native
class ChartPlotArea () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPlotArea: RequestContext = js.native
  /**
    *
    * Represents the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  val format: ChartPlotAreaFormat = js.native
  /**
    *
    * Represents the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: Double = js.native
  /**
    *
    * Represents the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: Double = js.native
  /**
    *
    * Represents the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: Double = js.native
  /**
    *
    * Represents the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: Double = js.native
  /**
    *
    * Represents the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: Double = js.native
  /**
    *
    * Represents the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: Double = js.native
  /**
    *
    * Represents the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: ChartPlotAreaPosition | Automatic | Custom = js.native
  /**
    *
    * Represents the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: Double = js.native
  /**
    *
    * Represents the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartPlotArea = js.native
  def load(options: ChartPlotAreaLoadOptions): ChartPlotArea = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartPlotArea = js.native
  def load(propertyNames: String): ChartPlotArea = js.native
  def load(propertyNames: js.Array[String]): ChartPlotArea = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartPlotArea): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartPlotArea): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartPlotAreaUpdateData): Unit = js.native
  def set(properties: ChartPlotAreaUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartPlotArea object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPlotAreaData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartPlotAreaData = js.native
}

