package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * WorkbookRangeAreas represents a collection of one or more rectangular ranges in multi worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait WorkbookRangeAreasLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns an array of address in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var addresses: js.UndefOr[Boolean] = js.undefined
}

object WorkbookRangeAreasLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, addresses: js.UndefOr[Boolean] = js.undefined): WorkbookRangeAreasLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addresses)) __obj.updateDynamic("addresses")(addresses.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookRangeAreasLoadOptions]
  }
}

