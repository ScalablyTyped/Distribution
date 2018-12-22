package typings
package officeDashJsDashPreviewLib.ExcelNs

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
class RangeSort ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
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
  def apply(fields: js.Array[SortField]): scala.Unit = js.native
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
  def apply(fields: js.Array[SortField], matchCase: scala.Boolean): scala.Unit = js.native
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
  def apply(fields: js.Array[SortField], matchCase: scala.Boolean, hasHeaders: scala.Boolean): scala.Unit = js.native
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
  def apply(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: SortOrientation
  ): scala.Unit = js.native
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
  def apply(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: SortOrientation,
    method: SortMethod
  ): scala.Unit = js.native
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
  def apply(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Columns,
    method: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PinYin
  ): scala.Unit = js.native
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
  def apply(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Columns,
    method: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StrokeCount
  ): scala.Unit = js.native
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
  def apply(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Rows,
    method: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PinYin
  ): scala.Unit = js.native
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
  def apply(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Rows,
    method: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StrokeCount
  ): scala.Unit = js.native
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
  def apply_Columns(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Columns
  ): scala.Unit = js.native
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
  def apply_Rows(
    fields: js.Array[SortField],
    matchCase: scala.Boolean,
    hasHeaders: scala.Boolean,
    orientation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Rows
  ): scala.Unit = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original Excel.RangeSort object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeSortData`) that contains shallow copies of any loaded child properties from the original object.
          */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
}

