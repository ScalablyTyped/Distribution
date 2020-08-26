package typings.officeJsPreview.Excel

import typings.officeJsPreview.anon.CellPropertiesFormatrowHe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setRowProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait SettableRowProperties extends SettableCellProperties {
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableRowProperties: js.UndefOr[CellPropertiesFormatrowHe] = js.native
  /**
    *
    * Represents the `rowHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowHidden: js.UndefOr[Boolean] = js.native
}

object SettableRowProperties {
  @scala.inline
  def apply(): SettableRowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableRowProperties]
  }
  @scala.inline
  implicit class SettableRowPropertiesOps[Self <: SettableRowProperties] (val x: Self) extends AnyVal {
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
    def setFormat(value: CellPropertiesFormatrowHe): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setRowHidden(value: Boolean): Self = this.set("rowHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHidden: Self = this.set("rowHidden", js.undefined)
  }
  
}

