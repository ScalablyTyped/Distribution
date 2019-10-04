package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.ConditionalColorScaleCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ColorScaleConditionalFormat object, for use in `colorScaleConditionalFormat.set({ ... })`. */
trait ColorScaleConditionalFormatUpdateData extends js.Object {
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[ConditionalColorScaleCriteria] = js.undefined
}

object ColorScaleConditionalFormatUpdateData {
  @scala.inline
  def apply(criteria: ConditionalColorScaleCriteria = null): ColorScaleConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    __obj.asInstanceOf[ColorScaleConditionalFormatUpdateData]
  }
}

