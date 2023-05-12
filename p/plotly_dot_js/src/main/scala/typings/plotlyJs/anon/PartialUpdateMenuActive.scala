package typings.plotlyJs.anon

import typings.plotlyJs.mod.Font
import typings.plotlyJs.mod.Padding
import typings.plotlyJs.mod.UpdateMenuButton
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.buttons
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.down
import typings.plotlyJs.plotlyJsStrings.dropdown
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.up
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.UpdateMenu> */
trait PartialUpdateMenuActive extends StObject {
  
  var active: js.UndefOr[Double] = js.undefined
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var buttons: js.UndefOr[js.Array[Partial[UpdateMenuButton]]] = js.undefined
  
  var direction: js.UndefOr[left | up | right | down] = js.undefined
  
  var font: js.UndefOr[Partial[Font]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pad: js.UndefOr[Partial[Padding]] = js.undefined
  
  var showactive: js.UndefOr[Boolean] = js.undefined
  
  var templateitemname: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[dropdown | buttons] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}
object PartialUpdateMenuActive {
  
  inline def apply(): PartialUpdateMenuActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateMenuActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialUpdateMenuActive] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setButtons(value: js.Array[Partial[UpdateMenuButton]]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: Partial[UpdateMenuButton]*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setDirection(value: left | up | right | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFont(value: Partial[Font]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPad(value: Partial[Padding]): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setShowactive(value: Boolean): Self = StObject.set(x, "showactive", value.asInstanceOf[js.Any])
    
    inline def setShowactiveUndefined: Self = StObject.set(x, "showactive", js.undefined)
    
    inline def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    inline def setTemplateitemnameUndefined: Self = StObject.set(x, "templateitemname", js.undefined)
    
    inline def setType(value: dropdown | buttons): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
  }
}
