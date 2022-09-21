package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartPivotOptionsData
import typings.officeJs.Excel.Interfaces.ChartPivotOptionsLoadOptions
import typings.officeJs.Excel.Interfaces.ChartPivotOptionsUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the options for the pivot chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartPivotOptions
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPivotOptions: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartPivotOptions = js.native
  def load(options: ChartPivotOptionsLoadOptions): ChartPivotOptions = js.native
  def load(propertyNamesAndPaths: Expand): ChartPivotOptions = js.native
  def load(propertyNames: String): ChartPivotOptions = js.native
  def load(propertyNames: js.Array[String]): ChartPivotOptions = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartPivotOptions): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartPivotOptionsUpdateData): Unit = js.native
  def set(properties: ChartPivotOptionsUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Specifies whether to display the axis field buttons on a PivotChart. The `showAxisFieldButtons` property corresponds to the "Show Axis Field Buttons" command on the "Field Buttons" drop-down list of the "Analyze" tab, which is available when a PivotChart is selected.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showAxisFieldButtons: Boolean = js.native
  
  /**
    * Specifies whether to display the legend field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showLegendFieldButtons: Boolean = js.native
  
  /**
    * Specifies whether to display the report filter field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showReportFilterFieldButtons: Boolean = js.native
  
  /**
    * Specifies whether to display the show value field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showValueFieldButtons: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartPivotOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPivotOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartPivotOptionsData = js.native
}
