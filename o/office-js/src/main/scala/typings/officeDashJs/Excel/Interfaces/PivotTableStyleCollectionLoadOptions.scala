package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of PivotTable styles.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait PivotTableStyleCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the PivotTableStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies whether this PivotTableStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
}

