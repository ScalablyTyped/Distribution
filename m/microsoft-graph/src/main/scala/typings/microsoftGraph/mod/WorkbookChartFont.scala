package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartFont extends Entity {
  
  // Represents the bold status of font.
  var bold: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // HTML color code representation of the text color. E.g. #FF0000 represents Red.
  var color: js.UndefOr[NullableOption[String]] = js.native
  
  // Represents the italic status of the font.
  var italic: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Font name (e.g. 'Calibri')
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Size of the font (e.g. 11)
  var size: js.UndefOr[NullableOption[Double]] = js.native
  
  // Type of underline applied to the font. The possible values are: None, Single.
  var underline: js.UndefOr[NullableOption[String]] = js.native
}
object WorkbookChartFont {
  
  @scala.inline
  def apply(): WorkbookChartFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartFont]
  }
  
  @scala.inline
  implicit class WorkbookChartFontMutableBuilder[Self <: WorkbookChartFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: NullableOption[Boolean]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldNull: Self = StObject.set(x, "bold", null)
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setItalic(value: NullableOption[Boolean]): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicNull: Self = StObject.set(x, "italic", null)
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeNull: Self = StObject.set(x, "size", null)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUnderline(value: NullableOption[String]): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineNull: Self = StObject.set(x, "underline", null)
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
