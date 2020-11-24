package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies which properties to load on the `format.font` object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFontLoadOptions extends js.Object {
  
  /**
    *
    * Specifies whether to load on the `bold` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `italic` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `name` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `size` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `strikethrough` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `subscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `superscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `underline` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[Boolean] = js.native
}
object CellPropertiesFontLoadOptions {
  
  @scala.inline
  def apply(): CellPropertiesFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFontLoadOptions]
  }
  
  @scala.inline
  implicit class CellPropertiesFontLoadOptionsOps[Self <: CellPropertiesFontLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    
    @scala.inline
    def setSubscript(value: Boolean): Self = this.set("subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscript: Self = this.set("subscript", js.undefined)
    
    @scala.inline
    def setSuperscript(value: Boolean): Self = this.set("superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperscript: Self = this.set("superscript", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Boolean): Self = this.set("tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintAndShade: Self = this.set("tintAndShade", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
