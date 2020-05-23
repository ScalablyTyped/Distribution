package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ShapeFillType
import typings.officeJs.officeJsStrings.Gradient
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.NoFill
import typings.officeJs.officeJsStrings.Pattern
import typings.officeJs.officeJsStrings.PictureAndTexture
import typings.officeJs.officeJsStrings.Solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shapeFill.toJSON()`. */
trait ShapeFillData extends js.Object {
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the fill type of the shape. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed] = js.undefined
}

object ShapeFillData {
  @scala.inline
  def apply(
    foregroundColor: String = null,
    transparency: js.UndefOr[Double] = js.undefined,
    `type`: ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed = null
  ): ShapeFillData = {
    val __obj = js.Dynamic.literal()
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFillData]
  }
}

