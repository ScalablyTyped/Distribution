package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the AutoFilter object.
  AutoFilter turns the values in Excel column into specific filters based on the cell contents.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait AutoFilterLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * An array that holds all the filter criteria in the autofiltered range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var criteria: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the AutoFilter is enabled.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the AutoFilter has filter criteria.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDataFiltered: js.UndefOr[Boolean] = js.native
}

object AutoFilterLoadOptions {
  @scala.inline
  def apply(): AutoFilterLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFilterLoadOptions]
  }
  @scala.inline
  implicit class AutoFilterLoadOptionsOps[Self <: AutoFilterLoadOptions] (val x: Self) extends AnyVal {
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
    def setCriteria(value: Boolean): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIsDataFiltered(value: Boolean): Self = this.set("isDataFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDataFiltered: Self = this.set("isDataFiltered", js.undefined)
  }
  
}

