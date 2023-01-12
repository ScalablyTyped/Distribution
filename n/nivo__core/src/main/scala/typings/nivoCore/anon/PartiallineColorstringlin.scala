package typings.nivoCore.anon

import typings.nivoCore.nivoCoreInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  lineColor :string,   lineStrokeWidth :number,   textColor :string,   fontSize :string | 0,   text :std.Partial<react.react.CSSProperties>}> */
trait PartiallineColorstringlin extends StObject {
  
  var fontSize: js.UndefOr[String | `0`] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineStrokeWidth: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[PartialCSSProperties] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object PartiallineColorstringlin {
  
  inline def apply(): PartiallineColorstringlin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallineColorstringlin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartiallineColorstringlin] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: String | `0`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineStrokeWidth(value: Double): Self = StObject.set(x, "lineStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setLineStrokeWidthUndefined: Self = StObject.set(x, "lineStrokeWidth", js.undefined)
    
    inline def setText(value: PartialCSSProperties): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
