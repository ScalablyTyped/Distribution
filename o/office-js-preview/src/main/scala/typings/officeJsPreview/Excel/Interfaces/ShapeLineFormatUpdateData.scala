package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ShapeLineDashStyle
import typings.officeJsPreview.Excel.ShapeLineStyle
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashDot
import typings.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.LongDash
import typings.officeJsPreview.officeJsPreviewStrings.LongDashDot
import typings.officeJsPreview.officeJsPreviewStrings.LongDashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.RoundDot
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.Solid
import typings.officeJsPreview.officeJsPreviewStrings.SquareDot
import typings.officeJsPreview.officeJsPreviewStrings.SystemDash
import typings.officeJsPreview.officeJsPreviewStrings.SystemDashDot
import typings.officeJsPreview.officeJsPreviewStrings.SystemDot
import typings.officeJsPreview.officeJsPreviewStrings.ThickBetweenThin
import typings.officeJsPreview.officeJsPreviewStrings.ThickThin
import typings.officeJsPreview.officeJsPreviewStrings.ThinThick
import typings.officeJsPreview.officeJsPreviewStrings.ThinThin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeLineFormat object, for use in `shapeLineFormat.set({ ... })`. */
@js.native
trait ShapeLineFormatUpdateData extends js.Object {
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent dash styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dashStyle: js.UndefOr[
    ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
  ] = js.native
  /**
    *
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin] = js.native
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if the line formatting of a shape element is visible. Returns null when the shape has inconsistent visibilities.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the weight of the line, in points. Returns null when the line is not visible or there are inconsistent line weights.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[Double] = js.native
}

object ShapeLineFormatUpdateData {
  @scala.inline
  def apply(): ShapeLineFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeLineFormatUpdateData]
  }
  @scala.inline
  implicit class ShapeLineFormatUpdateDataOps[Self <: ShapeLineFormatUpdateData] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashStyle(
      value: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
    ): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setStyle(value: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTransparency(value: Double): Self = this.set("transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

