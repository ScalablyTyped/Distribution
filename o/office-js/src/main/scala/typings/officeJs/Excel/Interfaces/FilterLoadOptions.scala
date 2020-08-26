package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages the filtering of a table's column.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait FilterLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * The currently applied filter on the given column.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[Boolean] = js.native
}

object FilterLoadOptions {
  @scala.inline
  def apply(): FilterLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterLoadOptions]
  }
  @scala.inline
  implicit class FilterLoadOptionsOps[Self <: FilterLoadOptions] (val x: Self) extends AnyVal {
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
  }
  
}

