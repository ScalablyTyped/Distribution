package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a TableStyle, which defines the style elements by region of the Table.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait TableStyleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the name of the TableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether this TableStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
}

