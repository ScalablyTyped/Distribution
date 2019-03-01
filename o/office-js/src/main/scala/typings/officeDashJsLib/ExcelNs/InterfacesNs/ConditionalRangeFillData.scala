package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "conditionalRangeFill.toJSON()". */
trait ConditionalRangeFillData extends js.Object {
  /**
    *
    * HTML color code representing the color of the fill, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object ConditionalRangeFillData {
  @scala.inline
  def apply(color: java.lang.String = null): ConditionalRangeFillData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ConditionalRangeFillData]
  }
}

