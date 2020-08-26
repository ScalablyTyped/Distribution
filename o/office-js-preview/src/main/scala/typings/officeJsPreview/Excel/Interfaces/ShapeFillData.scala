package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ShapeFillType
import typings.officeJsPreview.officeJsPreviewStrings.Gradient
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.NoFill
import typings.officeJsPreview.officeJsPreviewStrings.Pattern
import typings.officeJsPreview.officeJsPreviewStrings.PictureAndTexture
import typings.officeJsPreview.officeJsPreviewStrings.Solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shapeFill.toJSON()`. */
@js.native
trait ShapeFillData extends js.Object {
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: js.UndefOr[String] = js.native
  /**
    *
    * Specifies the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.native
  /**
    *
    * Returns the fill type of the shape. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed] = js.native
}

object ShapeFillData {
  @scala.inline
  def apply(): ShapeFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeFillData]
  }
  @scala.inline
  implicit class ShapeFillDataOps[Self <: ShapeFillData] (val x: Self) extends AnyVal {
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
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    @scala.inline
    def setTransparency(value: Double): Self = this.set("transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    @scala.inline
    def setType(value: ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

