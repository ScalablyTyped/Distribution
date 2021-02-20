package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaSvgStyle extends StObject {
  
  var areaSvgStyle: js.UndefOr[js.Object] = js.native
  
  var dataAreaDefaults: js.UndefOr[SelectedInnerColor] = js.native
  
  var dataMarkerDefaults: js.UndefOr[BorderStyle] = js.native
  
  var hoverBehaviorDelay: js.UndefOr[Double] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var linkDefaults: js.UndefOr[ColorWidth] = js.native
}
object AreaSvgStyle {
  
  @scala.inline
  def apply(): AreaSvgStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSvgStyle]
  }
  
  @scala.inline
  implicit class AreaSvgStyleMutableBuilder[Self <: AreaSvgStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaSvgStyle(value: js.Object): Self = StObject.set(x, "areaSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaSvgStyleUndefined: Self = StObject.set(x, "areaSvgStyle", js.undefined)
    
    @scala.inline
    def setDataAreaDefaults(value: SelectedInnerColor): Self = StObject.set(x, "dataAreaDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAreaDefaultsUndefined: Self = StObject.set(x, "dataAreaDefaults", js.undefined)
    
    @scala.inline
    def setDataMarkerDefaults(value: BorderStyle): Self = StObject.set(x, "dataMarkerDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMarkerDefaultsUndefined: Self = StObject.set(x, "dataMarkerDefaults", js.undefined)
    
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorDelayUndefined: Self = StObject.set(x, "hoverBehaviorDelay", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLinkDefaults(value: ColorWidth): Self = StObject.set(x, "linkDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkDefaultsUndefined: Self = StObject.set(x, "linkDefaults", js.undefined)
  }
}
