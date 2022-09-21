package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartDataTableData
import typings.officeJs.Excel.Interfaces.ChartDataTableLoadOptions
import typings.officeJs.Excel.Interfaces.ChartDataTableUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the data table object of a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@js.native
trait ChartDataTable
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartDataTable: RequestContext = js.native
  
  /**
    * Represents the format of a chart data table, which includes fill, font, and border format.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val format: ChartDataTableFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartDataTable = js.native
  def load(options: ChartDataTableLoadOptions): ChartDataTable = js.native
  def load(propertyNamesAndPaths: Expand): ChartDataTable = js.native
  def load(propertyNames: String): ChartDataTable = js.native
  def load(propertyNames: js.Array[String]): ChartDataTable = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartDataTable): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartDataTableUpdateData): Unit = js.native
  def set(properties: ChartDataTableUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Specifies whether to display the horizontal border of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showHorizontalBorder: Boolean = js.native
  
  /**
    * Specifies whether to show the legend key of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showLegendKey: Boolean = js.native
  
  /**
    * Specifies whether to display the outline border of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showOutlineBorder: Boolean = js.native
  
  /**
    * Specifies whether to display the vertical border of the data table.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var showVerticalBorder: Boolean = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartDataTable object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartDataTableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartDataTableData = js.native
  
  /**
    * Specifies whether to show the data table of the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var visible: Boolean = js.native
}
