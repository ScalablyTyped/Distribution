package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.BindingType
import typings.officeJs.officeJsStrings.Range
import typings.officeJs.officeJsStrings.Table
import typings.officeJs.officeJsStrings.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `binding.toJSON()`. */
@js.native
trait BindingData extends js.Object {
  /**
    *
    * Represents binding identifier.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Returns the type of the binding. See Excel.BindingType for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[BindingType | Range | Table | Text] = js.native
}

object BindingData {
  @scala.inline
  def apply(): BindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingData]
  }
  @scala.inline
  implicit class BindingDataOps[Self <: BindingData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setType(value: BindingType | Range | Table | Text): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

