package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.PDFFontSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TFontFamilyTypes extends StObject {
  
  var bold: js.UndefOr[PDFFontSource] = js.undefined
  
  var bolditalics: js.UndefOr[PDFFontSource] = js.undefined
  
  var italics: js.UndefOr[PDFFontSource] = js.undefined
  
  var normal: js.UndefOr[PDFFontSource] = js.undefined
}
object TFontFamilyTypes {
  
  @scala.inline
  def apply(): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFontFamilyTypes]
  }
  
  @scala.inline
  implicit class TFontFamilyTypesMutableBuilder[Self <: TFontFamilyTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: PDFFontSource): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setBolditalics(value: PDFFontSource): Self = StObject.set(x, "bolditalics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBolditalicsUndefined: Self = StObject.set(x, "bolditalics", js.undefined)
    
    @scala.inline
    def setItalics(value: PDFFontSource): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    @scala.inline
    def setNormal(value: PDFFontSource): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
  }
}
