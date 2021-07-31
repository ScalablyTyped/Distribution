package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the font attributes (font name, font size, color, etc.) for a chart object.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartFontLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the bold status of font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representation of the text color (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the italic status of the font.
    *
    * [Api set: ExcelApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Font name (e.g., "Calibri")
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Size of the font (e.g., 11)
    *
    * [Api set: ExcelApi 1.1]
    */
  var size: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Type of underline applied to the font. See Excel.ChartUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var underline: js.UndefOr[Boolean] = js.undefined
}
object ChartFontLoadOptions {
  
  @scala.inline
  def apply(): ChartFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFontLoadOptions]
  }
  
  @scala.inline
  implicit class ChartFontLoadOptionsMutableBuilder[Self <: ChartFontLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
