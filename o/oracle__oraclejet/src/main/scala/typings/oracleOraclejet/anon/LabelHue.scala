package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelHue extends StObject {
  
  var labelHue: js.UndefOr[String] = js.native
  
  var labelOpacity: js.UndefOr[String] = js.native
  
  var labelSatLum: js.UndefOr[String] = js.native
  
  var labelThumbDesc: js.UndefOr[String] = js.native
}
object LabelHue {
  
  @scala.inline
  def apply(): LabelHue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelHue]
  }
  
  @scala.inline
  implicit class LabelHueMutableBuilder[Self <: LabelHue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelHue(value: String): Self = StObject.set(x, "labelHue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHueUndefined: Self = StObject.set(x, "labelHue", js.undefined)
    
    @scala.inline
    def setLabelOpacity(value: String): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
    
    @scala.inline
    def setLabelSatLum(value: String): Self = StObject.set(x, "labelSatLum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSatLumUndefined: Self = StObject.set(x, "labelSatLum", js.undefined)
    
    @scala.inline
    def setLabelThumbDesc(value: String): Self = StObject.set(x, "labelThumbDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelThumbDescUndefined: Self = StObject.set(x, "labelThumbDesc", js.undefined)
  }
}
