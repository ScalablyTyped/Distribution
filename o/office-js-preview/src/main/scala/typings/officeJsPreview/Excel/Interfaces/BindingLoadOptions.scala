package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Office.js binding that is defined in the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait BindingLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents binding identifier.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

object BindingLoadOptions {
  @scala.inline
  def apply(): BindingLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingLoadOptions]
  }
  @scala.inline
  implicit class BindingLoadOptionsOps[Self <: BindingLoadOptions] (val x: Self) extends AnyVal {
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
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

