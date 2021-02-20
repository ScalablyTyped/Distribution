package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelector> */
@js.native
trait PartialRangeSelectorActivecolor extends StObject {
  
  var activecolor: js.UndefOr[String] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var bordercolor: js.UndefOr[String] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var buttons: js.UndefOr[js.Array[PartialRangeSelectorButto]] = js.native
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
}
object PartialRangeSelectorActivecolor {
  
  @scala.inline
  def apply(): PartialRangeSelectorActivecolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRangeSelectorActivecolor]
  }
  
  @scala.inline
  implicit class PartialRangeSelectorActivecolorMutableBuilder[Self <: PartialRangeSelectorActivecolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivecolor(value: String): Self = StObject.set(x, "activecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivecolorUndefined: Self = StObject.set(x, "activecolor", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    @scala.inline
    def setButtons(value: js.Array[PartialRangeSelectorButto]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: PartialRangeSelectorButto*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
  }
}
