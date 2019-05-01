package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
trait PageBreakCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the column index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the row index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[scala.Boolean] = js.undefined
}

object PageBreakCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    columnIndex: js.UndefOr[scala.Boolean] = js.undefined,
    rowIndex: js.UndefOr[scala.Boolean] = js.undefined
  ): PageBreakCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex)
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.asInstanceOf[PageBreakCollectionLoadOptions]
  }
}

