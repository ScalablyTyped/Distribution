package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.PDFFontSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TFontFamilyTypes extends js.Object {
  
  var bold: js.UndefOr[PDFFontSource] = js.native
  
  var bolditalics: js.UndefOr[PDFFontSource] = js.native
  
  var italics: js.UndefOr[PDFFontSource] = js.native
  
  var normal: js.UndefOr[PDFFontSource] = js.native
}
object TFontFamilyTypes {
  
  @scala.inline
  def apply(): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFontFamilyTypes]
  }
  
  @scala.inline
  implicit class TFontFamilyTypesOps[Self <: TFontFamilyTypes] (val x: Self) extends AnyVal {
    
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
    def setBold(value: PDFFontSource): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setBolditalics(value: PDFFontSource): Self = this.set("bolditalics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBolditalics: Self = this.set("bolditalics", js.undefined)
    
    @scala.inline
    def setItalics(value: PDFFontSource): Self = this.set("italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalics: Self = this.set("italics", js.undefined)
    
    @scala.inline
    def setNormal(value: PDFFontSource): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormal: Self = this.set("normal", js.undefined)
  }
}
