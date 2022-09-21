package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattingTypeDescriptor extends StObject {
  
  val alignment: js.UndefOr[Boolean] = js.undefined
  
  val altText: js.UndefOr[Boolean] = js.undefined
  
  val bubbleSize: js.UndefOr[Boolean] = js.undefined
  
  val color: js.UndefOr[Boolean] = js.undefined
  
  val fontFamily: js.UndefOr[Boolean] = js.undefined
  
  val fontSize: js.UndefOr[Boolean] = js.undefined
  
  val formatString: js.UndefOr[Boolean] = js.undefined
  
  val labelDensity: js.UndefOr[Boolean] = js.undefined
  
  val labelDisplayUnits: js.UndefOr[Boolean] = js.undefined
}
object FormattingTypeDescriptor {
  
  inline def apply(): FormattingTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormattingTypeDescriptor]
  }
  
  extension [Self <: FormattingTypeDescriptor](x: Self) {
    
    inline def setAlignment(value: Boolean): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAltText(value: Boolean): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBubbleSize(value: Boolean): Self = StObject.set(x, "bubbleSize", value.asInstanceOf[js.Any])
    
    inline def setBubbleSizeUndefined: Self = StObject.set(x, "bubbleSize", js.undefined)
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: Boolean): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Boolean): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFormatString(value: Boolean): Self = StObject.set(x, "formatString", value.asInstanceOf[js.Any])
    
    inline def setFormatStringUndefined: Self = StObject.set(x, "formatString", js.undefined)
    
    inline def setLabelDensity(value: Boolean): Self = StObject.set(x, "labelDensity", value.asInstanceOf[js.Any])
    
    inline def setLabelDensityUndefined: Self = StObject.set(x, "labelDensity", js.undefined)
    
    inline def setLabelDisplayUnits(value: Boolean): Self = StObject.set(x, "labelDisplayUnits", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUnitsUndefined: Self = StObject.set(x, "labelDisplayUnits", js.undefined)
  }
}
