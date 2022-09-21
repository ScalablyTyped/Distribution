package typings.officeJs.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.officeJsStrings.Columns
import typings.officeJs.officeJsStrings.PinYin
import typings.officeJs.officeJsStrings.Rows
import typings.officeJs.officeJsStrings.StrokeCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages sorting operations on `Range` objects.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait RangeSort
  extends StObject
     with ClientObject {
  
  /**
    * Perform a sort operation.
    *
    * @remarks
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
  def apply(fields: js.Array[SortField], matchCase: Boolean, hasHeaders: Boolean, orientation: Rows | Columns): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: Rows | Columns,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: Unit,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Boolean,
    orientation: Unit,
    method: SortMethod
  ): Unit = js.native
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
  def apply(fields: js.Array[SortField], matchCase: Boolean, hasHeaders: Unit, orientation: Rows | Columns): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Unit,
    orientation: Rows | Columns,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Unit,
    orientation: Unit,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Unit,
    orientation: Unit,
    method: SortMethod
  ): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Boolean, hasHeaders: Unit, orientation: SortOrientation): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Boolean,
    hasHeaders: Unit,
    orientation: SortOrientation,
    method: SortMethod
  ): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Unit, hasHeaders: Boolean): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Unit, hasHeaders: Boolean, orientation: Rows | Columns): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Boolean,
    orientation: Rows | Columns,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Boolean,
    orientation: Unit,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Boolean,
    orientation: Unit,
    method: SortMethod
  ): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Unit, hasHeaders: Boolean, orientation: SortOrientation): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Boolean,
    orientation: SortOrientation,
    method: SortMethod
  ): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Unit, hasHeaders: Unit, orientation: Rows | Columns): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Unit,
    orientation: Rows | Columns,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Unit,
    orientation: Unit,
    method: PinYin | StrokeCount
  ): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Unit,
    orientation: Unit,
    method: SortMethod
  ): Unit = js.native
  @JSName("apply")
  def apply(fields: js.Array[SortField], matchCase: Unit, hasHeaders: Unit, orientation: SortOrientation): Unit = js.native
  @JSName("apply")
  def apply(
    fields: js.Array[SortField],
    matchCase: Unit,
    hasHeaders: Unit,
    orientation: SortOrientation,
    method: SortMethod
  ): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeSort: RequestContext = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeSort object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeSortData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String] = js.native
}
