package typings
package officeDashJsDashPreviewLib.ExcelNs

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
class TableSort ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
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
  val matchCase: scala.Boolean = js.native
  /**
    *
    * Represents Chinese character ordering method last used to sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val method: SortMethod | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PinYin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StrokeCount = js.native
  /**
    *
    * Perform a sort operation.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param fields The list of conditions to sort on.
    * @param matchCase Optional. Whether to have the casing impact string ordering.
    * @param method Optional. The ordering method used for Chinese characters.
    */
  @JSName("apply")
  def apply(fields: js.Array[SortField]): scala.Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: scala.Boolean): scala.Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: scala.Boolean, method: SortMethod): scala.Unit = js.native
  @JSName("apply")
  def apply_PinYin(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    method: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PinYin
  ): scala.Unit = js.native
  @JSName("apply")
  def apply_StrokeCount(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    method: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StrokeCount
  ): scala.Unit = js.native
  /**
    *
    * Clears the sorting that is currently on the table. While this doesn't modify the table's ordering, it clears the state of the header buttons.
    *
    * [Api set: ExcelApi 1.2]
    */
  def clear(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.TableSort` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.TableSort` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TableSort` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableSort = js.native
  def load(option: java.lang.String): TableSort = js.native
  def load(option: js.Array[java.lang.String]): TableSort = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): TableSort = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableSortLoadOptions): TableSort = js.native
  /**
    *
    * Reapplies the current sorting parameters to the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  def reapply(): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TableSort object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableSortData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableSortData = js.native
}

