package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelHue extends StObject {
  
  var labelHue: js.UndefOr[String] = js.undefined
  
  var labelOpacity: js.UndefOr[String] = js.undefined
  
  var labelSatLum: js.UndefOr[String] = js.undefined
  
  var labelThumbDesc: js.UndefOr[String] = js.undefined
}
object LabelHue {
  
  inline def apply(): LabelHue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelHue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelHue] (val x: Self) extends AnyVal {
    
    inline def setLabelHue(value: String): Self = StObject.set(x, "labelHue", value.asInstanceOf[js.Any])
    
    inline def setLabelHueUndefined: Self = StObject.set(x, "labelHue", js.undefined)
    
    inline def setLabelOpacity(value: String): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
    
    inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
    
    inline def setLabelSatLum(value: String): Self = StObject.set(x, "labelSatLum", value.asInstanceOf[js.Any])
    
    inline def setLabelSatLumUndefined: Self = StObject.set(x, "labelSatLum", js.undefined)
    
    inline def setLabelThumbDesc(value: String): Self = StObject.set(x, "labelThumbDesc", value.asInstanceOf[js.Any])
    
    inline def setLabelThumbDescUndefined: Self = StObject.set(x, "labelThumbDesc", js.undefined)
  }
}
