package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned properties of getRowProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RowProperties extends SettableRowProperties {
  /**
    *
    * Represents the `address` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `addressLocal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[String] = js.native
  /**
    *
    * Represents the `rowIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.native
}

object RowProperties {
  @scala.inline
  def apply(): RowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProperties]
  }
  @scala.inline
  implicit class RowPropertiesOps[Self <: RowProperties] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAddressLocal(value: String): Self = this.set("addressLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLocal: Self = this.set("addressLocal", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}

