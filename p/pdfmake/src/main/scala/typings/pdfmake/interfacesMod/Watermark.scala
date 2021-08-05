package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watermark extends StObject {
  
  /** angle of text rotation (minimal version: 0.1.60) */
  var angle: js.UndefOr[Double] = js.undefined
  
  /** bold style of text */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /** color of text */
  var color: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  /** own font size of text (ideal size is calculated automatically) (minimal version: 0.1.60) */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /** italics style of text */
  var italics: js.UndefOr[Boolean] = js.undefined
  
  /** opacity of text */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** watermark text */
  var text: String
}
object Watermark {
  
  inline def apply(text: String): Watermark = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watermark]
  }
  
  extension [Self <: Watermark](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
