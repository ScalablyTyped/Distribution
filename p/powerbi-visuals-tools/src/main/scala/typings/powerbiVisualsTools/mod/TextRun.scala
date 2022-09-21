package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.ISQExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRun extends StObject {
  
  var textStyle: js.UndefOr[TextRunStyle] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var value: String
  
  var valueExpr: js.UndefOr[ISQExpr] = js.undefined
}
object TextRun {
  
  inline def apply(value: String): TextRun = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRun]
  }
  
  extension [Self <: TextRun](x: Self) {
    
    inline def setTextStyle(value: TextRunStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueExpr(value: ISQExpr): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
