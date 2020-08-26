package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi 1.11]
  */
@js.native
trait NumberFormatInfoLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberDecimalSeparator: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberGroupSeparator: js.UndefOr[Boolean] = js.native
}

object NumberFormatInfoLoadOptions {
  @scala.inline
  def apply(): NumberFormatInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatInfoLoadOptions]
  }
  @scala.inline
  implicit class NumberFormatInfoLoadOptionsOps[Self <: NumberFormatInfoLoadOptions] (val x: Self) extends AnyVal {
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
    def setNumberDecimalSeparator(value: Boolean): Self = this.set("numberDecimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberDecimalSeparator: Self = this.set("numberDecimalSeparator", js.undefined)
    @scala.inline
    def setNumberGroupSeparator(value: Boolean): Self = this.set("numberGroupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberGroupSeparator: Self = this.set("numberGroupSeparator", js.undefined)
  }
  
}

