package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies which properties to load on the `format.borders` object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesBorderLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to load on the `weight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Boolean] = js.native
}

object CellPropertiesBorderLoadOptions {
  @scala.inline
  def apply(): CellPropertiesBorderLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesBorderLoadOptions]
  }
  @scala.inline
  implicit class CellPropertiesBorderLoadOptionsOps[Self <: CellPropertiesBorderLoadOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTintAndShade(value: Boolean): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
    @scala.inline
    def setWeight(value: Boolean): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

