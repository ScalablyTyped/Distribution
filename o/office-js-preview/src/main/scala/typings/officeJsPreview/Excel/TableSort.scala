package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.TableSortData
import typings.officeJsPreview.Excel.Interfaces.TableSortLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.officeJsPreviewStrings.PinYin
import typings.officeJsPreview.officeJsPreviewStrings.StrokeCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages sorting operations on Table objects.
  *
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.TableSort")
@js.native
class TableSort () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableSort: RequestContext = js.native
  /**
    *
    * Represents the current conditions used to last sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val fields: js.Array[SortField] = js.native
  /**
    *
    * Represents whether the casing impacted the last sort of the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val matchCase: Boolean = js.native
  /**
    *
    * Represents Chinese character ordering method last used to sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val method: SortMethod | PinYin | StrokeCount = js.native
  /**
    * Perform a sort operation.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param fields The list of conditions to sort on.
    * @param matchCase Optional. Whether to have the casing impact string ordering.
    * @param method Optional. The ordering method used for Chinese characters.
    */
  @JSName("apply")
  def apply(fields: js.Array[SortField]): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Boolean): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Boolean, method: SortMethod): Unit = js.native
  @JSName("apply")
  def apply_PinYin(fields: js.Array[SortField], matchCase: Boolean, method: PinYin): Unit = js.native
  @JSName("apply")
  def apply_StrokeCount(fields: js.Array[SortField], matchCase: Boolean, method: StrokeCount): Unit = js.native
  /**
    * Clears the sorting that is currently on the table. While this doesn't modify the table's ordering, it clears the state of the header buttons.
    *
    * [Api set: ExcelApi 1.2]
    */
  def clear(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableSort = js.native
  def load(options: TableSortLoadOptions): TableSort = js.native
  def load(propertyNamesAndPaths: AnonExpand): TableSort = js.native
  def load(propertyNames: String): TableSort = js.native
  def load(propertyNames: js.Array[String]): TableSort = js.native
  /**
    * Reapplies the current sorting parameters to the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  def reapply(): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TableSort object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableSortData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableSortData = js.native
}

