package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartUnderlineStyle
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartFont object, for use in `chartFont.set({ ... })`. */
trait ChartFontUpdateData extends StObject {
  
  /**
    * Represents the bold status of font.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the italic status of the font.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Font name (e.g., "Calibri")
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Size of the font (e.g., 11)
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of underline applied to the font. See `Excel.ChartUnderlineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var underline: js.UndefOr[ChartUnderlineStyle | None | Single] = js.undefined
}
object ChartFontUpdateData {
  
  inline def apply(): ChartFontUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFontUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartFontUpdateData] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnderline(value: ChartUnderlineStyle | None | Single): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
