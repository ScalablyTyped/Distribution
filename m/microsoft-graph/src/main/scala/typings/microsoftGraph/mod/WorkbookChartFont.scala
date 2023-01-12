package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartFont
  extends StObject
     with Entity {
  
  // Represents the bold status of font.
  var bold: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // HTML color code representation of the text color. E.g. #FF0000 represents Red.
  var color: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents the italic status of the font.
  var italic: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Font name (e.g. 'Calibri')
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Size of the font (e.g. 11)
  var size: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Type of underline applied to the font. The possible values are: None, Single.
  var underline: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkbookChartFont {
  
  inline def apply(): WorkbookChartFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartFont]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookChartFont] (val x: Self) extends AnyVal {
    
    inline def setBold(value: NullableOption[Boolean]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldNull: Self = StObject.set(x, "bold", null)
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItalic(value: NullableOption[Boolean]): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicNull: Self = StObject.set(x, "italic", null)
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnderline(value: NullableOption[String]): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineNull: Self = StObject.set(x, "underline", null)
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
