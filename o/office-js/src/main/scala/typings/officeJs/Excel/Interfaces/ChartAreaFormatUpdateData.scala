package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartColorScheme
import typings.officeJs.officeJsStrings.ColorfulPalette1
import typings.officeJs.officeJsStrings.ColorfulPalette2
import typings.officeJs.officeJsStrings.ColorfulPalette3
import typings.officeJs.officeJsStrings.ColorfulPalette4
import typings.officeJs.officeJsStrings.MonochromaticPalette1
import typings.officeJs.officeJsStrings.MonochromaticPalette10
import typings.officeJs.officeJsStrings.MonochromaticPalette11
import typings.officeJs.officeJsStrings.MonochromaticPalette12
import typings.officeJs.officeJsStrings.MonochromaticPalette13
import typings.officeJs.officeJsStrings.MonochromaticPalette2
import typings.officeJs.officeJsStrings.MonochromaticPalette3
import typings.officeJs.officeJsStrings.MonochromaticPalette4
import typings.officeJs.officeJsStrings.MonochromaticPalette5
import typings.officeJs.officeJsStrings.MonochromaticPalette6
import typings.officeJs.officeJsStrings.MonochromaticPalette7
import typings.officeJs.officeJsStrings.MonochromaticPalette8
import typings.officeJs.officeJsStrings.MonochromaticPalette9
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAreaFormat object, for use in `chartAreaFormat.set({ ... })`. */
@js.native
trait ChartAreaFormatUpdateData extends js.Object {
  
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.native
  
  /**
    *
    * Specifies the color scheme of the chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
  ] = js.native
  
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.native
  
  /**
    *
    * Specifies if the chart area of the chart has rounded corners.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.native
}
object ChartAreaFormatUpdateData {
  
  @scala.inline
  def apply(): ChartAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAreaFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartAreaFormatUpdateDataOps[Self <: ChartAreaFormatUpdateData] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ChartBorderUpdateData): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColorScheme(
      value: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
    ): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    
    @scala.inline
    def setFont(value: ChartFontUpdateData): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setRoundedCorners(value: Boolean): Self = this.set("roundedCorners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundedCorners: Self = this.set("roundedCorners", js.undefined)
  }
}
