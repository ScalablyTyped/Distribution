package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
  *
  * [Api set: ExcelApi 1.11]
  */
@js.native
trait CultureInfoLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the culture name in the format languagecode2-country/regioncode2 (e.g., "zh-cn" or "en-us"). This is based on current system settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
    *
    * [Api set: ExcelApi 1.11]
    */
  var numberFormat: js.UndefOr[NumberFormatInfoLoadOptions] = js.native
}

object CultureInfoLoadOptions {
  @scala.inline
  def apply(): CultureInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CultureInfoLoadOptions]
  }
  @scala.inline
  implicit class CultureInfoLoadOptionsOps[Self <: CultureInfoLoadOptions] (val x: Self) extends AnyVal {
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
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumberFormat(value: NumberFormatInfoLoadOptions): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
  }
  
}

