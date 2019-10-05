package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ShapeFillType
import typings.officeDashJs.officeDashJsStrings.Gradient
import typings.officeDashJs.officeDashJsStrings.Mixed
import typings.officeDashJs.officeDashJsStrings.NoFill
import typings.officeDashJs.officeDashJsStrings.Pattern
import typings.officeDashJs.officeDashJsStrings.PictureAndTexture
import typings.officeDashJs.officeDashJsStrings.Solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `shapeFill.toJSON()`. */
trait ShapeFillData extends js.Object {
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns or sets the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns the fill type of the shape. Read-only. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed] = js.undefined
}

object ShapeFillData {
  @scala.inline
  def apply(
    foregroundColor: String = null,
    transparency: Int | Double = null,
    `type`: ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | Mixed = null
  ): ShapeFillData = {
    val __obj = js.Dynamic.literal()
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFillData]
  }
}

