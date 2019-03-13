package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeFill object, for use in "shapeFill.set({ ... })". */
trait ShapeFillUpdateData extends js.Object {
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns or sets the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var transparency: js.UndefOr[scala.Double] = js.undefined
}

object ShapeFillUpdateData {
  @scala.inline
  def apply(foregroundColor: java.lang.String = null, transparency: scala.Int | scala.Double = null): ShapeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFillUpdateData]
  }
}

