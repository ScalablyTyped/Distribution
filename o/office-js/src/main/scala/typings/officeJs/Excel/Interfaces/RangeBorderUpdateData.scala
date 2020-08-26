package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.BorderLineStyle
import typings.officeJs.Excel.BorderWeight
import typings.officeJs.officeJsStrings.Continuous
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.Hairline
import typings.officeJs.officeJsStrings.Medium
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.SlantDashDot
import typings.officeJs.officeJsStrings.Thick
import typings.officeJs.officeJsStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeBorder object, for use in `rangeBorder.set({ ... })`. */
@js.native
trait RangeBorderUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.native
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.native
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.native
}

object RangeBorderUpdateData {
  @scala.inline
  def apply(): RangeBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBorderUpdateData]
  }
  @scala.inline
  implicit class RangeBorderUpdateDataOps[Self <: RangeBorderUpdateData] (val x: Self) extends AnyVal {
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
    def setStyle(
      value: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
    ): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTintAndShade(value: scala.Double): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
    @scala.inline
    def setWeight(value: BorderWeight | Hairline | Thin | Medium | Thick): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

