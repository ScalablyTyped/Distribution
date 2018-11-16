package typings
package officeDashJsLib.ExcelNs

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
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
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
    orientation: officeDashJsLib.officeDashJsLibStrings.Columns,
    method: officeDashJsLib.officeDashJsLibStrings.PinYin
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
    orientation: officeDashJsLib.officeDashJsLibStrings.Columns,
    method: officeDashJsLib.officeDashJsLibStrings.StrokeCount
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
    orientation: officeDashJsLib.officeDashJsLibStrings.Rows,
    method: officeDashJsLib.officeDashJsLibStrings.PinYin
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
    orientation: officeDashJsLib.officeDashJsLibStrings.Rows,
    method: officeDashJsLib.officeDashJsLibStrings.StrokeCount
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
    orientation: officeDashJsLib.officeDashJsLibStrings.Columns
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
    orientation: officeDashJsLib.officeDashJsLibStrings.Rows
  ): scala.Unit = js.native
  def toJSON(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
}

