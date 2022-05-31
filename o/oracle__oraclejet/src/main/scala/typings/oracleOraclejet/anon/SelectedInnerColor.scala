package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedInnerColor extends StObject {
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var hoverColor: js.UndefOr[String] = js.undefined
  
  var selectedInnerColor: js.UndefOr[String] = js.undefined
  
  var selectedOuterColor: js.UndefOr[String] = js.undefined
}
object SelectedInnerColor {
  
  inline def apply(): SelectedInnerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedInnerColor]
  }
  
  extension [Self <: SelectedInnerColor](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    inline def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedInnerColorUndefined: Self = StObject.set(x, "selectedInnerColor", js.undefined)
    
    inline def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedOuterColorUndefined: Self = StObject.set(x, "selectedOuterColor", js.undefined)
  }
}
