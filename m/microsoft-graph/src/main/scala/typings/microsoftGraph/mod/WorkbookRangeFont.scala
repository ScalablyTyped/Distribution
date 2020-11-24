package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookRangeFont extends Entity {
  
  // Represents the bold status of font.
  var bold: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // HTML color code representation of the text color. E.g. #FF0000 represents Red.
  var color: js.UndefOr[NullableOption[String]] = js.native
  
  // Represents the italic status of the font.
  var italic: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Font name (e.g. 'Calibri')
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Font size.
  var size: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Type of underline applied to the font. The possible values are: None, Single, Double, SingleAccountant,
    * DoubleAccountant.
    */
  var underline: js.UndefOr[NullableOption[String]] = js.native
}
object WorkbookRangeFont {
  
  @scala.inline
  def apply(): WorkbookRangeFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeFont]
  }
  
  @scala.inline
  implicit class WorkbookRangeFontOps[Self <: WorkbookRangeFont] (val x: Self) extends AnyVal {
    
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
    def setBold(value: NullableOption[Boolean]): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setBoldNull: Self = this.set("bold", null)
    
    @scala.inline
    def setColor(value: NullableOption[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    
    @scala.inline
    def setItalic(value: NullableOption[Boolean]): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setItalicNull: Self = this.set("italic", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setSize(value: NullableOption[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
    
    @scala.inline
    def setUnderline(value: NullableOption[String]): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setUnderlineNull: Self = this.set("underline", null)
  }
}
