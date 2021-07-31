package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartColorScheme
import typings.officeJsPreview.officeJsPreviewStrings.ColorfulPalette1
import typings.officeJsPreview.officeJsPreviewStrings.ColorfulPalette2
import typings.officeJsPreview.officeJsPreviewStrings.ColorfulPalette3
import typings.officeJsPreview.officeJsPreviewStrings.ColorfulPalette4
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette1
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette10
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette11
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette12
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette13
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette2
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette3
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette4
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette5
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette6
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette7
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette8
import typings.officeJsPreview.officeJsPreviewStrings.MonochromaticPalette9
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartAreaFormat.toJSON()`. */
trait ChartAreaFormatData extends StObject {
  
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  
  /**
    *
    * Specifies the color scheme of the chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
  ] = js.undefined
  
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
  
  /**
    *
    * Specifies if the chart area of the chart has rounded corners.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
}
object ChartAreaFormatData {
  
  @scala.inline
  def apply(): ChartAreaFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAreaFormatData]
  }
  
  @scala.inline
  implicit class ChartAreaFormatDataMutableBuilder[Self <: ChartAreaFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColorScheme(
      value: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
    ): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setRoundedCorners(value: Boolean): Self = StObject.set(x, "roundedCorners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedCornersUndefined: Self = StObject.set(x, "roundedCorners", js.undefined)
  }
}
