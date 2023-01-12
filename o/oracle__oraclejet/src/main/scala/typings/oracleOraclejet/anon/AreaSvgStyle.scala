package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaSvgStyle extends StObject {
  
  var areaSvgStyle: js.UndefOr[js.Object] = js.undefined
  
  var dataAreaDefaults: js.UndefOr[SelectedInnerColor] = js.undefined
  
  var dataMarkerDefaults: js.UndefOr[BorderStyle] = js.undefined
  
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  
  var linkDefaults: js.UndefOr[ColorWidth] = js.undefined
}
object AreaSvgStyle {
  
  inline def apply(): AreaSvgStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSvgStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaSvgStyle] (val x: Self) extends AnyVal {
    
    inline def setAreaSvgStyle(value: js.Object): Self = StObject.set(x, "areaSvgStyle", value.asInstanceOf[js.Any])
    
    inline def setAreaSvgStyleUndefined: Self = StObject.set(x, "areaSvgStyle", js.undefined)
    
    inline def setDataAreaDefaults(value: SelectedInnerColor): Self = StObject.set(x, "dataAreaDefaults", value.asInstanceOf[js.Any])
    
    inline def setDataAreaDefaultsUndefined: Self = StObject.set(x, "dataAreaDefaults", js.undefined)
    
    inline def setDataMarkerDefaults(value: BorderStyle): Self = StObject.set(x, "dataMarkerDefaults", value.asInstanceOf[js.Any])
    
    inline def setDataMarkerDefaultsUndefined: Self = StObject.set(x, "dataMarkerDefaults", js.undefined)
    
    inline def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelayUndefined: Self = StObject.set(x, "hoverBehaviorDelay", js.undefined)
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLinkDefaults(value: ColorWidth): Self = StObject.set(x, "linkDefaults", value.asInstanceOf[js.Any])
    
    inline def setLinkDefaultsUndefined: Self = StObject.set(x, "linkDefaults", js.undefined)
  }
}
