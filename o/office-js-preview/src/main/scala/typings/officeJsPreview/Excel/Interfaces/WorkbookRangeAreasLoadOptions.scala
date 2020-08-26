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
@js.native
trait WorkbookRangeAreasLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns an array of address in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var addresses: js.UndefOr[Boolean] = js.native
}

object WorkbookRangeAreasLoadOptions {
  @scala.inline
  def apply(): WorkbookRangeAreasLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeAreasLoadOptions]
  }
  @scala.inline
  implicit class WorkbookRangeAreasLoadOptionsOps[Self <: WorkbookRangeAreasLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAddresses(value: Boolean): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
  }
  
}

