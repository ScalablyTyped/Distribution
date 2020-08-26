package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a string reference of the form SheetName!A1:B5, or a global or local named range.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait RangeReference extends js.Object {
  /**
    *
    * The address of the range; for example 'SheetName!A1:B5'.
    *
    * [Api set: ExcelApi 1.2]
    */
  var address: String = js.native
}

object RangeReference {
  @scala.inline
  def apply(address: String): RangeReference = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeReference]
  }
  @scala.inline
  implicit class RangeReferenceOps[Self <: RangeReference] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
  }
  
}

