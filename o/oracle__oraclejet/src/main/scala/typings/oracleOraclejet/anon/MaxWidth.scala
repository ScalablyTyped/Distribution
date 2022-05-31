package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWidth[K2, D2] extends StObject {
  
  var label: js.UndefOr[`7`[K2, D2]] = js.undefined
  
  var maxWidth: js.UndefOr[String] = js.undefined
  
  var rendered: js.UndefOr[on | off] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object MaxWidth {
  
  inline def apply[K2, D2](): MaxWidth[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth[K2, D2]]
  }
  
  extension [Self <: MaxWidth[?, ?], K2, D2](x: Self & (MaxWidth[K2, D2])) {
    
    inline def setLabel(value: `7`[K2, D2]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setRendered(value: on | off): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
