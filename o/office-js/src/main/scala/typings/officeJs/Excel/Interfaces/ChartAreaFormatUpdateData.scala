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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAreaFormat object, for use in `chartAreaFormat.set({ ... })`. */
trait ChartAreaFormatUpdateData extends StObject {
  
  /**
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  
  /**
    * Specifies the color scheme of the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
  ] = js.undefined
  
  /**
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
  
  /**
    * Specifies if the chart area of the chart has rounded corners.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
}
object ChartAreaFormatUpdateData {
  
  inline def apply(): ChartAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAreaFormatUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartAreaFormatUpdateData] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColorScheme(
      value: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
    ): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setRoundedCorners(value: Boolean): Self = StObject.set(x, "roundedCorners", value.asInstanceOf[js.Any])
    
    inline def setRoundedCornersUndefined: Self = StObject.set(x, "roundedCorners", js.undefined)
  }
}
