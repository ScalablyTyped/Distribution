package typings.officeDashJs.ExcelNs

import org.scalablytyped.runtime.StringDictionary
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.officeDashJsStrings.Columns
import typings.officeDashJs.officeDashJsStrings.PinYin
import typings.officeDashJs.officeDashJsStrings.Rows
import typings.officeDashJs.officeDashJsStrings.StrokeCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages sorting operations on Range objects.
  *
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.RangeSort")
@js.native
class RangeSort () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeSort: RequestContext = js.native
  /**
    *
    * Perform a sort operation.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param fields The list of conditions to sort on.
    * @param matchCase Optional. Whether to have the casing impact string ordering.
    * @param hasHeaders Optional. Whether the range has a header.
    * @param orientation Optional. Whether the operation is sorting rows or columns.
    * @param method Optional. The ordering method used for Chinese characters.
    */
  @JSName("apply")
  def apply(fields: js.Array[SortField]): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Boolean): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Boolean, hasHeaders: Boolean): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Boolean, hasHeaders: Boolean, orientation: SortOrientation): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: SortOrientation,
    method: SortMethod
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: Columns,
    method: PinYin
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: Columns,
    method: StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: Rows,
    method: PinYin
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: Rows,
    method: StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply_Columns(fields: js.Array[SortField], matchCase: Boolean, hasHeaders: Boolean, orientation: Columns): Unit = js.native
  @JSName("apply")
  def apply_Rows(fields: js.Array[SortField], matchCase: Boolean, hasHeaders: Boolean, orientation: Rows): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeSort object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeSortData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
}

