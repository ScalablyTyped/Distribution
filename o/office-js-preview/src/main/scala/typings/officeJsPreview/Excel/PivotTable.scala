package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.PivotTableData
import typings.officeJsPreview.Excel.Interfaces.PivotTableLoadOptions
import typings.officeJsPreview.Excel.Interfaces.PivotTableUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an Excel PivotTable.
  To learn more about the PivotTable object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-pivottables | Work with PivotTables using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.3]
  */
@js.native
trait PivotTable extends ClientObject {
  
  /**
    *
    * Specifies if the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * [Api set: ExcelApi 1.12]
    */
  var allowMultipleFiltersPerField: Boolean = js.native
  
  /**
    *
    * The Column Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  val columnHierarchies: RowColumnPivotHierarchyCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotTable: RequestContext = js.native
  
  /**
    *
    * The Data Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  val dataHierarchies: DataPivotHierarchyCollection = js.native
  
  /**
    * Deletes the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  def delete(): Unit = js.native
  
  /**
    *
    * Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: Boolean = js.native
  
  /**
    *
    * The Filter Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  val filterHierarchies: FilterPivotHierarchyCollection = js.native
  
  /**
    *
    * The Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  val hierarchies: PivotHierarchyCollection = js.native
  
  /**
    *
    * Id of the PivotTable.
    *
    * [Api set: ExcelApi 1.5]
    */
  val id: String = js.native
  
  /**
    *
    * The PivotLayout describing the layout and visual structure of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  val layout: PivotLayout = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotTable = js.native
  def load(options: PivotTableLoadOptions): PivotTable = js.native
  def load(propertyNamesAndPaths: Expand): PivotTable = js.native
  def load(propertyNames: String): PivotTable = js.native
  def load(propertyNames: js.Array[String]): PivotTable = js.native
  
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: String = js.native
  
  /**
    * Refreshes the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  def refresh(): Unit = js.native
  
  /**
    *
    * Specifies whether the PivotTable refreshes when the workbook opens. Corresponds to "Refresh on load" setting in the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshOnOpen: Boolean = js.native
  
  /**
    *
    * The Row Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  val rowHierarchies: RowColumnPivotHierarchyCollection = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PivotTable): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotTableUpdateData): Unit = js.native
  def set(properties: PivotTableUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotTable): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotTable object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotTableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotTableData = js.native
  
  /**
    *
    * Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: Boolean = js.native
  
  /**
    *
    * The worksheet containing the current PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  val worksheet: Worksheet = js.native
}
