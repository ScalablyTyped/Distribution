package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalDataBarPositiveFormat object, for use in `conditionalDataBarPositiveFormat.set({ ... })`. */
@js.native
trait ConditionalDataBarPositiveFormatUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    *
    * Specifies if the DataBar has a gradient.
    *
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: js.UndefOr[Boolean] = js.native
}

object ConditionalDataBarPositiveFormatUpdateData {
  @scala.inline
  def apply(): ConditionalDataBarPositiveFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatUpdateData]
  }
  @scala.inline
  implicit class ConditionalDataBarPositiveFormatUpdateDataOps[Self <: ConditionalDataBarPositiveFormatUpdateData] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setGradientFill(value: Boolean): Self = this.set("gradientFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientFill: Self = this.set("gradientFill", js.undefined)
  }
  
}

