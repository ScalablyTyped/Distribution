package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeFill.toJSON()". */
trait ShapeFillData extends js.Object {
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the fill type of the shape. Read-only. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeFillType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NoFill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PictureAndTexture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed
  ] = js.undefined
}

object ShapeFillData {
  @scala.inline
  def apply(
    foregroundColor: java.lang.String = null,
    transparency: scala.Int | scala.Double = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.ShapeFillType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NoFill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PictureAndTexture | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed = null
  ): ShapeFillData = {
    val __obj = js.Dynamic.literal()
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFillData]
  }
}

