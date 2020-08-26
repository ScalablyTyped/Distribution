package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookRangeFormat extends Entity {
  // Collection of border objects that apply to the overall range selected Read-only.
  var borders: js.UndefOr[js.Array[WorkbookRangeBorder]] = js.native
  // Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
  var columnWidth: js.UndefOr[Double] = js.native
  // Returns the fill object defined on the overall range. Read-only.
  var fill: js.UndefOr[WorkbookRangeFill] = js.native
  // Returns the font object defined on the overall range selected Read-only.
  var font: js.UndefOr[WorkbookRangeFont] = js.native
  /**
    * Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right,
    * Fill, Justify, CenterAcrossSelection, Distributed.
    */
  var horizontalAlignment: js.UndefOr[String] = js.native
  // Returns the format protection object for a range. Read-only.
  var protection: js.UndefOr[WorkbookFormatProtection] = js.native
  // Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
  var rowHeight: js.UndefOr[Double] = js.native
  /**
    * Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify,
    * Distributed.
    */
  var verticalAlignment: js.UndefOr[String] = js.native
  /**
    * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap
    * setting
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object WorkbookRangeFormat {
  @scala.inline
  def apply(): WorkbookRangeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeFormat]
  }
  @scala.inline
  implicit class WorkbookRangeFormatOps[Self <: WorkbookRangeFormat] (val x: Self) extends AnyVal {
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
    def setBordersVarargs(value: WorkbookRangeBorder*): Self = this.set("borders", js.Array(value :_*))
    @scala.inline
    def setBorders(value: js.Array[WorkbookRangeBorder]): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setFill(value: WorkbookRangeFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: WorkbookRangeFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setProtection(value: WorkbookFormatProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setWrapText(value: Boolean): Self = this.set("wrapText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapText: Self = this.set("wrapText", js.undefined)
  }
  
}

