package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.RangeViewData
import typings.officeJs.Excel.Interfaces.RangeViewLoadOptions
import typings.officeJs.Excel.Interfaces.RangeViewUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * RangeView represents a set of visible cells of the parent range.
  *
  * [Api set: ExcelApi 1.3]
  */
@js.native
trait RangeView
  extends StObject
     with ClientObject {
  
  /**
    *
    * Represents the cell addresses of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  val cellAddresses: js.Array[js.Array[js.Any]] = js.native
  
  /**
    *
    * The number of visible columns.
    *
    * [Api set: ExcelApi 1.3]
    */
  val columnCount: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeView: RequestContext = js.native
  
  /**
    *
    * Represents the formula in A1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.Array[js.Array[js.Any]] = js.native
  
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.Array[js.Array[js.Any]] = js.native
  
  /**
    *
    * Represents the formula in R1C1-style notation. If a cell has no formula, its value is returned instead.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.Array[js.Array[js.Any]] = js.native
  
  /**
    * Gets the parent range associated with the current RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  def getRange(): Range = js.native
  
  /**
    *
    * Returns a value that represents the index of the RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  val index: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeView = js.native
  def load(options: RangeViewLoadOptions): RangeView = js.native
  def load(propertyNamesAndPaths: Expand): RangeView = js.native
  def load(propertyNames: String): RangeView = js.native
  def load(propertyNames: js.Array[String]): RangeView = js.native
  
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.Array[js.Array[js.Any]] = js.native
  
  /**
    *
    * The number of visible rows.
    *
    * [Api set: ExcelApi 1.3]
    */
  val rowCount: Double = js.native
  
  /**
    *
    * Represents a collection of range views associated with the range.
    *
    * [Api set: ExcelApi 1.3]
    */
  val rows: RangeViewCollection = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeView): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeViewUpdateData): Unit = js.native
  def set(properties: RangeViewUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeView): Unit = js.native
  
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API.
    *
    * [Api set: ExcelApi 1.3]
    */
  val text: js.Array[js.Array[String]] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeViewData = js.native
  
  /**
    *
    * Represents the type of data of each cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  val valueTypes: js.Array[js.Array[RangeValueType]] = js.native
  
  /**
    *
    * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.3]
    */
  var values: js.Array[js.Array[js.Any]] = js.native
}
