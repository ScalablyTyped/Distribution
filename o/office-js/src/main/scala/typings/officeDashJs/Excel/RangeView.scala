package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.RangeViewData
import typings.officeDashJs.Excel.Interfaces.RangeViewLoadOptions
import typings.officeDashJs.Excel.Interfaces.RangeViewUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * RangeView represents a set of visible cells of the parent range.
  *
  * [Api set: ExcelApi 1.3]
  */
@JSGlobal("Excel.RangeView")
@js.native
class RangeView () extends ClientObject {
  /**
    *
    * Represents the cell addresses of the RangeView. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val cellAddresses: js.Array[js.Array[_]] = js.native
  /**
    *
    * Returns the number of visible columns. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val columnCount: Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeView: RequestContext = js.native
  /**
    *
    * Represents the formula in A1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulas: js.Array[js.Array[_]] = js.native
  /**
    *
    * Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English "=SUM(A1, 1.5)" formula would become "=SUMME(A1; 1,5)" in German.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasLocal: js.Array[js.Array[_]] = js.native
  /**
    *
    * Represents the formula in R1C1-style notation.
    *
    * [Api set: ExcelApi 1.3]
    */
  var formulasR1C1: js.Array[js.Array[_]] = js.native
  /**
    *
    * Returns a value that represents the index of the RangeView. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val index: Double = js.native
  /**
    *
    * Represents Excel's number format code for the given cell.
    *
    * [Api set: ExcelApi 1.3]
    */
  var numberFormat: js.Array[js.Array[_]] = js.native
  /**
    *
    * Returns the number of visible rows. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val rowCount: Double = js.native
  /**
    *
    * Represents a collection of range views associated with the range. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val rows: RangeViewCollection = js.native
  /**
    *
    * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val text: js.Array[js.Array[String]] = js.native
  /**
    *
    * Represents the type of data of each cell. Read-only.
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
  var values: js.Array[js.Array[_]] = js.native
  /**
    *
    * Gets the parent range associated with the current RangeView.
    *
    * [Api set: ExcelApi 1.3]
    */
  def getRange(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeView = js.native
  def load(options: RangeViewLoadOptions): RangeView = js.native
  def load(propertyNamesAndPaths: Anon_Expand): RangeView = js.native
  def load(propertyNames: String): RangeView = js.native
  def load(propertyNames: js.Array[String]): RangeView = js.native
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
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeViewData = js.native
}

