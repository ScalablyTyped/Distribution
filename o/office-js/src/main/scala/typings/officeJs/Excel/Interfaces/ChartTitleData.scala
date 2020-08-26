package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartTextHorizontalAlignment
import typings.officeJs.Excel.ChartTextVerticalAlignment
import typings.officeJs.Excel.ChartTitlePosition
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Distributed
import typings.officeJs.officeJsStrings.Justify
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartTitle.toJSON()`. */
@js.native
trait ChartTitleData extends js.Object {
  /**
    *
    * Represents the formatting of a chart title, which includes fill and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartTitleFormatData] = js.native
  /**
    *
    * Returns the height, in points, of the chart title. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the horizontal alignment for chart title.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.native
  /**
    *
    * Specifies the distance, in points, from the left edge of chart title to the left edge of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if the chart title will overlay the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the position of chart title. See Excel.ChartTitlePosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[ChartTitlePosition | Automatic | Top | Bottom | Left | Right] = js.native
  /**
    *
    * Represents a boolean value that determines if the chart title has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the chart's title text.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[String] = js.native
  /**
    *
    * Specifies the angle to which the text is oriented for the chart title. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the distance, in points, from the top edge of chart title to the top of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the vertical alignment of chart title. See Excel.ChartTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.native
  /**
    *
    * Specifies if the chart title is visibile.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the width, in points, of the chart title. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.native
}

object ChartTitleData {
  @scala.inline
  def apply(): ChartTitleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTitleData]
  }
  @scala.inline
  implicit class ChartTitleDataOps[Self <: ChartTitleData] (val x: Self) extends AnyVal {
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
    def setFormat(value: ChartTitleFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPosition(value: ChartTitlePosition | Automatic | Top | Bottom | Left | Right): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowShadow(value: Boolean): Self = this.set("showShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowShadow: Self = this.set("showShadow", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextOrientation(value: Double): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

